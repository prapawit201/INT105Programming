/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beforemidterm;
import java.util.Scanner ;

public class AiPetch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        
        System.out.print("Enter text : ");
        String a = sc.next();
        
        String b = ""+a.charAt(3);
        String c = ""+a.charAt(2);
        String d = ""+a.charAt(1);
        String e = ""+a.charAt(0);
        
        int f = (int)(Math.random()*(999-111+1)+111) ;
        String g = ""+f ;
        String h = ""+g.charAt(2) ;
        String l = ""+g.charAt(1) ;
        String k = ""+g.charAt(0) ;
        System.out.println("Random number : "+f);
        System.out.println("Reverse Password : "+b+c+d+e+h+l+k);
    
    }
}
