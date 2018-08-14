/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package safetiwfinal.Exception;

import java.util.Scanner;

public class TestException {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Sentense : ");
            String a = sc.next();
            handlerExeption(a);
        } catch (NotANumberException ae) {
            System.out.println(ae);
        } finally{
            System.out.println("----FINALLY----");
        }
        System.out.println("End Program");
    }
    public static void handlerExeption(String a) throws NotANumberException {
        int num  ;
        int zero = (int)'0';
        int nine = (int)'9';
        
        for (int i = 0; i < a.length(); i++) {
            num = a.charAt(i);
            if((num<zero)||(num>nine)){
                   throw new NotANumberException("Error not a number"); 
            }
        }
    }
}
