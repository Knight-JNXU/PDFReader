import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import javax.swing.SwingUtilities;
import org.icepdf.ri.images.Images;
import org.icepdf.ri.viewer.Main;
import org.icepdf.ri.viewer.SplashWindow;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 * Created by Knight_JXNU on 2016/12/9.
 */
public class Test5 extends Main {
    public static void main(final String[] args) {
        URL imageURL = Images.get("icepdf-splash.png");
        if(imageURL != null) {
            Image splashImage = Toolkit.getDefaultToolkit().getImage(imageURL);
            if(splashImage != null) {
                splashWindow = new SplashWindow(splashImage);
                splashWindow.splash();
            }
        }

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                try {
                    Class.forName("org.icepdf.ri.viewer.Launcher").getMethod("main", new Class[]{String[].class}).invoke((Object)null, new Object[]{args});
                } catch (Throwable var2) {
                    var2.printStackTrace();
                    System.err.flush();
                    System.exit(10);
                }

            }
        });
        if(splashWindow != null) {
            splashWindow.dispose();
        }

    }
}
