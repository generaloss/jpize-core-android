package jpize.android.context;

import android.app.Activity;
import jpize.context.callback.*;

public class AndroidCallbacks extends AbstractCallbacks {

    private Activity activity;

    public AndroidCallbacks(Activity activity) {
        this.activity = activity;
    }

    @Override
    public void removeDrop(DropCallback callback) {
        super.removeDrop(callback);
    }

    @Override
    public void addDrop(DropCallback callback) {
        super.addDrop(callback);
    }

    @Override
    public void removePreeditCandidate(PreeditCandidateCallback callback) {
        super.removePreeditCandidate(callback);
    }

    @Override
    public void addPreeditCandidate(PreeditCandidateCallback callback) {
        super.addPreeditCandidate(callback);
    }

    @Override
    public void removePreedit(PreeditCallback callback) {
        super.removePreedit(callback);
    }

    @Override
    public void addPreedit(PreeditCallback callback) {
        super.addPreedit(callback);
    }

    @Override
    public void removeChar(CharCallback callback) {
        super.removeChar(callback);
    }

    @Override
    public void addChar(CharCallback callback) {
        super.addChar(callback);
    }

    @Override
    public void removeKey(KeyCallback callback) {
        super.removeKey(callback);
    }

    @Override
    public void addKey(KeyCallback callback) {
        super.addKey(callback);
    }

    @Override
    public void removeCharMods(CharModsCallback callback) {
        super.removeCharMods(callback);
    }

    @Override
    public void addCharMods(CharModsCallback callback) {
        super.addCharMods(callback);
    }

    @Override
    public void removeScroll(ScrollCallback callback) {
        super.removeScroll(callback);
    }

    @Override
    public void addScroll(ScrollCallback callback) {
        super.addScroll(callback);
    }

    @Override
    public void removeMouseButton(MouseButtonCallback callback) {
        super.removeMouseButton(callback);
    }

    @Override
    public void addMouseButton(MouseButtonCallback callback) {
        super.addMouseButton(callback);
    }

    @Override
    public void removeCursorEnter(CursorEnterCallback callback) {
        super.removeCursorEnter(callback);
    }

    @Override
    public void addCursorEnter(CursorEnterCallback callback) {
        super.addCursorEnter(callback);
    }

    @Override
    public void removeCursorPos(CursorPosCallback callback) {
        super.removeCursorPos(callback);
    }

    @Override
    public void addCursorPos(CursorPosCallback callback) {
        super.addCursorPos(callback);
    }

    @Override
    public void removeFramebufferSize(FramebufferSizeCallback callback) {
        super.removeFramebufferSize(callback);
    }

    @Override
    public void addFramebufferSize(FramebufferSizeCallback callback) {
        super.addFramebufferSize(callback);
    }

    @Override
    public void removeWindowSize(WindowSizeCallback callback) {
        super.removeWindowSize(callback);
    }

    @Override
    public void addWindowSize(WindowSizeCallback callback) {
        super.addWindowSize(callback);
    }

    @Override
    public void removeWindowRefresh(WindowRefreshCallback callback) {
        super.removeWindowRefresh(callback);
    }

    @Override
    public void addWindowRefresh(WindowRefreshCallback callback) {
        super.addWindowRefresh(callback);
    }

    @Override
    public void removeWindowPos(WindowPosCallback callback) {
        super.removeWindowPos(callback);
    }

    @Override
    public void addWindowPos(WindowPosCallback callback) {
        super.addWindowPos(callback);
    }

    @Override
    public void removeWindowMaximize(WindowMaximizeCallback callback) {
        super.removeWindowMaximize(callback);
    }

    @Override
    public void addWindowMaximize(WindowMaximizeCallback callback) {
        super.addWindowMaximize(callback);
    }

    @Override
    public void removeWindowIconify(WindowIconifyCallback callback) {
        super.removeWindowIconify(callback);
    }

    @Override
    public void addWindowIconify(WindowIconifyCallback callback) {
        super.addWindowIconify(callback);
    }

    @Override
    public void removeWindowFocus(WindowFocusCallback callback) {
        super.removeWindowFocus(callback);
    }

    @Override
    public void addWindowFocus(WindowFocusCallback callback) {
        super.addWindowFocus(callback);
    }

    @Override
    public void removeContentScale(ContentScaleCallback callback) {
        super.removeContentScale(callback);
    }

    @Override
    public void addContentScale(ContentScaleCallback callback) {
        super.addContentScale(callback);
    }

    @Override
    public void removeExitClose(ExitCallback callback) {
        super.removeExitClose(callback);
    }

    @Override
    public void addExitCallback(ExitCallback callback) {
        super.addExitCallback(callback);
    }

}
