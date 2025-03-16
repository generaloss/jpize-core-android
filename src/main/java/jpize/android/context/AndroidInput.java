package jpize.android.context;

import jpize.context.IWindow;
import jpize.context.input.*;
import jpize.util.math.geometry.Recti;
import jpize.util.math.vector.Vec2f;

import java.nio.IntBuffer;

public class AndroidInput extends AbstractInput {

    public AndroidInput(IWindow window) {
        super(window);
    }

    @Override
    public Action getKey(Key key) {
        return Action.NONE;
    }

    @Override
    public int getKeyScancode(Key key) {
        return -1;
    }

    @Override
    public String getKeyName(Key key) {
        return "None";
    }

    @Override
    public boolean isKeyDown(Key key) {
        return false;
    }

    @Override
    public boolean isKeyPressed(Key key) {
        return false;
    }

    @Override
    public boolean isKeyUp(Key key) {
        return false;
    }

    @Override
    public Action getMouseButton(int index, MouseBtn button) {
        return Action.NONE;
    }

    @Override
    public boolean isButtonDown(int index, MouseBtn button) {
        return false;
    }

    @Override
    public boolean isButtonPressed(int index, MouseBtn button) {
        return false;
    }

    @Override
    public boolean isButtonUp(int index, MouseBtn button) {
        return false;
    }

    @Override
    public float getScrollX() {
        return 0;
    }

    @Override
    public float getScrollY() {
        return 0;
    }

    @Override
    public String getClipboardString() {
        return "";
    }

    @Override
    public void setClipboardString(CharSequence string) { }

    @Override
    public CursorMode getCursorMode() {
        return CursorMode.NORMAL;
    }

    @Override
    public boolean getStickyKeys() {
        return false;
    }

    @Override
    public boolean getStickyMouseButtons() {
        return false;
    }

    @Override
    public boolean getLockKeyMods() {
        return false;
    }

    @Override
    public boolean getRawMouseMotion() {
        return false;
    }

    @Override
    public boolean isRawMouseMotionSupported() {
        return false;
    }

    @Override
    public void setCursorMode(CursorMode value) { }

    @Override
    public void setStickyKeys(boolean value) { }

    @Override
    public void setStickyMouseButtons(boolean value) { }

    @Override
    public void setLockKeyMods(boolean value) { }

    @Override
    public void setRawMouseMotion(boolean value) { }

    @Override
    public Vec2f getCursorNativePos(Vec2f dst) {
        return new Vec2f(0, 0);
    }

    @Override
    public Vec2f getCursorPos(Vec2f dst) {
        return new Vec2f(0, 0);
    }

    @Override
    public float getCursorX() {
        return 0;
    }

    @Override
    public float getCursorNativeY() {
        return 0;
    }

    @Override
    public void setCursorPos(double x, double y) { }

    @Override
    public Recti getPreeditCursorRectangle() {
        return new Recti(0, 0, 0, 0);
    }

    @Override
    public void setPreeditCursorRectangle(int x, int y, int width, int height) { }

    @Override
    public IntBuffer getPreeditCandidate(int index) {
        return IntBuffer.allocate(0);
    }

    @Override
    public void resetPreeditText() { }

}
