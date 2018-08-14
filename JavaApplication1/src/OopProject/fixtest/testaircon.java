
package OopProject.fixtest;

import java.util.Scanner ;

public class testaircon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        aircon s1 = new aircon("T002","mitsubishi",false);
        s1.toocold();
        s1.setStatus(true);
        s1.toocold();
        System.out.println(s1.convertToFah());
        
        System.out.println("---------------");
        s1.toowarm();
        System.out.println(s1.convertToFah());
    }
}
