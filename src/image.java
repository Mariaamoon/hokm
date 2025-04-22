import javax.swing.*;
import java.awt.*;

public class image extends JFrame {
    public image() {
        setTitle("Hokm");
        setSize(200, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon cardIcon = new ImageIcon("png/10_of_hearts.png");

        JLabel label = new JLabel(cardIcon);
        add(label);

        setVisible(true);
    }

    public static void main(String[] args) {
        new image();
    }
}
