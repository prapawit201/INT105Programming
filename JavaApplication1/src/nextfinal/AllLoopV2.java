
package nextfinal;

import java.util.Scanner;

public class AllLoopV2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter sentence : ");
        String sen1 = sc.nextLine();
        String sen = sen1.toLowerCase();
        int num = 0 ;
        int a = 0 ;
        int e = 0 ;
        int i = 0 ;
        int o = 0 ;
        int u = 0 ;
        while(num<=sen.length()-1){
        if(sen.charAt(num)=='a'){
            a =a+1;
            num++;
        }else if(sen.charAt(num)=='e'){
            e =e+1;
            num++;
        }else if(sen.charAt(num)=='i'){
            i =i+1;
            num++;
        }else if(sen.charAt(num)=='o'){
            o =o+1;
            num++;
        }else if(sen.charAt(num)=='u'){
            u =u+1;
            num++;
        }else{
            num++;
        }
            
    }
        System.out.println("A has "+a);
        System.out.println("E has "+e);
        System.out.println("I has "+i);
        System.out.println("O has "+o);
        System.out.println("U has "+u);
    }
}
