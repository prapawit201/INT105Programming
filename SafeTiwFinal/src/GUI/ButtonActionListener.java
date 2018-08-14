/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author Windows10
 */
public class ButtonActionListener implements ActionListener {
    private JTextField text1;
    private JTextField text2;

    public ButtonActionListener(JTextField text1, JTextField text2) {
        this.text1 = text1;
        this.text2 = text2;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String message = text1.getText();
        text2.setText(message);
    }


   

    
}
