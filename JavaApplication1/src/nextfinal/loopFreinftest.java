/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nextfinal;

import java.util.Scanner;

/**
 *
 * @author Windows10
 */
public class loopFreinftest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = (int)(Math.random()*(9-0+1)+0);
        int b = (int)(Math.random()*(9-0+1)+0);
        int c = (int)(Math.random()*(9-0+1)+0);
        int d = (int)(Math.random()*(9-0+1)+0);
        int e = (int)(Math.random()*(9-0+1)+0);
        int f = (int)(Math.random()*(9-0+1)+0);
    
        String aa = ""+a+b+c+d+e+f;
        System.out.println("The Random is "+aa);
        int n = 1 ;
        while(n==1){
            System.out.print("Enter num : ");
            String num = sc.next();
            
            if(num.length()-1==aa.length()-1){
                if (num.equals(aa)) {
                    System.out.println("Reward 1");
                }else if (num.substring(3).equals(aa.substring(3))) {
                    System.out.println("Reward 2");
                }else if (num.substring(4).equals(aa.substring(4))) {
                    System.out.println("Reward 3");
                }
            }else if (num.equals("0")) {
                System.out.println("End game");break;
            }else{
                System.out.println("Please try again");
            }
        }
    }
}
