
package nextfinal;

import java.util.Scanner;


public class Loopยกกำลัง {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter num : ");
        int num = sc.nextInt();
        
        System.out.print("Enter power : ");
        int power = sc.nextInt();
        
        int a = 1;
        int b = 1;
        while(a<=power){
            b = b*num;
            a++;
        }
        System.out.println(b);
        
        
    }
}
