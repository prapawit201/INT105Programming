/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beforemidterm;

import java.util.Scanner;

public class javaTestFriend {
    public static void main(String[] args) {
         Scanner sc =new Scanner(System.in);
         
         System.out.print("Enter your subject is ");
         String a = sc.next();
         
         System.out.print("Enter your subject is ");
         String b = sc.next();
         
         System.out.print("Enter your subject is ");
         String c = sc.next();
         
         System.out.println("Your 3 last is"+a.substring(3)+b.substring(3)+c.substring(3));
         
       
         System.out.print("Enter your score1 is ");
         double e = sc.nextDouble();
         
         System.out.print("Enter your score2 is ");
         double f = sc.nextDouble();
         
         System.out.print("Enter your score3 is ");
         double g = sc.nextDouble();
         
         System.out.println("Enter your total is"+(e+f+g)*1000);
         
         
    }
   
    
    
}
