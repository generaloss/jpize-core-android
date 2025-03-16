package jpize.android.context;

import android.app.Activity;
import jpize.context.Jpize;
import jpize.opengl.gl.Gl;
import jpize.opengl.glenum.GlTarget;

public class AndroidContextBuilder {

    public static AndroidContextBuilder create(Activity androidContext) {
        return new AndroidContextBuilder(androidContext);
    }

    private final Activity activity;

    private AndroidContextBuilder(Activity activity) {
        this.activity = activity;
    }

    public AndroidContext build() {
        // context
        final AndroidContext context = new AndroidContext(activity);
        // gl view
        final AndroidGLSurfaceView glSurfaceView = new AndroidGLSurfaceView(activity, context);
        activity.setContentView(glSurfaceView);

        Jpize.context = context;
        Jpize.input = context.getInput();
        Jpize.callbacks = context.getCallbacks();
        Jpize.window = context.getWindow();
        Jpize.allocator = new AndroidAllocator();
        Jpize.contextManager = new AndroidContextManager();

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
