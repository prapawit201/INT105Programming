package OopProject.car;

import java.util.Scanner;

public class testcar {

    public static void main(String[] args) {

        //------------------------------------------------------------        
        car std3 = new car();
        std3.setKml(12.5);
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter BrandName : ");
        std3.setBrand(sc.nextLine());
        
        System.out.println("");
//---------------------------------------------------------------

        System.out.print("Enter add fuel : ");
        double b = sc.nextDouble();
        System.out.println("Total when add fuel : " + std3.addfuel(b) + "\n");

        System.out.print("Enter the distance : ");
        double distance = sc.nextDouble();
        System.out.print("Enter the kml : ");
        double kml = sc.nextDouble();
        System.out.println("Total is : " + std3.fuel(distance,kml));
//------------------------------------------------------------------

    }

}
