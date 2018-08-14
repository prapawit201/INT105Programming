/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beforemidterm;

import java.util.Scanner;

import java.text.DecimalFormat ;

/**
 *
 * @author Windows10
 */
public class Tiwbysafe1 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in) ;
//        
//        System.out.print("Enter your number ");
//        int a  = sc.nextInt() ;
//        
//        if(a%10 ==0){
//            System.out.println("หารลงเว้ยย!!! "); 
//        if(a%10 !=0) {
//            System.out.println("หารไม่ลงอิสัส!!! ");
//        }else if (a%2 == 0){
//            System.out.println("หารลงนะจุ้บๆ");
//        if(a%2 != 0){
//            System.out.println("หารไม่ลงอีกเเหละอิสัส!!");
//        }else if (a%10==0 &&a%2==0){
//            System.out.println("ลงทั่งคู่เลยนะ");
//        }
//    }   
//}
//}

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter your time in ");
//        int inhour = sc.nextInt();
//        int inmin = sc.nextInt();
//
//        System.out.print("Enter your time out ");
//        int outhour = sc.nextInt();
//        int outmin = sc.nextInt();
//
//        int intotal = (inhour*60)+inmin ;
//        int outtotal = (outhour*60)+outmin ;
//        int total = intotal - outtotal ;
//        
//        int fee = 0;
//        if (total <= 15) {
//            fee = 0;
//        } else if (total <= 180) {
//            int hourtotal = total / 60;
//            int mintotal = total % 60;
//            
//            if (mintotal != 0) {
//                hourtotal += 1 ;
//            }
//            fee = hourtotal*10;
//            
//        } else if(total <=360){
//            int hourtotal = total / 60 ; 
//            int mintotal = total % 60 ;
//            
//            if (mintotal !=0){
//                hourtotal += 60 ;
//            }
//            fee = ((hourtotal-3)*20)+30 ; 
//            
//        }else if(total>360){
//            fee = 200 ;
//        System.out.println("ค่าบริการเท่ากับ "+fee );
//    }}}

//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter your word ");
//        String a = sc.next();
//        
//        if(a.length()==6){
//            System.out.print(c(a.charAt(5)));
//            System.out.print(c(a.charAt(4)));
//            System.out.print(c(a.charAt(3)));
//            System.out.print(c(a.charAt(2)));
//            System.out.print(c(a.charAt(1)));
//            System.out.println(c(a.charAt(0)));
//         
//        }
//    }
//    public static char c(char b){
//        if(Character.isLowerCase(b)){
//            return (char)(b-32);
//        }else if(Character.isUpperCase(b)){
//            return (char)(b+32) ;
//        }
//        return b ;
//    }
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter your word : ");
//        String a = sc.next() ;
//        String c = a.toUpperCase() ;
//        char b = c.charAt(0) ;
//        System.out.println("your first word is "+b);
//        switch(b){
//            case 'A' :
//                System.out.println("A is สระ ");
//                break ;
//            case 'E' :
//                System.out.println("E is สระ ");
//                break ;
//            case 'I' :
//                System.out.println("I is สระ ");
//                break ;
//            case 'O' :
//                System.out.println("O is สระ ");
//                break ;
//            case 'U' :
//                System.out.println("U is สระ ");
//                break ;
//            default :
//                System.out.println("it's others");
//        }
//       
//    }
//        public static void main(String[] args) {
//        DecimalFormat s = new DecimalFormat("0.##");
//        
//        int a = 12 ;
//        float b = 45.0515545f ;
//        float c = a+b ;
//            System.out.println("ผลลัพท์ คือ "+s.format(c));
//    }
//    public static void main(String[] args) {
//        int n1 = 1 ;
//        int n2 = 2 ;
//        int total = (int)(Math.random()*(n2-n1+1)+n1) ;
//        System.out.println("ผลลัพท์คือ "+total);
//    }
//public static void main(String[] args) {
//        char a = 'A';
//        char b = 'Z';
//        char c = (char)(Math.random()*(b-a+1)+a) ;
//        System.out.println(c);
//    }
    public static void main(String[] args) {
        String a = "name";
        String b = "NamE";
        
        System.out.println(a.equals(b)+"\n"+(a.equalsIgnoreCase(b)));
    }
}