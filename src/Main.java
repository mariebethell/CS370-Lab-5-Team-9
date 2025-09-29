/*
 * Team 9 members: Marie Bethel, Sarah Mcneal, Benjamin Jones, Logan Huynh
 */
import javax.swing.*;
import java.awt.*;
public class Main {
    public static void main(String[] args) {
        // Create a new JFrame
        JFrame frame = new JFrame() ;

        // Set the size, title, and exit operationframe.  Open at the center of the screen
        frame.setTitle("Card Randomizer");
        frame.setSize(1500, 800) ;
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); // this will cause the frame to open in the middle of the screen instead of top left corner
        // Add components/images here
        CardPanel cardPanel = new CardPanel();
        frame.add(cardPanel, BorderLayout.CENTER);
        
        JButton Shuffle = new JButton("Shuffle"); 
        frame.add(Shuffle, BorderLayout.SOUTH);
        Shuffle.setPreferredSize(new Dimension(10, 70));
        Shuffle.addActionListener(e ->{
            cardPanel.repaint();
        });
        
        // Make the frame visible
        frame.setVisible(true);
    }
}
