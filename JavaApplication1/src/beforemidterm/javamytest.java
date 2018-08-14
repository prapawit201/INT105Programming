/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beforemidterm;

import java.util.Scanner;
import java.text.DecimalFormat;

public class javamytest {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            
            System.out.print("Enter your name is ");
            String password = sc.next();
            
            System.out.print("Enter your number is ");
            String number  = sc.next();
            
            String repassword = ""+password.charAt(3)+password.charAt(2)+password.charAt(1)+password.charAt(0)+number.charAt(number.length()-1)+number.charAt(number.length()-2);
            System.out.println("repass is "+repassword);
        
    }

    
}
