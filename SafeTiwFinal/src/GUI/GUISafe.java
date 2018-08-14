/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


/**
 *
 * @author Windows10
 */
public class GUISafe {
    public static void main(String[] args) {
        JFrame frame = new JFrame("FrameTest");
        JPanel panel = new JPanel();
        
        
        JLabel label = new JLabel("Hello world");
        JButton button = new JButton("Click me!") ;
        JTextField text1 = new JTextField("First",20);
        JTextField text2 = new JTextField("",20);
        
        JTextField txtField = new JTextField("Dafault message",10);
        
        ButtonActionListener buttonevent = new ButtonActionListener(text1,text2);
        button.addActionListener(buttonevent);
      
        panel.add(label);
        panel.add(button);
        panel.add(txtField);
        panel.add(text1);
        panel.add(text2);
        
        
        frame.add(panel);
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}
