/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nextfinal;

import java.util.Scanner ;

public class MidtermTest {
                    //ข้อ8  A //
//    public static void main(String[] args) {
//            Scanner sc = new Scanner(System.in);     
//            System.out.print("Input product price : ");
//            double a = sc.nextDouble() ;
//            
//            double b = a*107/100 ;
//            System.out.println("Total price including vat 7% is "+b+"  Baht");
//    }
    
  
            //ข้อ7//
    
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Input 3 integer numbers : ");
//        int a = sc.nextInt();
//         int b = sc.nextInt();
//          int c = sc.nextInt();
//        
//          if(a>b){
//              int temp ;
//              temp = a ;
//              a = b ;
//              b = temp ;
//          }if (b>c){
//               int temp ;
//              temp = b ;
//              b = c ;
//              c = temp ;
//          }if(a>b){
//               int temp ;
//              temp = a ;
//              a = b ;
//              b = temp ;
//          }
//          System.out.println("Te sorted numbers are : "+a+" "+b+" "+c);
//          
//    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter 3 nums : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        if(a>b){
            int temp;
            temp = a;
            a = b;
            b =temp;
        }if(b>c){
            int temp;
            temp = b;
            b = c;
            c =temp;
        }if(a>b){
            int temp;
            temp = a;
            a = b;
            b =temp;
        }
        System.out.println(a+" "+b+" "+c);
        
    }
    

                            //ข้อ6//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        
//        System.out.print("Input currency to convert (Ending with usd or thb) : ");
//        double a = sc.nextDouble();
//        String b = sc.next();
//        
//        if(b.equalsIgnoreCase("usd")){
//            double c = a*33.11;
//            System.out.println(a+" USD can be converted to "+c+" Thai Baht");
//            
//         
//        }else  if(b.equalsIgnoreCase("thb")){
//            double d = a*0.030;
//            System.out.println(a+" Thai Baht can be converted to "+d+" USD");
//        }
//   
//    }   
    
//    public static void main(String[] args) {
//        Scanner sc =new Scanner (System.in);
//        System.out.print("Input your first name : " );
//        String a = sc.next();
//        System.out.print("Input your last name : " );
//        String b =sc.next();
//        
//        if(a.toLowerCase().charAt(0)==a.charAt(0)&&a.toLowerCase().charAt(0)==b.charAt(0)){
//            System.out.println(a.toUpperCase().charAt(0)+b.toUpperCase().charAt(0));
//        }else if(a.toUpperCase().charAt(0)==a.charAt(0)&&a.toUpperCase().charAt(0)==b.charAt(0)){
//            System.out.println(a.toUpperCase().charAt(0)+b.toUpperCase().charAt(0));
//        }else{
//            System.out.println("Error");
//        }
//        
//
//    }
}
