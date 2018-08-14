package nextfinal;

import java.util.Scanner;

/**
 *
 * @author Windows10
 */
public class Tiwbysafe {

//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//
//        switch (a) {
//            case 1:
//                System.out.println("monday");
//                break;
//            case 2:
//                System.out.println("tuesday");
//                break;
//            case 3:
//                System.out.println("wendesday");
//                break;
//            case 4:
//                System.out.println("thursday");
//                break;
//            case 5:
//                System.out.println("friday");
//                break;
//            case 6:
//                System.out.println("saturday");
//                break;
//            case 7:
//                System.out.println("sunday");
//                break;
//            default :
//                System.out.println("No days");
//            
//        }
//
//    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        
        System.out.print("Enter your month ");
        int month = sc.nextInt();
        
        System.out.print("Enter your year ");
        int y =sc.nextInt() ;
        int year = y-543 ;
        
        switch(month){
            case 1 :
                System.out.println("January " + (year-543) + "  has 29 days");
                break ;
            case 2 :
                if(year%4 == 0 && 100!=year || year%400 == 0){
                System.out.println("Febuary  " + (year) + "  has 29 days");
                }else{
                System.out.println("Febuary  " + (year) + "  has 28 days");
                }break ;
            case 3 :
                System.out.println("มีนาคม " + (year) + "  has 29 days");
                break ;
            case 4 :
                System.out.println("เมษายน  " + (year) + "  has 30 days");
                break ;
            case 5 :
                System.out.println("พฤษภาคม " + (year) + "  has 31 days");
                break ;
            case 6 :
                System.out.println("มิถุนายน  " + (year) + "  has 30 days");
                break ;
            case 7 :
                System.out.println("กรกฎาคม " + (year) + "  has 31 days");
                break ;
            case 8 :
                System.out.println("สิงหาคม " + (year) + "  has 31 days");
                break ;
            case 9 :
                System.out.println("กันยายน " + (year) + "  has 30 days");
                break ;
            case 10 :
                System.out.println("ตุลาคม  " + (year) + "  has 31 days");
                break ;    
            case 11 :
                System.out.println("พฤศจิกายน " + (year) + "  has 30 days");
                break ;
            case 12 :
                System.out.println("ธันวาคม  " + (year) + "  has 31 days");
                break ;
            default :
                System.out.println("No Moth bro ");
        }
    }
//        public static void main(String[] args) {
//        
//    }
}
