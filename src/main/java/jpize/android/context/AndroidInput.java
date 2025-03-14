package jpize.android.context;

import jpize.context.IWindow;
import jpize.context.input.*;
import jpize.util.math.vector.Vec2f;

import java.awt.*;
import java.nio.IntBuffer;

public class AndroidInput extends AbstractInput {

    public AndroidInput(IWindow window) {
        super(window);
    }

    @Override
    public Action getKey(Key key) {
        return null;
    }

    @Override
    public int getKeyScancode(Key key) {
        return 0;
    }

    @Override
    public String getKeyName(Key key) {
        return "";
    }

    @Override
    public Action getMouseButton(MouseBtn button) {
        return null;
    }

    @Override
    public String getClipboardString() {
        return "";
    }

    @Override
    public void setClipboardString(CharSequence string) {

    }

    @Override
    public CursorMode getCursorMode() {
        return null;
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
    public void setCursorMode(CursorMode value) {

    }

    @Override
    public void setStickyKeys(boolean value) {

    }

    @Override
    public void setStickyMouseButtons(boolean value) {

    }

    @Override
    public void setLockKeyMods(boolean value) {

    }

    @Override
    public void setRawMouseMotion(boolean value) {

    }

    @Override
    public Vec2f getCursorNativePos(Vec2f dst) {
        return null;
    }

    @Override
    public Vec2f getCursorPos(Vec2f dst) {
        return null;
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
    public void setCursorPos(double x, double y) {

    }

    @Override
    public Rectangle getPreeditCursorRectangle() {
        return null;
    }

    @Override
    public void setPreeditCursorRectangle(int x, int y, int width, int height) {

    }

    @Override
    public IntBuffer getPreeditCandidate(int index) {
        return null;
    }

    @Override
    public void resetPreeditText() {

    }

}
