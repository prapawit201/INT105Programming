/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OopProject.pretest1;

import java.util.Scanner;

/**
 *
 * @author Windows10
 */
public class teststudent {
    public static void main(String[] args) {
        
        Scanner sc  = new Scanner(System.in);
        
        System.out.print("Enter Name : ");
        String a = sc.next();
        
        System.out.print("Enter Id number : ");
        String b = sc.next();
        student s1 = new student(a,b,"");
        s1.checkid(b);
        s1.checkcana(b);
        s1.checkyear(b);
       
    }
}
