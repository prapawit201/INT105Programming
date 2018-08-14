wqd
package OopProject.oopMim2;

import java.util.Scanner;

public class testbook {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Book name : ");
        String name = sc.nextLine();
        
        
        System.out.print("Category : ");
        String category = sc.next();
        sc.nextLine();
        
        book s1 = new book(name,category);
        System.out.println("--------------------");
        
        System.out.print("Book name : ");
        name = sc.nextLine();
        
        System.out.print("Category : ");
        category = sc.next();
        sc.nextLine();
        
        book s2 = new book(name,category);
        System.out.println("--------------------");
        
        System.out.print("Book name : ");
        name = sc.nextLine();
        
        System.out.print("Category : ");
        category = sc.next();
        sc.nextLine();
        
        book s3 = new book(name,category);
        System.out.println("--------------------");
        
        System.out.print("Book name : ");
        name = sc.nextLine();
        
        System.out.print("Category : ");
        category = sc.next();
        sc.nextLine();
        
        book s4 = new book(name,category);
        System.out.println("--------------------");
      
        System.out.println("Lan : "+book.getCountlan());
        System.out.println("Sci : "+book.getCountsci());
        
        
    }
}
