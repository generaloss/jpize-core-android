import android.app.Activity;
import android.os.Bundle;
import jpize.android.context.AndroidContextBuilder;
import jpize.context.Jpize;
import jpize.context.JpizeApplication;

public class GLTest extends Activity {

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);

        AndroidContextBuilder.create(this)
            .build()
            .setApp(new App());
        Jpize.run();
    }

    static private class App extends JpizeApplication {

        @Override
        public void init() {
            System.out.println("init");
        }

        @Override
        public void update() {
            System.out.println("update");
        }

        @Override
        public void render() {
            System.out.println("render");
        }

        @Override
        public void resize(int width, int height) {
            System.out.println("resize " + width + " " + height);
        }

        @Override
        public void dispose() {
            System.out.println("dispose");
        }

    }

}
