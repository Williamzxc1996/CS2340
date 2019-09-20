import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WelcomeScreen {
    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
    private static void createAndShowGUI() {
        //Make sure we have nice window decorations.
        JFrame.setDefaultLookAndFeelDecorated(true);

        //Create and set up the window.
        JFrame frame = new JFrame("Space Trader");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container window = frame.getContentPane();
        window.setLayout(new FlowLayout());

        //Add the ubiquitous "Hello World" label.
        JLabel label = new JLabel("Welcome to Space Trader!");
        window.add(label);

        //Add a button
        JButton startBut = new JButton("Start");
        startBut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ConfigurationScreen.createAndShowGUI();
            }
        });
        startBut.setSize(40,40);
        window.add(startBut);

        //Display the window.
        frame.setSize(400,400);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
