import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class ConfigurationScreen extends JFrame {
    private static String[] choices = { "EASY", "MEDIUM", "HARD"};
    private static Integer[] skillPoints = {16, 12, 8};
    private static Integer[] credits = {1000, 800, 600};

    private static void createAndShowGUI() {
        //Make sure we have nice window decorations.
        JFrame.setDefaultLookAndFeelDecorated(true);

        //Create and set up the window.
        JFrame frame = new JFrame("Configuration Screen");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container window = frame.getContentPane();
        window.setLayout(null);

        //Add the ubiquitous "Hello World" label.
        JLabel label = new JLabel("Please Configure here!");
        window.add(label);
        label.setBounds(200,10,100,80);

        //====Name====//
        JLabel nameLabel = new JLabel("Character Name:");
        window.add(nameLabel);
        nameLabel.setBounds(100,100,200,20);

        JTextArea nameText = new JTextArea("");
        window.add(nameText);
        nameText.setBounds(250,100,100,20);

        //====Difficulty====//
        JLabel diffLabel = new JLabel("Difficulty:");
        window.add(diffLabel);
        diffLabel.setBounds(100,130,200,20);

        final JComboBox<String> cb = new JComboBox<String>(choices);
        window.add(cb);
        cb.setBounds(250,130,200,20);

        //====Pilot====//
        JLabel pilotLabel = new JLabel("Pilot Skill");
        window.add(pilotLabel);
        pilotLabel.setBounds(100,160,200,20);

        JTextArea pilotScore = new JTextArea("");
        window.add(pilotScore);
        pilotScore.setBounds(250,160,100,20);
        //====Pilot====//

        //====Fighter====//
        JLabel fighterText = new JLabel("Fighter Skill");
        window.add(fighterText);
        fighterText.setBounds(100,190,200,20);

        JTextArea fighterSocre = new JTextArea("");
        window.add(fighterSocre);
        fighterSocre.setBounds(250,190,100,20);
        //====Fighter====//

        //====Merchant====//
        JLabel merchantText = new JLabel("Merchant Skill");
        window.add(merchantText);
        merchantText.setBounds(100,220,200,20);

        JTextArea merchantScore = new JTextArea("");
        window.add(merchantScore);
        merchantScore.setBounds(250,220,100,20);
        //====Merchant====//

        //====Engineer====//
        JLabel engineerText = new JLabel("Engineer Skill");
        window.add(engineerText);
        engineerText.setBounds(100,250,200,20);

        JTextArea engineerScore = new JTextArea("");
        window.add(engineerScore);
        engineerScore.setBounds(250,250,100,20);
        //====Engineer====//


        //Add a button
        JButton startBut = new JButton("Confirm");
        startBut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Configuration.setCharacterName(nameText.getText());
                String diff = (String) cb.getSelectedItem();
                Configuration.setDifficulty(diff);

                int indexOfCreditsAndSkillPoints = -1;
                if(diff.equals("EASY")) {
                    indexOfCreditsAndSkillPoints = 0;
                } else if(diff.equals("MEDIUM")) {
                    indexOfCreditsAndSkillPoints = 1;
                } else if(diff.equals("HARD")) {
                    indexOfCreditsAndSkillPoints = 2;
                }

                HashMap<String, Integer> map = new HashMap<>();
                map.put("pilot", Integer.valueOf(pilotScore.getText()));
                map.put("Fighter", Integer.valueOf(pilotScore.getText()));
                map.put("Merchant", Integer.valueOf(pilotScore.getText()));
                map.put("Engineer", Integer.valueOf(pilotScore.getText()));
                Configuration.setSkillPointsAllocation(map);

                Configuration.setInitialCredits(credits[indexOfCreditsAndSkillPoints]);
                Configuration.setInitialSkillPoints(credits[indexOfCreditsAndSkillPoints]);

                //Configuration.setCharacterName();
                JFrame newWindow = new JFrame("Configuration");
                newWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                newWindow.setSize(400,400);
                newWindow.setVisible(true);
            }
        });
        startBut.setSize(40,40);
        window.add(startBut);

        //Display the window.
        frame.setSize(500,500);
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
