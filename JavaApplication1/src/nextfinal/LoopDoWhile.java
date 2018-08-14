/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nextfinal;

import java.util.Scanner;


public class LoopDoWhile {
    public static void a() {
        Scanner sc = new Scanner(System.in);
        
            System.out.print("แม่ที่อยากรู้ : ");
            int a = 1;
            int b = 1;
            
            do{
                System.out.println(a+" * "+b+" = "+(a*b));
                
                b++;
            }while( a!=0 && b<=12);
    }
    public static void b() {
        Scanner sc = new Scanner(System.in);
        
            System.out.print("แม่ที่อยากรู้ : ");
            int a = 2;
            int b = 1;
            
            do{
                System.out.println(a+" * "+b+" = "+(a*b));
                
                b++;
            }while( a!=0 && b<=12);
    }
    public static void main(String[] args) {
        a();
        b();
    }
}
