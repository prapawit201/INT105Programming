/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beforemidterm;

public class javaLastLesson {
//    public static void main(String[] args) {
//        int a  = 30;
//        int b  = (30*5/6)+32 ;
//        System.out.println("Total calsiua is "+a+"celsius"+"="+b+"fahrenheit");
//    }
        public static void main(String[] args) {
        
            String b = a("prapawit","prasoppanit","60130500051");
            System.out.println("Total is "+b);
            
    }
        public static String a(String name,String surname,String number) {
            String namecard = "student id "+name+surname+"\n"+"Student id "+number ;
            return namecard ;
            
        
    }
}
