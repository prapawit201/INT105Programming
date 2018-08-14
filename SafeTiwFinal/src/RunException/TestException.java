/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RunException;


import java.util.Scanner;

/**
 *
 * @author Windows10
 */
public class TestException {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Enter Message : ");
            String ba = sc.next();
            BAException(ba);
        }catch(AException ex){
            System.out.println(ex);
        }
    }
    public static void BAException(String ba)throws AException{
        for (int i = 0; i <ba.length(); i++) {
            if (ba.charAt(i)== 'a') {
                throw new AException("IT a");
            }
        }
    }
}
