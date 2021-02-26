

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ScreenCaptureTest {

    public static void main(String[] args) throws Exception {
        try {
            Robot robot = new Robot();
            String format = "jpg";
            String fileName = "FullScreenshot." + format;

            Rectangle screenRect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
            BufferedImage screenFullImage = robot.createScreenCapture(screenRect);


            ImageIO.write(screenFullImage, format, new File(fileName));

            System.out.println("A full screenshot saved!");
        } catch (AWTException | IOException ex) {
            System.err.println(ex);
        }
    }
}
