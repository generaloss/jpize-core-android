package jpize.android.context;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
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

        final AndroidGLSurfaceView glSurfaceView = new AndroidGLSurfaceView(this, context);
        super.setContentView(glSurfaceView);

        Jpize.context = context;
        Jpize.input = context.getInput();
        Jpize.callbacks = callbacks;
        Jpize.window = context.getWindow();
        Jpize.allocator = new AndroidAllocator();
        Jpize.contextManager = new AndroidContextManager();
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
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

    @Override
    public boolean onKeyMultiple(int keycode, int repeatCount, KeyEvent event) {
        Log.i("JPIZE", "onKeyMultiple: " + keycode + " = " + event.getKeyCode() + " = " + AndroidKey.byAndroidKeycode(event.getKeyCode()));
        final Key key = AndroidKey.byAndroidKeycode(keycode);
        if(key == null)
            return false;

        final int scancode = event.getScanCode();
        final Mods mods = new AndroidMods(event.getModifiers());

        final int rawAction = event.getAction();
        if(rawAction == KeyEvent.ACTION_DOWN) { // 0
            callbacks.invokeKey(key, scancode, Action.PRESSED, mods);
        }else if(rawAction == KeyEvent.ACTION_UP){ // 1
            callbacks.invokeKey(key, scancode, Action.UP, mods);
        }
        return true;
    }

    @Override
    public boolean onKeyDown(int keycode, KeyEvent event) {
        Log.i("JPIZE", "onKeyDown: " + AndroidKey.byAndroidKeycode(keycode) + " is " + event.getAction());
        return true;
    }

    @Override
    public boolean onKeyUp(int keycode, KeyEvent event) {
        Log.i("JPIZE", "onKeyUp: " + AndroidKey.byAndroidKeycode(keycode) + " is " + event.getAction());
        return true;
    }



}
