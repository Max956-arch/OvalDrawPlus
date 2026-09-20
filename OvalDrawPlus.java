import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class OvalDrawPlus extends JPanel {

    private static final Color rectangleColor = new Color(0, 0, 100);
    private static final Color ovalColor = new Color(255, 165, 0);

    @Override 
    protected void paintComponent (Graphics area) {
        super.paintComponent(area);

        int windowWidth = getWidth();
        int windowHeight = getHeight();

        area.setColor(rectangleColor);
        area.fillRect(0, 0, windowWidth, windowHeight);

        area.setColor(ovalColor);
        area.fillOval(0, 0, windowWidth, windowHeight);
    }

    public static void main(String[] args) {
      
        System.out.println("Starting OvalDrawPlus...");

        JFrame applicationWindow = new JFrame("OvalDraw Plus");

        OvalDrawPlus drawingPanel = new OvalDrawPlus();

        applicationWindow.add(drawingPanel);

        applicationWindow.setSize(400, 500);

        applicationWindow.setLocation(250, 150);

        applicationWindow.setResizable(true);

        applicationWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        applicationWindow.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent event) {
                System.out.println("Exiting OvalDrawPlus...");
                System.exit(0);
            }
        });

        applicationWindow.setVisible(true);
    }
}
