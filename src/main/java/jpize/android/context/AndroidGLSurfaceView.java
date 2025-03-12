package jpize.android.context;

import android.app.Activity;
import android.opengl.GLSurfaceView;
import jpize.android.opengl.*;
import jpize.context.Jpize;
import jpize.opengl.gl.Gl;
import jpize.opengl.glenum.GlCompareFunc;
import jpize.opengl.glenum.GlTarget;
import jpize.opengl.texture.GlBlendFactor;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

public class AndroidGLSurfaceView extends GLSurfaceView implements GLSurfaceView.Renderer {

    private final AndroidContext context;

    public AndroidGLSurfaceView(Activity activity, AndroidContext context) {
        super(activity);
        this.context = context;

        super.setEGLContextClientVersion(3);
        super.setRenderer(this);
    }

    @Override
    public void onSurfaceCreated(GL10 gl10, EGLConfig eglConfig) {
        Jpize.GL11 = new AndroidGL11();
        Jpize.GL12 = new AndroidGL12();
        Jpize.GL13 = new AndroidGL13();
        Jpize.GL14 = new AndroidGL14();
        Jpize.GL15 = new AndroidGL15();
        Jpize.GL20 = new AndroidGL20();
        Jpize.GL21 = new AndroidGL21();
        Jpize.GL30 = new AndroidGL30();

        // default blending options, enable cullface
        Gl.enable(GlTarget.BLEND, GlTarget.CULL_FACE);
        Gl.blendFunc(GlBlendFactor.SRC_ALPHA, GlBlendFactor.ONE_MINUS_SRC_ALPHA);
        // opengl left-handled coordinate system options
        Gl.depthFunc(GlCompareFunc.GEQUAL);
        Gl.clearDepth(0);

        context.initP();
    }

    @Override
    public void onSurfaceChanged(GL10 gl10, int width, int height) {
        context.resizeP(width, height);
    }

    @Override
    public void onDrawFrame(GL10 gl10) {
        context.loopP();
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
    }

}
