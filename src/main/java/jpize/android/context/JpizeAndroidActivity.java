package jpize.android.context;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import jpize.android.context.input.AndroidKey;
import jpize.android.context.input.AndroidMods;
import jpize.context.Jpize;
import jpize.context.input.Action;
import jpize.context.input.Key;
import jpize.context.input.Mods;
import jpize.context.input.MouseBtn;

public class JpizeAndroidActivity extends Activity {

    private AndroidCallbacks callbacks;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final JpizeAndroidContext context = new JpizeAndroidContext(this);
        this.callbacks = (AndroidCallbacks) context.getCallbacks();

        // set view
        final AndroidGLSurfaceView glSurfaceView = new AndroidGLSurfaceView(this, context);

        glSurfaceView.setFocusable(true);
        glSurfaceView.setFocusableInTouchMode(true);
        glSurfaceView.requestFocus();

        glSurfaceView.setOnKeyListener(this::onKeyEvent);
        glSurfaceView.setOnTouchListener(this::onTouchEvent);
        glSurfaceView.setOnScrollChangeListener(this::onScrollChangeEvent);

        super.setContentView(glSurfaceView);

        Jpize.context = context;
        Jpize.input = context.getInput();
        Jpize.callbacks = callbacks;
        Jpize.window = context.getWindow();
        Jpize.allocator = new AndroidAllocator();
        Jpize.contextManager = new AndroidContextManager();
    }

    private boolean onTouchEvent(View view, MotionEvent event) {
        final int action = event.getActionMasked();
        final int pointerIndex = event.getActionIndex();
        final int pointerID = event.getPointerId(pointerIndex);

        final float x = event.getX(pointerIndex);
        final float y = event.getY(pointerIndex);
        callbacks.invokeCursorPos(pointerID, x, y);

        switch(action) {
            case MotionEvent.ACTION_DOWN,
                 MotionEvent.ACTION_POINTER_DOWN ->
                    callbacks.invokeMouseButton(pointerID, MouseBtn.LEFT, Action.PRESSED, new AndroidMods(0));

            case MotionEvent.ACTION_UP,
                 MotionEvent.ACTION_POINTER_UP ->
                    callbacks.invokeMouseButton(pointerID, MouseBtn.LEFT, Action.UP, new AndroidMods(0));
        }

        return true;
    }

    private void onScrollChangeEvent(View view, int newScrollX, int newScrollY, int oldScrollX, int oldScrollY) {
        final int scrollX = (newScrollX - oldScrollX);
        final int scrollY = (newScrollY - oldScrollY);
        callbacks.invokeScroll(scrollX, scrollY);
    }

    private boolean onKeyEvent(View view, int keycode, KeyEvent event) {
        boolean isLongPress = (event.getFlags() & KeyEvent.FLAG_LONG_PRESS) != 0;

        Log.i("JPIZE", "onKeyEvent: " + AndroidKey.byAndroidKeycode(event.getKeyCode()) + " " + event.getAction() + " " + event.getRepeatCount() + " " + isLongPress + " " + event.isCanceled());
        final Key key = AndroidKey.byAndroidKeycode(event.getKeyCode());
        if(key == null)
            return false;

        final int rawAction = event.getAction();
        if(rawAction == KeyEvent.ACTION_DOWN && event.getRepeatCount() > 0)
            return false;

        final int scancode = event.getScanCode();
        final Mods mods = new AndroidMods(event.getModifiers());

        if(rawAction == KeyEvent.ACTION_DOWN) { // 0
            callbacks.invokeKey(key, scancode, Action.PRESSED, mods);
        }else if(rawAction == KeyEvent.ACTION_UP){ // 1
            callbacks.invokeKey(key, scancode, Action.UP, mods);
        }

        event.startTracking();

        //if (action == KeyEvent.ACTION_DOWN) {
        //    if (keyEvent.getRepeatCount() == 0) {
        //        mVoiceButtonDown = true;
        //        mVoiceButtonHandled = false;
        //    } else if (mVoiceButtonDown && !mVoiceButtonHandled && isLongPress) {
        //        mVoiceButtonHandled = true;
        //        startVoiceInput(needWakeLock);
        //    }
        //} else if (action == KeyEvent.ACTION_UP) {
        //    if (mVoiceButtonDown) {
        //        mVoiceButtonDown = false;
        //        if (!mVoiceButtonHandled && !keyEvent.isCanceled()) {
        //            // Resend the down then send this event through
        //            KeyEvent downEvent = KeyEvent.changeAction(keyEvent, KeyEvent.ACTION_DOWN);
        //            dispatchMediaKeyEventLocked(packageName, pid, uid, asSystemService,
        //                    downEvent, needWakeLock);
        //            dispatchMediaKeyEventLocked(packageName, pid, uid, asSystemService,
        //                    keyEvent, needWakeLock);
        //        }
        //    }
        //}

        return true;
    }


    // public boolean onKey(View view, int keycode, KeyEvent event) {
    //     synchronized (this) {
    //         KeyEvent eventt = null;

    //         if (event.getKeyCode() == android.view.KeyEvent.KEYCODE_UNKNOWN && event.getAction() == android.view.KeyEvent.ACTION_MULTIPLE) {
    //             String chars = event.getCharacters();
    //             for (int i = 0; i < chars.length(); i++) {
    //                 eventt = usedKeyEvents.obtain();
    //                 eventt.timeStamp = System.nanoTime();
    //                 eventt.keyCode = 0;
    //                 eventt.keyChar = chars.charAt(i);
    //                 eventt.type = KeyEvent.KEY_TYPED;
    //                 keyEvents.add(eventt);
    //             }
    //             return false;
    //         }

    //         char character = (char) event.getUnicodeChar();
    //         // Android doesn't report a unicode char for backspace. hrm...
    //         if (keycode == 67) character = '\b';
    //         if (event.getKeyCode() < 0 || event.getKeyCode() > Keys.MAX_KEYCODE) {
    //             return false;
    //         }

    //         switch (event.getAction()) {
    //             case android.view.KeyEvent.ACTION_DOWN:
    //                 eventt = usedKeyEvents.obtain();
    //                 eventt.timeStamp = System.nanoTime();
    //                 eventt.keyChar = 0;
    //                 eventt.keyCode = event.getKeyCode();
    //                 eventt.type = KeyEvent.KEY_DOWN;

    //                 // Xperia hack for circle key. gah...
    //                 if (keycode == android.view.KeyEvent.KEYCODE_BACK && event.isAltPressed()) {
    //                     keycode = Keys.BUTTON_CIRCLE;
    //                     eventt.keyCode = keycode;
    //                 }

    //                 keyEvents.add(eventt);
    //                 if (!pressedKeys[eventt.keyCode]) {
    //                     pressedKeyCount++;
    //                     pressedKeys[eventt.keyCode] = true;
    //                 }
    //                 break;
    //             case android.view.KeyEvent.ACTION_UP:
    //                 long timeStamp = System.nanoTime();
    //                 eventt = usedKeyEvents.obtain();
    //                 eventt.timeStamp = timeStamp;
    //                 eventt.keyChar = 0;
    //                 eventt.keyCode = event.getKeyCode();
    //                 eventt.type = KeyEvent.KEY_UP;
    //                 // Xperia hack for circle key. gah...
    //                 if (keycode == android.view.KeyEvent.KEYCODE_BACK && event.isAltPressed()) {
    //                     keycode = Keys.BUTTON_CIRCLE;
    //                     eventt.keyCode = keycode;
    //                 }
    //                 keyEvents.add(eventt);

    //                 eventt = usedKeyEvents.obtain();
    //                 eventt.timeStamp = timeStamp;
    //                 eventt.keyChar = character;
    //                 eventt.keyCode = 0;
    //                 eventt.type = KeyEvent.KEY_TYPED;
    //                 keyEvents.add(eventt);

    //                 if (keycode == Keys.BUTTON_CIRCLE) {
    //                     if (pressedKeys[Keys.BUTTON_CIRCLE]) {
    //                         pressedKeyCount--;
    //                         pressedKeys[Keys.BUTTON_CIRCLE] = false;
    //                     }
    //                 } else {
    //                     if (pressedKeys[event.getKeyCode()]) {
    //                         pressedKeyCount--;
    //                         pressedKeys[event.getKeyCode()] = false;
    //                     }
    //                 }
    //         }
    //         app.getGraphics().requestRendering();
    //     }

    //     return isCatchKey(keycode);
    // }

}
