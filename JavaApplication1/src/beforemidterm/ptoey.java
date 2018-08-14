/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beforemidterm;
import java.util.Scanner ;
/**
 *
 * @author Windows10
 */
public class ptoey {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Password : ");
        String pass = sc.next();
        if (pass.length() == 6) {
            System.out.print(checkAndChange(pass.charAt(5)));
            System.out.print(checkAndChange(pass.charAt(4)));
            System.out.print(checkAndChange(pass.charAt(3)));
            System.out.print(checkAndChange(pass.charAt(2)));
            System.out.print(checkAndChange(pass.charAt(1)));
            System.out.println(checkAndChange(pass.charAt(0)));
        } else {
            System.out.println("ต้องมี 6 ตัวอักษร");
        }
    }

    public static char checkAndChange(char a) {
        if (Character.isLowerCase(a)) { //a>='a' && a<='z'
            return (char) (a - 32);
        } else if (Character.isUpperCase(a)) { //a>='A' && a<='Z'
            return (char) (a + 32);
        }
        return a;
    }

}

