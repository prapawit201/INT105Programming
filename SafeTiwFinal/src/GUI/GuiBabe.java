/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.GridLayout;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Windows10
 */
class GuiBabe {
    public static void main(String[] args) {
       JFrame f = new JFrame();
       JPanel p = new JPanel(new GridLayout(3,2));
       
       JTextField f1 = new JTextField();
       JTextField f2 = new JTextField();
       JLabel l = new JLabel("ans");
       JLabel warning = new JLabel("ใส่เลข");
       JTextField f3 = new JTextField("",5);
       JCheckBox b = new JCheckBox("male");
    }
}
