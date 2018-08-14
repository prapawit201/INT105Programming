
package beforemidterm;
import java.util.Scanner ;

public class javaMatchRandom {
    public static void main(String[] args) {
         Scanner sc = new Scanner (System.in);
         
         System.out.print("enter your num");
         int  a =sc.nextInt();
         
            System.out.print("enter your num");
         int  b =sc.nextInt();
         
         int c = (int)(Math.random()*(b-a+1))+a ;
         
         System.out.println("Random is "+c);
    }
//    public static void main(String[] args) {
//        int a = 1 ;
//        int b = 100 ;
//        int c = (int)(Math.random()*(b-a+1))+a ;
//        
//        System.out.println("Random is "+c);
//    }
}
