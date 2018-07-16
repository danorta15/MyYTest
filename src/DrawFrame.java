import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import javax.swing.JComponent; 
import javax.swing.JFrame;

public class DrawFrame extends JComponent 
{
public void lineComponent (Graphics g)
{
	Graphics2D g2 = (Graphics2D) g;
    Line2D.Double line1 = new Line2D.Double(30, 110, 80, 110);
    g2.draw(line1);
}

public static void main(String[] args) 
{
    JFrame frame = new JFrame();
    frame.setSize(500, 500);
    frame.setTitle("BE A LINE");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    DrawFrame component = new DrawFrame();
    frame.add(component);
    frame.setVisible(true);

}

@Override
protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    lineComponent(g);
}
}