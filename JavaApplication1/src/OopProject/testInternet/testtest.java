
package OopProject.testInternet;

import java.util.Scanner;

public class testtest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println(test.getField());
        
        System.out.print("Square name : ");
        String a = sc.next();
        System.out.print("Enter widgth : ");
        int total = sc.nextInt();
        test s1 = new test(total);
        
        System.out.println(s1);
        System.out.println(test.getField());
        
        System.out.println("---------------------");
        
        System.out.print("Square name : ");
         a = sc.next();
        System.out.print("Enter widgth : ");
        total = sc.nextInt();
        test s2 = new test(total);
        
        System.out.println(s2);
        System.out.println(test.getField());
        
        System.out.println("---------------------");
        
        System.out.print("Square name : ");
         a = sc.next();
        System.out.print("Enter widgth : ");
        total = sc.nextInt();
        test s3 = new test(total);
        
        System.out.println(s3);
        System.out.println(test.getField());
        
        System.out.println("---------------------");
        
        System.out.println("จำนวนsquare : "+test.getField());
        
        
    }
}
