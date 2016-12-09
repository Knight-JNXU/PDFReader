import com.sun.pdfview.PDFViewer;

/**
 * Created by Knight_JXNU on 2016/12/9.
 */
public class Test4 extends PDFViewer {
    public Test4(boolean useThumbs) {
        super(useThumbs);
    }
    public static void main(String[] args) {
        String fileName = null;
        boolean useThumbs = true;

        for(int viewer = 0; viewer < args.length; ++viewer) {
            if(args[viewer].equalsIgnoreCase("-noThumb")) {
                useThumbs = false;
            } else if(!args[viewer].equalsIgnoreCase("-help") && !args[viewer].equalsIgnoreCase("-h") && !args[viewer].equalsIgnoreCase("-?")) {
                fileName = args[viewer];
            } else {
                System.out.println("java com.sun.awc.PDFViewer [flags] [file]");
                System.out.println("flags: [-noThumb] [-help or -h or -?]");
                System.exit(0);
            }
        }

        PDFViewer var4 = new PDFViewer(useThumbs);
        if(fileName != null) {
            var4.doOpen(fileName);
        }

    }
}
