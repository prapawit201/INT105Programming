
package OddnumException;

import java.util.Scanner;


public class TestExeption1 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Sentense : ");
            String a = sc.next();
            handlerException1(a);
        } catch (OddNumException a) {
            System.out.println(a);
        } finally{
            System.out.println("----FINALLY----");
        }
        System.out.println("End Program");
    }
    
    public static void handlerException1(String a) throws OddNumException {
        int num  ;
        
        for (int i = 0; i < a.length(); i++) {
            num = a.charAt(i);
            if(num %2 !=1){
                 throw new OddNumException("Error not a Odd number");
            }else{
                throw new OddNumException("Error not a Event number");
            }
        }
    }
}
