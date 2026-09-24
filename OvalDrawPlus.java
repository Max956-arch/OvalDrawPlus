import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
// These tell you what the application needs for the OvalDraw to function, such as color, window, drawing tools, drawing area, and to tell when the window is closed.

// creates a drawing panel called OvalDrawPlus 
public class OvalDrawPlus extends JPanel {

    // This gives a blue color for the retancle in the background
    private static final Color rectangleColor = new Color(0, 0, 100);

    // This gives an orange color for the oval
    private static final Color ovalColor = new Color(255, 165, 0);

    @Override 
    protected void paintComponent (Graphics area) {
        super.paintComponent(area);

        //This gets the current height and width of the application's window
        int windowWidth = getWidth();
        int windowHeight = getHeight();

        // This draws a rectangle caross the entrie screen
        area.setColor(rectangleColor);
        area.fillRect(0, 0, windowWidth, windowHeight);

        // This draws an Oval across the entire screen and it will resize if the window is extended or shrunk 
        area.setColor(ovalColor);
        area.fillOval(0, 0, windowWidth, windowHeight);
    }

    public static void main(String[] args) {

        // Prints a message in your terminal.
        System.out.println("Starting OvalDrawPlus...");

        // Creates the graphical window and will show a title at the top of the app as OvalDraw Plus
        JFrame applicationWindow = new JFrame("OvalDraw Plus");

        // This creates a drawing panel for the app
        OvalDrawPlus drawingPanel = new OvalDrawPlus();

        // This makes sure that the drawing area is in the app's window
        applicationWindow.add(drawingPanel);

        // This sets the intial height and width for the window to start into
        applicationWindow.setSize(400, 500);

        // This sets the location of the window when it pops up onto your screen
        applicationWindow.setLocation(250, 150);

        // This allows the user to change the size of the window
        applicationWindow.setResizable(true);

        // This tells the code to pay attention to the window closing 
        applicationWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // This will detect when the user closes the window
        applicationWindow.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent event) {
                System.out.println("Exiting OvalDrawPlus...");
                System.exit(0);
            }
        });
        //This tells your application window to appear on the computer screen. 
        applicationWindow.setVisible(true);
    }
}
