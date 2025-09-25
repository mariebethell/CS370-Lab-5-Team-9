import javax.swing.*;
import java.awt.*;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class CardPanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);

        // Starting position
        int x = 10;
        int y = 10;

        // Generate set of random numbers 1-52
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 01; i <= 52; i++) {
            list.add(i);
        }
        Collections.shuffle(list);
        System.out.println(list);

        for (int i = 0; i < 52; i++) {
            String filename = "cards/" + list.get(i) + "..png";
        
            Image image = null;
            try {
                image = ImageIO.read(new File(filename));
            } catch (IOException e) {
                e.printStackTrace();
                return;
            }

            // Scale image down
            Image scaledImage = image.getScaledInstance(100, 145, Image.SCALE_SMOOTH);
            
            ImageIcon icon = new ImageIcon(scaledImage);

            icon.paintIcon(this, graphics, x, y);

            x += 105;
            
            if (((i + 1) % 13) == 0) {
                x = 10;
                y += 155;
            }
        }
    }
}
