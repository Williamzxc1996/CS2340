import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class ConfirmationScreen extends JFrame {
    private Configuration config;

    public ConfirmationScreen(Configuration config) {
        this.config = config;
    }

    public void createAndShowGUI() {
        //Make sure we have nice window decorations.
        JFrame.setDefaultLookAndFeelDecorated(true);

        //Create and set up the window.
        JFrame frame = new JFrame("Confirmation Screen");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container window = frame.getContentPane();
        window.setLayout(null);


        //====Name====//
        JLabel nameLabel = new JLabel("Character Name:" + config.getCharacterName());
        window.add(nameLabel);
        nameLabel.setBounds(100,100,200,20);


        //====Difficulty====//
        JLabel diffLabel = new JLabel("Difficulty:" + config.getDifficulty());
        window.add(diffLabel);
        diffLabel.setBounds(100,130,200,20);

        //====Credits====//
        JLabel credits = new JLabel("Credits:" + config.getInitialCredits());
        window.add(credits);
        credits.setBounds(100,160,200,20);

        //====Pilot====//
        JLabel pilotLabel = new JLabel("Pilot Skill:" + config.getSkillPointsAllocation().get("pilot"));
        window.add(pilotLabel);
        pilotLabel.setBounds(100,190,200,20);


        //====Fighter====//
        JLabel fighterText = new JLabel("Fighter Skill:" + config.getSkillPointsAllocation().get("Fighter"));
        window.add(fighterText);
        fighterText.setBounds(100,220,200,20);

        //====Merchant====//
        JLabel merchantText = new JLabel("Merchant Skill:" + config.getSkillPointsAllocation().get("Merchant"));
        window.add(merchantText);
        merchantText.setBounds(100,250,200,20);

        //====Engineer====//
        JLabel engineerText = new JLabel("Engineer Skill:" + config.getSkillPointsAllocation().get("Engineer"));
        window.add(engineerText);
        engineerText.setBounds(100,280,200,20);


        //Display the window.
        frame.setSize(500,500);
        frame.setVisible(true);
    }
}
