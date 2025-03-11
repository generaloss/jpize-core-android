package jpize.android.context;

import android.app.Activity;
import android.content.Context;
import jpize.context.Jpize;
import jpize.opengl.gl.Gl;
import jpize.opengl.glenum.GlCompareFunc;
import jpize.opengl.glenum.GlTarget;
import jpize.opengl.texture.GlBlendFactor;

public class AndroidContextBuilder {

    public static AndroidContextBuilder create(Activity androidContext) {
        return new AndroidContextBuilder(androidContext);
    }

    static {
        Jpize.allocator = new AndroidAllocator();
    }

    private final Activity androidContext;

    private AndroidContextBuilder(Activity androidContext) {
        this.androidContext = androidContext;
    }

    public AndroidContext build() {
        Jpize.contextManager = new AndroidContextManager();
        final AndroidGLSurfaceView glSurfaceView = new AndroidGLSurfaceView(androidContext);
        androidContext.setContentView(glSurfaceView);
        // window
        final AndroidWindow window = new AndroidWindow(androidContext);
        // context
        final AndroidContext context = new AndroidContext(window);
        // default blending options, enable cullface
        Gl.enable(GlTarget.BLEND, GlTarget.CULL_FACE);
        Gl.blendFunc(GlBlendFactor.SRC_ALPHA, GlBlendFactor.ONE_MINUS_SRC_ALPHA);
        // opengl left-handled coordinate system options
        Gl.depthFunc(GlCompareFunc.GEQUAL);
        Gl.clearDepth(0);
        // multisample
        if(samples > 0)
            Gl.enable(GlTarget.MULTISAMPLE);

        return context;
    }

    private int samples = 0;

    public AndroidContextBuilder samples(int samples) {
        this.samples = samples;
        return this;
    }

}
