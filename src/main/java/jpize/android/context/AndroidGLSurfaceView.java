package jpize.android.context;

import android.app.Activity;
import android.opengl.GLSurfaceView;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

public class AndroidGLSurfaceView extends GLSurfaceView implements GLSurfaceView.Renderer {

    public AndroidGLSurfaceView(Activity activity) {
        super(activity);
        super.setEGLContextClientVersion(3);
        super.setRenderer(this);
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {

    }

    @Override
    public void onSurfaceCreated(GL10 gl10, EGLConfig eglConfig) {

    }

    @Override
    public void onSurfaceChanged(GL10 gl10, int width, int height) {

    }

    @Override
    public void onDrawFrame(GL10 gl10) {

    }

}
