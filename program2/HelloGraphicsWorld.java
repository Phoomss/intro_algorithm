import java.awt.*;
import javax.swing.*;
public class HelloGraphicsWorld {

  public static void main(String[] args) {
        JFrame frame = new JFrame() {
            public void paint(Graphics g) {
                g.drawString("Hello, World!", 110, 150);
                g.drawOval(100, 130, 90, 30);
            }

        };
          
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}  
