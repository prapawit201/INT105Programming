/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nextfinal;

import java.util.Scanner;

/**
 *
 * @author Windows10
 */
public class chokunLoop {
       
    public static void Sentent (){
      
       Scanner input = new Scanner(System.in);
        System.out.print("Enter your Word: ");
        String word0 = input.nextLine();
        String word = word0.toLowerCase();
        int ansA = 0;
        int ansE = 0;
        int ansI = 0;
        int ansO = 0;
        int ansU = 0;
        int ansOther = 0;
        int ansNum = 0;
        int ansSpecial = 0;
        int ansSpace =0;
  
        int a = 0;
        
        while (a <= word.length() - 1) {
            if (word.charAt(a) == 'a') {
                ansA = ansA + 1;
                a++;
            }else
            if (word.charAt(a) == 'e') {
                ansE = ansE + 1;
                a++;
            }else
            if (word.charAt(a) == 'i') {
                ansI = ansI + 1;
                a++;
            }else
            if (word.charAt(a) == 'o') {
                ansO = ansO + 1;
                a++;
            }else
            if (word.charAt(a) == 'u') {
                ansU = ansU + 1;
                a++;
            }

        }
        
        
        
        System.out.println("Ans A = " + ansA);
        System.out.println("Ans E = " + ansE);
        System.out.println("Ans I = " + ansI);
        System.out.println("Ans O = " + ansO);
        System.out.println("Ans U = " + ansU);

           
         }
    public static void main(String[] args) {
        Sentent () ;
    }
}

