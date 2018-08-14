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
public class loopPower {
//    public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     
//        System.out.print("Enter base : ");
//        int a = sc.nextInt();    
//        
//        System.out.print("Enter power : ");
//        int b = sc.nextInt();
//        
//        int result = 1 ;
//        int power = 1 ;
//        
//        while(power<=b){
//            result*=a;
//        }
//        System.out.println("Total : "+result);
//    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter num : ");
        int num = sc.nextInt();
        
        System.out.print("Enter power : ");
        int power = sc.nextInt();
        
        int a = 1;
        int b = 1;
        
        while(a<=power){
            b=b*num;
            a++;
        }
        System.out.println(b);
    }
}
