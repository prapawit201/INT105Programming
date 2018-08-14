
package OopProject.testsafe;

import OopProject.BlogSafe.Blog;
import java.util.Scanner;


public class testsafe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Author name : ");
        String name = sc.next();
        System.out.print("Can visible(yes,no) : ");
        String visi = sc.next();
        System.out.print("Topic : ");
        String Topic = sc.next();
        System.out.print("Content : ");
        String con = sc.next();
        
        safe s1 = new safe();
        
        System.out.println("---------------------");
        
        System.out.print("Author name : ");
        name = sc.next();
        System.out.print("Can visible(yes,no) : ");
        visi = sc.next();
        System.out.print("Topic : ");
        Topic = sc.next();
        System.out.print("Content : ");
        con = sc.next();
        
        safe s2 = new safe();
        
        System.out.println("---------------------");
        
        
        System.out.print("Author name : ");
        name = sc.next();
        System.out.print("Can visible(yes,no) : ");
        visi = sc.next();
        System.out.print("Topic : ");
        Topic = sc.next();
        System.out.print("Content : ");
        con = sc.next();
        
        safe s3 = new safe();
        
        System.out.println("---------------------");
        
        System.out.println("+++++summary info+++++");
        System.out.println("press1 - number of blog");
        System.out.println("press2 - number of visible blog");
        System.out.println("press3 - number of invisible blog");
        System.out.println("press0 - Exit");
        
        System.out.println("----------------------");
        
        System.out.print("Enter function : ");
        int num = sc.nextInt();
        while(num!=0){
            if(num==1){
                System.out.println("Number of blog : "+safe.getCountblog());
            }else if(num==2){
                System.out.println("Number of visible : "+safe.getCountvi());
            }else if(num==3){
                System.out.println("Number of invisible : "+safe.getCountinvi());
            }
            System.out.print("Enter function : ");
            num = sc.nextInt();
        }

    }
}
