/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BabeException;

import java.util.Scanner;

/**
 *
 * @author Windows10
 */
public class TestException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Enter Number : ");
            int a = sc.nextInt();
            LException(a);
        }catch(LessException ae){
            System.out.println(ae);
        }
    }
    public static void LException(int a) throws LessException{
        if (a < 10) {
            throw new LessException("Less than 10");
        }
    }
}
