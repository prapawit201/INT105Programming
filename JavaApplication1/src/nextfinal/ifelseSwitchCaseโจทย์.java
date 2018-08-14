/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nextfinal;

import java.util.Scanner;
import java.text.DecimalFormat;

/**
 *
 * @author Windows10
 */
public class ifelseSwitchCaseโจทย์ {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//         System.out.print("Password : ");
//         String a = sc.next(); 
//         
//         if(a.length()==6){
//             System.out.print(check(a.charAt(5)));
//             System.out.print(check(a.charAt(4)));
//             System.out.print(check(a.charAt(3)));
//             System.out.print(check(a.charAt(2)));
//             System.out.print(check(a.charAt(1)));
//             System.out.println(check(a.charAt(0)));
//         }else{
//             System.out.println("ใส่ให้ครบ6ตัว");
//         }
//    }
//    public static char check(char a) {
//        if(Character.isLowerCase(a)){
//            return (char)(a-32);
//        }else if(Character.isUpperCase(a)){
//            return (char)(a+32);
//        }
//        return a ;
//    }
//        System.out.print("Enter Expression : ");
//        int a  = sc.nextInt();
//        char b  = sc.next().charAt(0);
//        int c  = sc.nextInt();
//
//        switch(b){
//            case '+' : System.out.println("answer : "+(a+c));break;
//            case '-' : System.out.println("answer : "+(a-c));break;
//            case '*' : System.out.println("answer : "+(a*c));break;
//            case '/' : System.out.println("answer : "+(a/c));break;
//            default :
//        }
//        System.out.print("Enter your product name : ");
//        String a = sc.next(); 
//        System.out.print("Enter type product : ");
//        String b = sc.next();
//        
//        char c = a.toLowerCase().charAt(0) ;
//        if(b.equalsIgnoreCase("toy")){
//            if(c >= 'a' && c <= 'p'){
//                System.out.println("Stock to APTOY11");
//            }else if(c >= 'q' && c <= 'z'){
//                System.out.println("Stock to QZTOY18");
//            }
//        }else if(b.equalsIgnoreCase("acessory")){
//            if(c >= 'a' && c <= 'p'){
//                System.out.println("Stock to APACC12");
//            }else if(c >= 'q' && c <= 'z'){
//                System.out.println("Stock to QZACC19");
//            }
//        }else if(b.equalsIgnoreCase("bag")){
//            if(c >= 'a' && c <= 'p'){
//                System.out.println("Stock to APBAG13");
//            }else if(c >= 'q' && c <= 'z'){
//                System.out.println("Stock to QZBAG20");
//            }
//}
//      
//            System.out.print("Enter your ที่พัก บ้าน หรือ หอพัก : ");
//            String a = sc.next();
//            System.out.print("ระบุหน่วยที่ใช้ไปใน1เดือน : ");
//            int b = sc.nextInt();
//            switch(a){
//                case "a" :
//                    if(b <= 200){
//                        double c = b*4 ;
//                        System.out.println("ค่าไฟเดือนนี้ : "+c+" บาท");
//                    }else{
//                        double d = b*4.25 ;
//                        System.out.println("ค่าไฟเดือนนี้ : "+d+" บาท");
//                    }break;
//                
//                case "b" :
//                    if(b <= 200){
//                        double c = b*7 ;
//                        System.out.println("ค่าไฟเดือนนี้ : "+c+" บาท");
//                    }else{
//                        double d = b*7.25 ;
//                        System.out.println("ค่าไฟเดือนนี้ : "+d+" บาท");
//                    }break;
//                 
//            }
//                if(a.equalsIgnoreCase("บ้าน")||a.equalsIgnoreCase("Home")){
//                    if(b <= 200){
//                        double c = b*4 ;
//                        System.out.println("ค่าไฟเดือนนี้ : "+c+" บาท");
//                    }else{
//                        double d = b*4.25 ;
//                        System.out.println("ค่าไฟเดือนนี้ : "+d+" บาท");
//                    }
//                }else if(a.equalsIgnoreCase("หอพัก")||a.equalsIgnoreCase("Condo")){
//                    if(b >= 200){
//                        double c = b*7 ;
//                        System.out.println("ค่าไฟเดือนนี้ : "+c+" บาท");
//                    }else{
//                        double d = b*7.25 ;
//                        System.out.println("ค่าไฟเดือนนี้ : "+d+" บาท");
//                    }
//                }else{
//                    System.out.println("Error");
//                }
//                System.out.print("Enter password : ");
//                String a = sc.next() ;
//                
//              
//                
//                if(a.length() == 6){
//                    System.out.print(b(a.charAt(5)));
//                    System.out.print(b(a.charAt(4)));
//                    System.out.print(b(a.charAt(3)));
//                    System.out.print(b(a.charAt(2)));
//                    System.out.print(b(a.charAt(1)));
//                    System.out.println(b(a.charAt(0)));
//                }else{
//                    System.out.println("กรุณากรอกให้พอดี");
//                }
//}
//    public static char b(char a) {
//        if(Character.isLowerCase(a)){
//            return (char)(a-32);
//        }else if(Character.isUpperCase(a)){
//            return (char)(a+32) ;
//        }
//        return a ;
//            System.out.print("Enter Expression : ");
//            int a = sc.nextInt();
//            char b = sc.next().charAt(0);
//            int c = sc.nextInt();
//            
//            switch(b){
//                case '+' : System.out.println(a+c); break;
//                case '-' : System.out.println(a-c); break;
//                case '*' : System.out.println(a*c); break;
//                case '/' : System.out.println(a/c); break;
//            }
        System.out.print("Enter your เงินที่จะถอน : ");

        int a = sc.nextInt();

        
            if (a <= 20000 & a % 100 == 0) {

                int b1000 = a / 1000;
                int b500 = (a % 1000) / 500;
                int b100 = ((a % 1000) % 500) / 100;

                System.out.println("ได้เเบงค์พัน " + b1000 + " ฉบับ" + "\n" + "ได้เเบงค์ห้าร้อย " + b500 + " ฉบับ" + "\n" + "ได้เเบงค์ร้อย " + b100 + " ฉบับ");
            } else {
                System.out.println("Error");
            }
        
    }
}
