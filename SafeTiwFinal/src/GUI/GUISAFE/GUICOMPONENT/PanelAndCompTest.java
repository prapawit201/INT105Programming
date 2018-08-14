/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.GUISAFE.GUICOMPONENT;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Windows10
 */
public class PanelAndCompTest {
      public static void main(String[] args) {
        //--------Container--------
        JFrame frame = new JFrame("Hello World");
        JPanel panel = new JPanel();
        //--------Component---------
        JLabel label = new JLabel("Hello World");
        JButton button = new JButton("CLICK BUTTON");
        JTextField txtfield = new JTextField("Default Message",20);
        //-----panel add component
        panel.add(label);
        panel.add(button);
        panel.add(txtfield);
        //------ frame add panel
        frame.add(panel);
        
        frame.setSize(400,400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
