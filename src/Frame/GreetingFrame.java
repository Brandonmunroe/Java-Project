package Frame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GreetingFrame extends JFrame {

    private JTextField nameField;
    private JButton greetButton;
    private JLabel messageLabel;

    public GreetingFrame() {
        // Frame setup
        setTitle("Greeting Program");
        setSize(350, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Components
        nameField = new JTextField(15);
        greetButton = new JButton("Greet");
        messageLabel = new JLabel("");

        // Add components to frame
        add(new JLabel("Enter your name:"));
        add(nameField);
        add(greetButton);
        add(messageLabel);

        // Add ActionListener using inner class
        greetButton.addActionListener(new GreetButtonListener());
    }

    // Inner class that handles button click
    private class GreetButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String name = nameField.getText().trim();

            if (name.isEmpty()) {
                messageLabel.setText("Please enter a name.");
            } else {
                messageLabel.setText("Hello, " + name + "!");
            }
        }
    }

    public static void main(String[] args) {
        GreetingFrame frame = new GreetingFrame();
        frame.setVisible(true);
    }
}