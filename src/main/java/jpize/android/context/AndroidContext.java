package jpize.android.context;

import jpize.context.Context;

public class AndroidContext extends Context {

    public AndroidContext(AndroidWindow window) {
        super(window);
    }

    public void exitP() {
        super.exit();
    }

    public void loopP() {
        super.loop();
    }

    public void resizeP(int width, int height) {
        super.resize(width, height);
    }

    public void initP() {
        super.init();
    }

}
