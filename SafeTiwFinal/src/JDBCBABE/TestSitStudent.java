
package JDBCBABE;

import java.sql.SQLException;
import java.util.Scanner;


public class TestSitStudent {

    /**
     *
     * @param args
     */
    public static void main(String[] args)  {
        try{
            int func;
            Scanner sc = new Scanner(System.in);
            StudentController stu = new StudentController("sit","sit");
            System.out.print("(1)Add , (2)Search : " );
            func= sc.nextInt();
            while(func != 0){
                if (func == 1) {
                    System.out.println("(1)Add : ");
                    System.out.print("Name : ");
                    String name  = sc.next();
                    System.out.print("Number : ");
                    int number = sc.nextInt();
                    System.out.print("Faculty : ");
                    String faculty = sc.next();
                    int rec = stu.addStudent(name, number, faculty);
                    System.out.println("Inserted"+rec+"records");
                }else if (func ==2) {
                    System.out.println("(2)Search : ");
                    System.out.print("Enter name : ");
                    String name = sc.next();
                    stu.findFaculty(name);
                }
                System.out.println("----------------");
                System.out.println("(1)Add (2)Search : ");
                func = sc.nextInt();
            }
            stu.Closeconnection();
            System.out.println("Good Bye");
        }catch(SQLException ex){
            System.out.println(ex);
        }catch(ClassNotFoundException ex){
            System.out.println(ex);
        }
    }
}
