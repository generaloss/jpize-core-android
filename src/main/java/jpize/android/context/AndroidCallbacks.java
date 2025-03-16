package jpize.android.context;

import android.app.Activity;
import jpize.context.callback.*;

public class AndroidCallbacks extends AbstractCallbacks {

    private final Activity activity;

    public AndroidCallbacks(Activity activity) {
        this.activity = activity;
    }

    @Override
    public void addContentScale(ContentScaleCallback callback) {
        super.addContentScale(callback);
    }

    @Override
    public void addWindowFocus(WindowFocusCallback callback) {
        super.addWindowFocus(callback);
    }

    @Override
    public void addWindowIconify(WindowIconifyCallback callback) {
        super.addWindowIconify(callback);
    }

    @Override
    public void addWindowMaximize(WindowMaximizeCallback callback) {
        super.addWindowMaximize(callback);
    }

    @Override
    public void addWindowPos(WindowPosCallback callback) {
        super.addWindowPos(callback);
    }

    @Override
    public void addWindowRefresh(Runnable callback) {
        super.addWindowRefresh(callback);
    }

    @Override
    public void addWindowSize(WindowSizeCallback callback) {
        super.addWindowSize(callback);
    }

    @Override
    public void addFramebufferSize(FramebufferSizeCallback callback) {
        super.addFramebufferSize(callback);
    }

    @Override
    public void addCursorPos(CursorPosCallback callback) {
        super.addCursorPos(callback);
    }

    @Override
    public void addCursorEnter(CursorEnterCallback callback) {
        super.addCursorEnter(callback);
    }

    @Override
    public void addMouseButton(MouseButtonCallback callback) {
        super.addMouseButton(callback);
    }

    @Override
    public void addScroll(ScrollCallback callback) {
        super.addScroll(callback);
    }

    @Override
    public void addCharMods(CharModsCallback callback) {
        super.addCharMods(callback);
    }

    @Override
    public void addKey(KeyCallback callback) {
        super.addKey(callback);
    }

    @Override
    public void addChar(CharCallback callback) {
        super.addChar(callback);
    }

    @Override
    public void addPreedit(PreeditCallback callback) {
        super.addPreedit(callback);
    }

    @Override
    public void addPreeditCandidate(PreeditCandidateCallback callback) {
        super.addPreeditCandidate(callback);
    }

    @Override
    public void addIMEStatus(Runnable callback) {
        super.addIMEStatus(callback);
    }

    @Override
    public void addDrop(DropCallback callback) {
        super.addDrop(callback);
    }

}
