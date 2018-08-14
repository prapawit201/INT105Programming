package OopProject.pretestball;


import java.text.DecimalFormat;
import java.util.Scanner;


public class TestTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat cs = new DecimalFormat("0.##");
        Tracker s1 = new Tracker();
        System.out.print("Select type : ");
        s1.setType(sc.next().charAt(0)); 
        System.out.print("reference po : ");
        s1.setX(sc.nextDouble());
        s1.setY(sc.nextDouble());
        System.out.print("patient po : ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
         
         
         
         System.out.println("Distance is : "+cs.format(s1.getdistance(x2, y2))+" unit , Device is "+s1.getType());
    
    }
}

