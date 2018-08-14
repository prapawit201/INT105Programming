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
public class LoopWhileสุ่มเลข10ตัว {
//    public static int random() {
//         int b = (int) (Math.random() * (10 - 1 + 1) + 1);
//         return b ;
//    }
//    public static void susu() {
//         Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter num : ");
//        int a = sc.nextInt();
//        int c = random();
//
//        
//            while (a != c && a != 0 ) {
//               
//                if(a>=11){
//                    System.out.println("Please enter only 1-10");
//                }
//                else if (a > c) {
//
//                    System.out.println("HIGH");
//                }
//                else if (a < c) {
//
//                    System.out.println("LOW");
//                
//               
//
//                }
//                 System.out.print("Enter num again : ");
//                a = sc.nextInt();
//                
//
//            }if(a==0){
//                System.out.println("End Game");
//                System.out.println("Com is : "+c);
//            
//            
//            }if (a == c) {
//            System.out.println("com is : " + c);
//            System.out.println("Win");
//            }
//        
//    
//    
//    }
//    public static void main(String[] args) {
//       susu();
//
//    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        int a = (int) (Math.random()*(10-0+1)+1);
        System.out.println("Random is "+a);
        
        System.out.print("Enter num : ");
        int num = sc.nextInt();
        
        while(num!=0){
          if(num>=0&num<=10){  
            if(num<a){
                System.out.println("Lower");
            }else if(num>a){
                System.out.println("Higher");
            }else if(num==a){
                System.out.println("Correct");    
            }else{
                System.out.println("Please try again");
            }
          }else{
              System.out.println("Please Enter only1-10");
          }
            System.out.print("Enter num : ");
            num = sc.nextInt();
        
        }
        System.out.println("End game");
    }
}
