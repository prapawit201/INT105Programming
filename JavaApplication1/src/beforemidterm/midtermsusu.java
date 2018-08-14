/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beforemidterm;
import java.util.Scanner ;

public class midtermsusu {
//    public static void main (String[] args){
//        Scanner sc = new Scanner(System.in) ;
//        System.out.print("Enter your number in the week : " );
//        
//        int a = sc.nextInt();
//        
//        switch(a){
//            case 1 :
//                System.out.println("Monday");
//                break;
//            
//            case 2 :
//                System.out.println("Tuesday");
//                break ;
//                
//            case 3 :
//                System.out.println("Wednesday");
//                break ;
//                
//            case 4 :
//                System.out.println("Thursday");
//                break ;
//                
//            case 5 :
//                System.out.println("friday");
//                break ;
//                
//            case 6 :
//                System.out.println("Saturday");
//                break ;
//                
//            case 7 :
//                System.out.println("Sunday");
//                break ;
//        
//            default : 
//                System.out.println("No This number");
//        }
//    }
//    public static void main(String[] args){
//        String result = a(60130500051L,"prapawit","prasoppanit","babe");
//        System.out.println(result); 
//        
//    }
//    public static String a(long id,String name,String surname,String nickname ){
//        String a = ""+id+" "+name+" "+surname+" "+nickname;
//        return a ;
//    }
//    public static void main (String[] args){
//        float celsius = 50.0f ;
//        float fahrenheit = (celsius*9/5)+32 ;
//        System.out.println(fahrenheit);
//        
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in) ;
//        
//        System.out.print("Enter your subject 1 : ");
//        String subject1 = sc.next();
//        System.out.print("Enter your score 1 : ");
//        int score1 = sc.nextInt();
//        
//        System.out.print("Enter your subject 2 : ");
//        String subject2 = sc.next();
//        System.out.print("Enter your subject 2 : ");
//        int score2 = sc.nextInt();
//        
//        int totascore = (score1+score2)*1000 ;
//        
//        String reverse1 = subject1.substring(3);
//        String reverse2 = subject2.substring(3);
//        
//        System.out.println("reverse subject : "+reverse1+" "+reverse2+"\n"+"totalscore is : "+totascore);
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in) ;
//        System.out.print("ใส่ชื่อสิตัวเอง : ");
//        String a  = sc.next();
//        
//        String b = ""+a.charAt(a.length()-1)+a.charAt(a.length()-2)+a.charAt(a.length()-3)+a.charAt(a.length()-4)+a.charAt(a.length()-5)+a.charAt(a.length()-6) ;
//        int c = (int)(Math.random()*(100-1+1)+1);
//        System.out.println("your num random is "+c+"\n"+"your name is : "+b+c);
        
        
    //}
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter yiur number");
//        int a = sc.nextInt();
//        
//        if(a%10 == 0){
//            System.out.println("หารลงตัวจ่ะ");
//            if(a%20 == 0){
//                System.out.println("หารลงตัวทั้ว10เเละ20ล่ะจ่ะ");
//            }
//        }if(a%10 ==0 && a%20 !=0 ){
//            System.out.println("มึงหารด้วย10ลงเเต่20ไม่ลง");
//        }else {
//            System.out.println("มึงหารด้วย10เเละ20ไม่ลง");
//        }
//    }
//     public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int HourIn, MinIn, HourOut, MinOut,Mintt,RateH,RateM,Value;
//        System.out.print("Time In: ");
//        HourIn=input.nextInt();
//        MinIn=input.nextInt();
//        System.out.print("Time Out: ");
//        HourOut=input.nextInt();
//        MinOut=input.nextInt();
//        Mintt=((HourOut*60)-(HourIn*60))+(MinOut-MinIn);
//        
//        if(Mintt<=15){
//            Value=0;
//        }else if(Mintt<=180){
//            RateH=Mintt/60;
//            RateM=Mintt%60;
//            if(RateM==0){
//                RateH=RateH+0;
//            }else{
//                RateH=RateH+1;
//            }
//            Value=RateH*10;
//        }else if(Mintt<=360){
//            RateH=Mintt/60;
//            RateM=Mintt%60;
//            if(RateM==0){
//                RateH=RateH+0;
//            }else{
//                RateH=RateH+1;
//            }
//            Value=30+(RateH-3)*20;
//        }else{
//            Value=200;
//        }
//        
//        System.out.println("Min: "+Mintt+" mins");
//        System.out.println("Value: "+Value+" baht");
//    }*/
public static void main(String[] args) {
        
        Scanner sc  =  new Scanner(System.in);
        System.out.println("เลขคือ : ");
        int a = sc.nextInt() ;
        if(a>5){
            System.out.println("more than 5");
        }else if(a<5){
               System.out.println("less than 5");
            }
                   else if(a==5){
               System.out.println("eual 5 ");
           }
        }
    


}
        
        
        
        
        
        
        
    

