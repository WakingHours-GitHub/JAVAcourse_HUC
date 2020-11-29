package Course;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class SocPicFrame extends JFrame {
    int imageWidth;
    int imageHeight;
    public SocPicFrame(String socPath){
        super("原始图片");
        try {
            // 将读入的文件放在图片缓冲区里面
            BufferedImage socPic = ImageIO.read(new File(socPath+"test.jpg"));
            imageWidth = socPic.getWidth();
            imageHeight = socPic.getHeight();

            ImageIcon icon = new ImageIcon(socPic);
            JLabel label = new JLabel(icon);
            this.add(label);

        } catch (IOException e) {
            e.printStackTrace();
        }

        this.setBounds(50,50,imageWidth,imageHeight);
        this.setVisible(true);

    }

}
