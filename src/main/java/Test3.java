import org.jpedal.examples.viewer.MultiViewer;
import org.jpedal.utils.LogWriter;

import javax.swing.*;

/**
 * Created by Knight_JXNU on 2016/12/9.
 */
public class Test3 extends MultiViewer {
    public static void main(final String[] args) {

    /*
     * set the look and feel for the GUI components to be the
     * default for the system it is running on
     */
        try {
            UIManager.setLookAndFeel( UIManager.getSystemLookAndFeelClassName() );
        }catch (final Exception e) {
            LogWriter.writeLog("Exception " + e + " setting look and feel");
        }

        final MultiViewer current = new MultiViewer();
        current.setupViewer();


    }
}
