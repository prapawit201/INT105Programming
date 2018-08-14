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
public class loopแยกตัวประกอบ {//แยกตัวประกอบ
 //       public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter num : ");
//        int a = sc.nextInt();
//        int b =2;
//        System.out.print("1 * ");
//        while(a!=1){
//            if(a%b==0){
//                a=a/b;
//                System.out.print(b+" * ");
//            }else{
//                b++;
//            }
//        }
//        System.out.println("\b\b\b");

//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter num : ");
//        int num = sc.nextInt();
//        
//        int b = 2 ;
//        System.out.print("1 * ");
//        while(num!=1){
//            if(num%b==0){
//                num=num/b;
//                System.out.print(b+" * ");
//            }else{
//                b++;
//            }
//        }
//        System.out.println("\b\b\b");
    
//}
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num : ");
        int num = sc.nextInt();
        
        int b = 2;
        System.out.print("1 * ");
        while(num!=1){
            if(num%b==0){
                num=num/b;
                System.out.print(b+" * ");
            }else{
                b++;
            }
        }
        System.out.println("\b\b\b");
    }
}