
package beforemidterm;

import java.util.Scanner ;

public class javaMytestMethod {
    public static void main(String[] args) {
         
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Enter your name ");
        String  a = sc.next();
        String b = name(a);
        
         System.out.print("Enter your num ");
         String  c = sc.next();
         String d = number(c) ;
        
        System.out.println("repass "+b+d);
     
    }
    public static String name(String a) {
        String b = ""+a.charAt(3)+a.charAt(2)+a.charAt(1)+a.charAt(0) ;
        return b ;
    }
    public static String number(String c) {
        String a = ""+c.charAt(c.length()-1)+c.charAt(c.length()-2) ;
        return a ;
    }
}
