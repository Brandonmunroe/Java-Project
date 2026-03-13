package Frame;

import javax.swing.*;
import java.awt.*;

public class MyFrame {
    public static void main(String [] args){
      JFrame myFrame = new JFrame();
      myFrame.setSize(300, 150);
      myFrame.setTitle("Greeting Program");
      myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      myFrame.setVisible(true);
      //Create button and label
        JButton myButton = new JButton("Hello Brandon");
        JLabel myLabel = new JLabel("Now Loading");
        JPanel myPanel = new JPanel();
        JTextField myTextField = new JTextField(10);
        myFrame.add(myPanel);
        myPanel.add(myLabel);
        myPanel.add(myButton);
        myPanel.add(myTextField);
        myPanel.setBackground(Color.BLUE);





    }
}
//Include TextField