/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nextfinal;

import java.util.Scanner;

/**
 *
 * @author Windows10
 */
public class AllLoop {
//    public static int result() {
//        int result = 0 ; 
//        return result ;
//    }
//    public static void  shuffle() {
//        Scanner sc = new Scanner(System.in);
//        
//        int b = result();
//
//        while(b == 0 ){
//            
//            System.out.print("Enter Your Scissor(1) Paper(2) Hammer(3) : ");
//            int m = sc.nextInt();
//            int a = (int)(Math.random()*(3-1+1)+1);
//            
//            if (m==0) {
//                System.out.println("End The Game");
//                System.out.println("Thank You ^^"+"\n");
//                break;
//            }else if(m==1 && a==2){
//                System.out.println("You Win The Game");
//                System.out.println("Computer is : "+a+"\n");
//            }else if(m==2 && a==3){
//                System.out.println("You Win The Game");
//                System.out.println("Computer is : "+a+"\n");
//            }else if(m==3 && a==1){
//                System.out.println("You Win The Game");
//                System.out.println("Computer is : "+a+"\n");
//            }else if(m==a){
//                System.out.println("You DRAW With com");
//                System.out.println("Try it Again"+"\n");
//            }else{
//                System.out.println("You Lose the game Try it!! "+"\n");
//            } 
//    
//        }
//    }
//    public static void main(String[] args) {
//                
//            shuffle();
//            
//        }

//        public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//            System.out.print("Enter base : ");
//            int base =sc.nextInt();
//
//            System.out.print("Enter power : ");
//            int power =sc.nextInt();            
//            
////            int count = 1 ;
////            int result = 1 ;
////            while( count <= power ){
////                result *= base;
////                count++;
////                System.out.println(""+result);
////            }
//           
//            int count = 1 ;
//            int result = 1 ;
//            while(count<=power){
//                result *= base;
//                count++;
//                System.out.println(result);
//            }
//            
//        
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        
//        System.out.print("Enter Based : ");
//        int a = sc.nextInt();
//        System.out.print("Enter Power : ");
//        int b = sc.nextInt();
//        
//        int power = 1 ;
//        int result =1 ;
//        while(power<=b){
//           result*=a;
//            power++;
//            
//            
//        }System.out.println(result);
//    }
//    public static int random () {
//        int b = (int) (Math.random() * (100 - 1 + 1) + 1);
//        return b ;
//    }
//    public static void main() {
//         Scanner sc = new Scanner(System.in);
//       
//        int b = random();
//
//        
//         int result = 0;
//         while (result == 0) {
//                
//              System.out.print("Enter num : ");
//              int a = sc.nextInt();
//            
//            if (a == 0) {
//                System.out.println("Match");
//                break;
//            } else if (a < b) {
//                System.out.println("Low");
//                System.out.println(b);
//            } else if (a > b) {
//                System.out.println("High");
//                System.out.println(b);
//            } else {
//                System.out.println("Match");
//                System.out.println(b);break;
//            }
//
//        }
//    }
//    public static void main(String[] args) {
//       
//        main();
//    }
//    public static void main(String[] args) {
//        int result = 1 ;
//        while(result==1){
//            Scanner sc = new Scanner(System.in);
//        System.out.print("Enter num : ");
//        int a = sc.nextInt();
//        System.out.print("Enter num : ");
//        int b = sc.nextInt();
//        
//            System.out.println("Total is "+(a+b));
//        }
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Please input n : ");
//      
//      int result = 1;
//      int n = sc.nextInt(); 
//
//      for (int i = n; i >= 1; i--) { 
//         result *= i; 
//      
//      }
//        System.out.println("Result = " + result);
//     Scanner sc = new Scanner(System.in);
//        String password = "" ; 
//        do{
//            System.out.print("Create lock password (3 number): ");
//            password = sc.next();
//            if(password.length()!=3){
//                System.out.println("Please enter only 3 number"+"\n");
//            }
//        }while(password.length()!=3);
//
//        check(password) ; 
//    }
//    public static void check(String password){
//        Scanner sc = new Scanner(System.in);
//        String passwordIn = "";
//        int count = 5 ;
//        while((!passwordIn.equals(password)) && (count>=0)){
//            System.out.print("Enter password 3 number to unlock : ");
//            passwordIn = sc.next();
//            if(passwordIn.length()==3){
//                if(!passwordIn.equals(password)){
//                    System.out.println("Incorrect! Try again."+"(Remaining : "+count+")"+"\n" );
//                    count-- ;
//                }else if(passwordIn.equals(password)){
//                    System.out.println("Correct ! ");
//                }
//                if(count<0){
//                    System.out.println("key is locked");
//                }
//            }else{
//                System.out.println("Please enter only 3 number"+"\n");   
//            }
//        }
//            public static void main(String[] args) {
//        
//    
//        int num1 = (int) (Math.random() * (9 - 1 + 1)) + 1;
//        int num2 = (int) (Math.random() * (9 - 1 + 1)) + 1;
//        int num3 = (int) (Math.random() * (9 - 1 + 1)) + 1;
//
//        while ((num1 == num2 || num1 == num3 || num2 == num3) || !(num1 >num2 && num2 > num3)) {
//            num1 = (int) (Math.random() * (9 - 1 + 1)) + 1;
//            num2 = (int) (Math.random() * (9 - 1 + 1)) + 1;
//            num3 = (int) (Math.random() * (9 - 1 + 1)) + 1;
//        }
//
//        System.out.println(num1 + "" + num2 + "" + num3);
//    
//           if(num1>num2){
//               int temp ;
//                temp = num1 ;
//                num1 = num2 ;
//                num2 = temp ;
//           }if(num2>num3){
//               int temp ;
//               temp = num2 ;
//               num2 = num3 ;
//               num3 = temp ;
//           }if(num1>num2){
//               int temp ; 
//               temp = num1 ;
//               num1 = num2 ;
//               num2 = temp ;
//           }
//           System.out.println(num1+" "+num2+" "+num3);
//    }
//}
//        public static void main(String[] args) {
//            Scanner sc = new Scanner (System.in);
//            System.out.print("Enter num : ");
//            int a  = sc.nextInt();
//            int result = 1 ;
//            
//            for(int b =a;b>=1;b--){
//                result *= b;
//                
//            }
//            System.out.println("result : "+result);
//    }    
//         public static void main(String[] args) {
//             Scanner sc = new Scanner(System.in);
//             System.out.print("Enter num : ");
//             int a = sc.nextInt();
//             
//             int result = 1 ;
//             for(int i =a;i >=1;i--){
//                 result *=i;
//             }
//             System.out.println("result : "+result);
//    }
//    public static int result(int a, int b) {
//
//        int power = 1;
//        int result = 1;
//        while (power <= b) {
//            result *= a;
//            power++;
//        }
//        
//        return result;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter num : ");
//        int a = sc.nextInt();
//        System.out.print("enter power : ");
//        int b = sc.nextInt();
//        int c = result(a, b);
//        System.out.println("" + c);
//        
//        
    //        int i = 0;
    //        for(i=0;i<=9;i++){
    //            System.out.println(""+i);
    //            
    //        }
    //          while(i<=9){
    //              i++;
    //               System.out.println(""+i);
    //         }
    //        do {
    //            System.out.println("" + i);
    //            i++;
    //
    //        } while (i <= 9);
   

//    public static void main(String[] args) {
//            Scanner sc = new Scanner(System.in);
//            System.out.print("Enter num : ");
//            int a = sc.nextInt();
//            System.out.print("Enter power : ");
//            int b = sc.nextInt();
//            int  power = 1 ;
//            int result = 1 ;
//            while(power<=b){
//                result *= a;
//                power++;
//            }
//            System.out.println(""+result);
//    }
    
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter num : ");
//        int a  = sc.nextInt();
//        int result = 1 ;
//        for(int i=a;i>=1;i--){
//            result*=i ;
//              System.out.println(""+result);
//        }
//      
//    }
    
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter num : ");
//        int factor = sc.nextInt();
//
//        int devide = 2;
//        System.out.print("Result : 1 X ");
//        while (factor != 1) {
//            if (factor % devide == 0) {
//                factor /= devide;
//                System.out.print(devide + " X ");
//            } else {
//                devide++;
//            }
//        }
//        System.out.println("\b\b\b");
//    }
//    public static int num() {
//        int a =(int)(Math.random()*(9-1+1)+1);
//        return a;
//    }
//    public static void Topic() {
//        Scanner sc = new Scanner(System.in);
//       int a =num();
//        int c =1 ;
//        while(c==1){
//            System.out.print("Enter num : ");
//            int b = sc.nextInt();
//            if(b==a){
//                System.out.println("Match Yeah!!!");
//                System.out.println("Com is "+a);break ;
//            }else if(b<a){
//                System.out.println("Lower");
//            }else if(b>a){
//                System.out.println("High");
//            }
//        }
//    }
//    public static void main(String[] args) {
//        Topic();
//        
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter num : ");
//         int b = sc.nextInt();
////        
////         for(int a=1;a<=b+1;a++){
////             for(int i =1;i<a;i++){
////                 System.out.print(i);
////             }System.out.println("");
////         }
//     
////        int result = 1 ;
////        for(int i=b;i>=1;i--){
////            result *= i;
////            
////        }System.out.println(""+result);
//          System.out.print("Enter power : ");
//          int c = sc.nextInt();
//          int power  =1;
//          int result =1;
//          
//          while(power<=c){
//              result  *= b;
//              power++;
//              
//          }System.out.println(""+result);
//    }
//    public static void main(String[] args) {
//        
//    Scanner sc = new Scanner(System.in);
//        System.out.print("Enter num : ");
//        int a = sc.nextInt();
//        
//        System.out.print("Enter power : ");
//        int b = sc.nextInt();
//        
//        int power = 1 ;
//        int result = 1 ;
//        
//        while(power<=b){
//            result *= a;
//            power++;
//        }System.out.println(""+result);
//}

    
//    // Loop factorial
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("en num : ");
//        int a  = sc.nextInt();
//      int result = 1 ;
//        for(int b=a;b>=1;b--){
//          result *= b;
//        }System.out.println(""+result);
//    }
//    
//    
//    
//    
//    // Loop เช้ค a e i o u
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        
//        System.out.print("Enter your sentence : ");
//        String aaa = sc.nextLine();
//        String aa = aaa.toLowerCase();
//        
//        int a = 0;
//        int e = 0;
//        int i = 0;
//        int o = 0;
//        int u = 0;
//   
//        int r=0;
//        int word =0;
//        
//        while(word<=aa.length()-1){
//            if(aa.charAt(word)=='a'){
//                a=a+1;
//                word++;
//            }if(aa.charAt(word)=='e'){
//                e=e+1;
//                word++;
//            }if(aa.charAt(word)=='i'){
//                i=i+1;
//                word++;
//            }if(aa.charAt(word)=='o'){
//                o=o+1;
//                word++;
//            }if(aa.charAt(word)=='u'){
//                u=u+1;
//                word++;
//            }
//        }
//        System.out.println("A has : "+a);
//        System.out.println("E has : "+e);
//        System.out.println("I has : "+i);
//        System.out.println("O has : "+o);
//        System.out.println("U has : "+u);
//        
//        
//    }
    
//โจทย์Loop Oliv
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        System.out.print("Enter num : ");
//        int num = sc.nextInt();
//        
//        int b = 2 ;
//        System.out.print("1 * ");
//        
//        while(num!=1){
//            if(num%b==0){
//                num=num/b;
//                System.out.print(b+" * ");
//            }else{
//                b++;
//                
//            }
//            
//        }
//        System.out.println("\b\b\b");
//    }
    public static void main(String[] args) {
        String a = "31s21";
        String b = "11" ;
        int c = a.indexOf("3");
        System.out.println(c);
    }
}

