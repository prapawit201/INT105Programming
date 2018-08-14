
package employee;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class employeeTest {
    public static void main(String[] args) {
        String test_name = "Babe";
        person emp = new employee(test_name);
        System.out.println(emp);
        
        person std  = new student("Run",student.Status.senior);
        System.out.println(std);
        System.out.println(std.getsignature());
        person[] person = new person[5];//ใช้Objectได้ เพราะ ใหญ่สุด ใช้เเทนpersonได้เหมือนกัน
        person[0]=new employee("Tan");
        person[1]=new student("KET",student.Status.junior);
        person[2]=new student("IKE",student.Status.sophomore);
        person[3]=new staff("AUU","INfrastructure");
        person[4]=new employee("Tony");
        ((student)person[1]).getStatus();
       
        student std1 = new student("MITH",student.Status.freshman);
        student std2 = new student("MITH",student.Status.freshman);
        if(std1.equals(std2)){
            System.out.println("std1==std2");
        }
        
        for(int i = 0 ;i<person.length;i++){
            System.out.println("------------------");
            System.out.println(person[i].toString());
        }
        System.out.println(person[0] instanceof employee);
    }
    @Test
    public void setnametoemployee() {
        String test_name = "ICE";
        person emp = new person(test_name);
        System.out.println(emp);
        assertEquals(test_name, emp.getName());
        
    }

    
}
