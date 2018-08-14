package OOPbysafe.point1;

import java.util.Scanner;
import java.text.DecimalFormat;

public class testspace {
    public static double cal(double weight,String star){
            double result = 0 ;
            if(star.equalsIgnoreCase("1")){
                double temp;
                temp = weight*0.4;
                result = temp;
                System.out.println("In Mercury : "+temp);
            }else if(star.equalsIgnoreCase("2")){
                double temp;
                temp = weight*0.9;
                result = temp;
                System.out.println("In Venus : "+temp);
            }else if(star.equalsIgnoreCase("3")){
                double temp;
                temp = weight*2.5;
                result = temp;
                System.out.println("In Jupiter : "+temp);
            }else if(star.equalsIgnoreCase("4")){
                double temp;
                temp = weight*1.1;
                result = temp;
                System.out.println("In Saturn : "+temp);
            }
         return result ;
    }
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.print("Weight in Earth : ");
        double weight = sc.nextDouble();
        System.out.print("you want to go the Star(1:Mercury , 2:Venus , 3:Jupiter , 4:Saturn , 0:Exit) : ");
        String star = sc.next();
       while(weight!=0&&!star.equalsIgnoreCase("0")){
           double calculate = cal(weight,star);
           System.out.print("Weight in Earth : ");
            weight = sc.nextDouble();
            System.out.print("you want to go the Star(1:Mercury , 2:Venus , 3:Jupiter , 4:Saturn) : ");
            star = sc.next();
        }
       
       
        System.out.println("End calculate");
    }
}


