
package nextfinal;

import java.util.Scanner ;

public class AllLoopFinal {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        
//        System.out.print("Enter num : ");
//        int num = sc.nextInt();
//        
//        int a = 2 ;
//        
//        System.out.print("1 * ");
//        while(num!=1){
//            if(num%a==0){
//                num = num/a;
//                System.out.print(a+" * ");
//                a++;
//            }else{
//                a++;
//            }
//        }
//        System.out.println("\b\b\b");
//    }
    
//    public static void main(String[] args){
//      //ข้อ2
//        int  a = (int) (Math.random() * (9 - 1 + 1)) + 1;
//        int  b = (int) (Math.random() * (9 - 1 + 1)) + 1;
//        int  c = (int) (Math.random() * (9 - 1 + 1)) + 1;
//        
//        System.out.println(a + "" + b + "" + c);
//        int d = 1;
//        while(d<=1){
//            if(a>b){
//                int temp;
//                temp = a ;
//                a = b;
//                b = temp;
//            }if(b>c){
//                int temp;
//                temp = b ;
//                b = c;
//                c = temp;
//            }if(a>b){
//                int temp;
//                temp = a ;
//                a = b;
//                b = temp;
//            }
//            d++;
//        }
//        System.out.println(a + "" + b + "" + c);
//    }
    
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        
//        
//        System.out.print("Enter text : ");
//        String text = sc.nextLine();
//        
//        int a = 0;
//        int b = 1 ;
//        
//        while(a<text.length()-1){
//            
//           if(text.length()==0){
//                 b=0;
//                 System.out.println(b);
//                        
//            }
//            else if(text.charAt(a)==' '){
//                b=b+1;
//                a++;
//            }else{
//                a++;
//            }
//        }
//        System.out.println("มีคำทั้งหมด : "+b);
//    }
    
//        public static void main(String[] args) {
//            Scanner sc = new Scanner(System.in);
//            System.out.print("Enter Base : ");
//            int a = sc.nextInt();
//            System.out.print("Enter Power : ");
//            int b = sc.nextInt();
//            
//            int c = 1;
//            int d = 1 ;
//            while(c<=b){
//                d=d+a;
//                b++;
//            }
//            System.out.println(d);
//}
//        public static void main(String[] args) {
//            Scanner sc = new Scanner(System.in);
//            int a = (int)(Math.random()*(100-0+1)+1);
//            System.out.println("Com is "+a);
//            System.out.print("Ran your num : ");
//            int num = sc.nextInt();
//            while(num!=0){
//                if(num<a){
//                    System.out.println("Lower");
//                }else if(num>a){
//                    System.out.println("High");
//                }else if(num==a){
//                    System.out.println("Match");
//                }
//                System.out.print("Ran your num : ");
//                num = sc.nextInt();
//            }
//            System.out.println("End program");
 //   }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("En text ");
//        String text  = sc.nextLine();
//        
//        String b ="";
//        int a = text.length()-1;
//        while(a >=0){
//            b =b+text.charAt(a);
//            a--;
//        }
//        System.out.println(b);
//    }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter : ");
//        int num = sc.nextInt();
//        
//        int a =2 ;
//        System.out.print("1 * ");
//        while(num!=1){
//            if(num%a==0){
//                num=num/a;
//                System.out.print(a+" * ");
//              
//            }else{
//                a++;
//            }
//        }
//        System.out.println("\b\b\b");
//    }
    
    
    
    
//    public static int result(int num,int a) {
//        while(num!=1){
//            if(num%a==0){
//                num = num/a;
//                System.out.print(a+" * ");
//         
//            }else{
//                a++;
//            }
//        }
//        return num;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        
//        System.out.print("Enter num : ");
//        int num = sc.nextInt();
//        
//        int a = 2 ;
//        
//        System.out.print("1 * ");
//        int b = result(num,a);
//        System.out.println("\b\b\b");
//}
  
    
    
    
//    public static String result(int a,int b,int c,int d) {
//        while(d<2){
//            if(a>b){
//                int temp;
//                temp = a;
//                a=b;
//                b=temp;
//            }if(b>c){
//                int temp;
//                temp = b;
//                b=c;
//                c=temp;
//            }if(a>b){
//                int temp;
//                temp = a;
//                a=b;
//                b=temp;
//            }
//             d++;
//        }
//        String f = ""+a+b+c;
//        System.out.println(f);
//        return f ;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = (int)(Math.random()*(9-0+1)+0);
//        int b = (int)(Math.random()*(9-0+1)+0);
//        int c = (int)(Math.random()*(9-0+1)+0);
//        String total = ""+a+b+c;
//        System.out.println(total);
//        int d = 1;
//        
//        String e = result(a,b,c,d);
//       
//    }
    
    
    
    
//    public static int result(String a,int b, int c) {
//        while(b<a.length()-1){
//            if(a.charAt(b)==' '){
//                c=c+1;
//                b++;
//            }else{
//                b++;
//            }
//        }
//        return c;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter : ");
//        String a = sc.nextLine();
//        
//        int b=0;
//        int c=0;
//        int d = result(a,b,c);
//        System.out.println("Total word : "+d);
//    }
    
    
//    public static int result(int base,int power,int c,int d) {
//        while(c<=power){
//            d=d*base;
//            c++;
//        }
//        return d;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter base : ");
//        int base = sc.nextInt();
//        System.out.print("Enter power : ");
//        int power = sc.nextInt();
//        
//        int c = 1;
//        int d = 1;
//        
//        int e = result(base,power,c,d);
//        
//        System.out.println(e);
//    }
    
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter : ");
//        String a = sc.nextLine();
//        int b = a.length()-1;
//        String c = "";
//        while(b>=0){
//            c=c+a.charAt(b);
//            b--;
//        }
//        System.out.println(c);
//    }
    //    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("En text ");
//        String text  = sc.nextLine();
//        
//        String b ="";
//        int a = text.length()-1;
//        while(a >=0){
//            b =b+text.charAt(a);
//            a--;
//        }
//        System.out.println(b);
//    }
}