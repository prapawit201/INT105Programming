
package OopProject.oopMim;

import java.util.Scanner ;

public class testperson {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Person name : ");
        String name = sc.nextLine();
        
        System.out.print("Gender : ");
        String gender = sc.next();
        sc.nextLine();
        person s1 = new person();
        System.out.println("--------------");
        
        System.out.print("Person name : ");
        name = sc.nextLine();
        
        System.out.print("Gender : ");
        gender = sc.next();
        sc.nextLine();
        person s2 = new person();
        System.out.println("--------------");
        
        System.out.print("Person name : ");
        name = sc.nextLine();
       
        System.out.print("Gender : ");
        gender = sc.next();
        sc.nextLine();
        person s3 = new person();
        System.out.println("--------------");
        
        System.out.print("Person name : ");
        name = sc.nextLine();
        
        System.out.print("Gender : ");
        gender = sc.next();
        sc.nextLine();
        person s4 = new person();
        System.out.println("--------------");
        
        System.out.print("Person name : ");
        name = sc.nextLine();
        
        System.out.print("Gender : ");
        gender = sc.next();
        sc.nextLine();
        person s5 = new person();
        System.out.println("--------------");
        
        System.out.println("Total person : "+person.getCountall());
    }
}
