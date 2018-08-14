/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.GUISAFE.GUICOMPONENT;

import javax.swing.JFrame;

/**
 *
 * @author Windows10
 */
public class FrameTest {
    public static void main(String[] args) {
        JFrame frame = new JFrame("FrameTest");
        //ADD COMPONENT HERE
        frame.setSize(400,400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}
