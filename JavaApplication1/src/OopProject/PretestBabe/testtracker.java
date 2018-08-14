
package OopProject.PretestBabe;

import java.text.DecimalFormat;
import java.util.Scanner;


public class testtracker {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            DecimalFormat cs = new DecimalFormat("0.##");
            
            System.out.print("Select type of warning : ");
            char type  = sc.next().charAt(0);
            System.out.print("Enter reference position : ");
            double x1  = sc.nextDouble();
            double y1  = sc.nextDouble();
            System.out.print("Enter patient position : ");
            double x2  = sc.nextDouble();
            double y2  = sc.nextDouble();
            
            tracker s1 = new tracker(x1,y1,type);
            
            System.out.println("Distance is "+cs.format(s1.getdis(x2, y2))+" unit, Device type "+s1.getType());
    
    }
}

