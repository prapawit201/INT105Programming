/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beforemidterm;

import java.util.Scanner;

public class oldtest {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in) ;
//        System.out.print("Enter your password is : " );
//        String a  = sc.next() ;
//        if(a.length()==6){
//        System.out.print(charac(a.charAt(5)));
//        System.out.print(charac(a.charAt(4)));
//        System.out.print(charac(a.charAt(3)));
//        System.out.print(charac(a.charAt(2)));
//        System.out.print(charac(a.charAt(1)));
//        System.out.println(charac(a.charAt(0)));
//        }else{
//            System.out.println("ต้องมี6ตัวเท่านั้นนะจ้ะ");
//        }   
//    }
//  
//    public static char charac(char a) {
//        if(Character.isLowerCase(a)){
//            return (char)(a-32) ;            
//        }else if(Character.isUpperCase(a)){
//            return (char)(a+32) ;
//        }
//        return a ;
//    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your password is : ");
        String a = sc.next();
        
        String b = ""+a.charAt(a.length()-1)+a.charAt(a.length()-2)+a.charAt(a.length()-3)+a.charAt(a.length()-4)+a.charAt(a.length()-5)+a.charAt(a.length()-6) ;
    
        int c = (int)(Math.random()*(999-111+1)+111);
        String d = ""+c ;
        
        String e = ""+d.charAt(d.length()-1)+d.charAt(d.length()-2)+d.charAt(d.length()-3) ;
        System.out.println("รหัสผ่านเธอคือ : "+b+"\n"+"สุมเลขที่ได้คืออออ : "+c+"\n"+"เอามันreverseเเล้วจะได้ : "+b+e);
    }
}
