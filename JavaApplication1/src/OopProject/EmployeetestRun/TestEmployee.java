package OopProject.EmployeetestRun;


import java.util.Scanner;

public class TestEmployee {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Employee name : ");
    String name = sc.next();
    employee s1 = new employee(name);
    
        System.out.println("--------------------");
        
        System.out.print("Em name : ");
        name = sc.next();
        System.out.print("salary : ");
        double sa = sc.nextDouble();
        System.out.print("Type : ");
        boolean type = sc.next().equalsIgnoreCase("Fulltime");
        employee s2 = new employee(name,sa,type);
        
        System.out.println("----------------------");
    
        System.out.print("Em name : ");
        name = sc.next();
        System.out.print("salary : ");
        sa = sc.nextDouble();
        System.out.print("Type : ");
        type = sc.next().equalsIgnoreCase("Fulltime");
        employee s3 = new employee(name,sa,type);
        
        System.out.println("----------------------");
    
        System.out.print("Em name : ");
        name = sc.next();
        System.out.print("salary : ");
        sa = sc.nextDouble();
        System.out.print("Type : ");
        type = sc.next().equalsIgnoreCase("Fulltime");
        employee s4 = new employee(name,sa,type);
        
        System.out.println("----------------------");
        
        System.out.println("Numbertotal : "+employee.getCountall());
        System.out.println("Fulltime : "+employee.getCountful());
        System.out.println("Parttime : "+employee.getCountpart());
        
    }
    
}
