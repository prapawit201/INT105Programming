
package javaapplication2;

import java.util.Scanner;
public class JavaApplication2 {

 
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
         System.out.print("กรุณาระบุเงินที่ท่านจะถอน ค่ะ : ");
         int a = sc.nextInt();
        
        if(a>=0 && a<=20000){ 
         if(a%1 == 0){
             int b = a/1000;
             int c = (a%1000)/500;
             int f = ((a%1000)%500)/100 ;
             int g = (((a%1000)%500)%100)/10 ;
             int h = ((((a%1000)%500)%100)%10)/5 ;
             int y = (((((a%1000)%500)%100)%10)%5)/1 ;
             
             
             
             System.out.println("มีเเบงค์พัน : "+b+" มีเเบงค์ห้าร้อย : "+c+"   มีเเบงค์ร้อย : "+f+ "มีเหรียญสิบ : "+g+"มีเหรียญห้า : "+h+" มีเหรียญบาท : "+y);
         }else{
             System.out.println("Error");
         }
        }else{
            System.out.println("กรุณาเลขให้อยู่ระหว่าง1-20000");
        }
    
    
    
    
    
}
}



    
    

