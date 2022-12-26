import java.awt.*;
import javax.swing.*;

public class Santa extends JPanel {
  public void paintComponent(Graphics g) {
    super.paintComponent(g);

    // draw the face
    g.setColor(Color.BLACK);
    g.fillOval(10, 10, 100, 100);
    g.setColor(Color.WHITE);
    g.fillOval(30, 30, 20, 20);
    g.fillOval(70, 30, 20, 20);
    g.setColor(Color.RED);
    g.fillOval(40, 60, 40, 40);

    // draw the eyes
    g.setColor(Color.BLACK);
    g.fillOval(33, 33, 10, 10);
    g.fillOval(73, 33, 10, 10);

    // draw the pupils
    g.setColor(Color.BLUE);
    g.fillOval(35, 35, 5, 5);
    g.fillOval(75, 35, 5, 5);

    // draw the nose
    g.setColor(Color.ORANGE);
    Polygon nose = new Polygon();
    nose.addPoint(50, 50);
    nose.addPoint(60, 40);
    nose.addPoint(40, 40);
    g.fillPolygon(nose);

    // draw the hat
    g.setColor(Color.RED);
    g.fillRect(25, 10, 50, 25);
    g.fillRect(35, 35, 30, 10);
    g.setColor(Color.BLACK);
    g.fillRect(35, 10, 30, 25);
    g.fillRect(45, 35, 10, 10);

    // draw the beard
    g.setColor(Color.BLUE);
    g.fillOval(25, 75, 50, 50);
    g.setColor(Color.BLACK);
    g.fillOval(30, 80, 40, 40);
    g.fillRect(50, 90, 10, 10);
    g.fillRect(60, 90, 10, 10);
    g.fillRect(40, 90, 10, 10);
    g.fillRect(30, 100, 10, 10);
    g.fillRect(70, 100, 10, 10);
    g.fillRect(40, 110, 10, 10);
    g.fillRect(60, 110, 10, 10);
    g.fillRect(50, 120, 10, 10);

    // draw the gloves
    g.setColor(Color.RED);
    g.fillOval(10, 110, 25, 25);
    g.fillOval(85, 110, 25, 25);
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame();
    frame.add(new Santa());
    frame.setSize(120, 200);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}
