/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OopProject.pretest2;

import java.util.Scanner;

/**
 *
 * @author Windows10
 */
public class testpretest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
 
        
        pretest s1 = new pretest(0);
        pretest s2 = new pretest(0," ");
        pretest s3 = new pretest(0," "," ");
        
        System.out.print("Enter long number : ");
        s1.setId(sc.nextLong());
        
        System.out.print("Enter name : ");
        s2.setName(sc.next());
        
        System.out.print("Enter detail : ");
        s3.setDetail(sc.next());
        
        System.out.println("Your name is : "+s2.getName());
        
        System.out.println("Your long number is : "+s1.getId());
        
        System.out.println("Your detail is : "+s3.getDetail());
        
        
    }
}
