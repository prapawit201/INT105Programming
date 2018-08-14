/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beforemidterm;

public class javaEqual {
    public static void main(String[] args) {
         String a = "Hello" ;
         String b = "hello" ;
         String c = "HELLO" ;
   
        System.out.println("Total is "+a.equals(b) );
        System.out.println("Total is "+a.equals(c));
        System.out.println("Total us "+a.equalsIgnoreCase(c));
        System.out.println("Total us "+a.equalsIgnoreCase(b));
        
    }
   
    
}
