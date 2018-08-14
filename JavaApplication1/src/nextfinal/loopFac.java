/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nextfinal;

import java.util.Scanner;


public class loopFac {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter num : ");
//        int a = sc.nextInt();
//        int result = 1 ;
//        for(int b = a;b>=1;b--){
//            result *= b;
//        }
//        System.out.println(""+result);
//    }
    
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter num : ");
//        int num = sc.nextInt();
//        
//        int result = 1 ;
//        for(int b=num;b>=1;b--){
//            result = result*b;
//    }
//        System.out.println("Fac of num : "+result);
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        
//        System.out.print("Enter num : ");
//        int num  = sc.nextInt();
//        
//        int result = 1;
//        
//        for(int b = num;b>=1;b--){
//            result=result*b;
//        }
//        System.out.println(result);
//    }
    
    
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        
//        System.out.print("Enter : ");
//        int a = sc.nextInt();
//        int result =1 ;
//        for(int b=a;b>1;b--){
//            result = result*b;
//        }
//        System.out.println(result);
//    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter : ");
        String senn = sc.nextLine();
        String sen = senn.toLowerCase();
        
        
        int a = 0;
        int e = 0;
        int i = 0;
        int o = 0;
        int u = 0;
        
        int q = 0;
        while(q<=sen.length()-1){
            if(sen.charAt(q)=='a'){
                a=a+1;
                q++;
            }else if(sen.charAt(q)=='e'){
                e=e+1;
                q++;
            }else if(sen.charAt(q)=='i'){
                i=i+1;
                q++;
            }else if(sen.charAt(q)=='o'){
                o=o+1;
                q++;
            }else if(sen.charAt(q)=='u'){
                u=u+1;
                q++;
            }else{
                q++;
            }
        }
        System.out.println("a : "+a);
       System.out.println("e : "+e);
       System.out.println("i : "+i);
       System.out.println("o : "+o);
       System.out.println("u : "+u);
       
    
    }  
;
//        while(total<=sen.length()-1){
//            if(sen.charAt(total)=='a'){
//                a=a+1;
//                total++;
//            }else if(sen.charAt(total)=='e'){
//                e=e+1;
//                total++;
//            }else if(sen.charAt(total)=='i'){
//                i=i+1;
//                total++;
//            }else if(sen.charAt(total)=='o'){
//                o=o+1;
//                total++;
//            }else if(sen.charAt(total)=='u'){
//                u=u+1;
//                total++;
//            }else if(sen.charAt(total)==' '){
//                spa=spa+1;
//                total++;
//            }else{
//                total++;
//            }
//            
//        }
//        System.out.println("A : "+a);
//        System.out.println("E : "+e);
//        System.out.println("I : "+i);
//        System.out.println("O : "+o);
//        System.out.println("U : "+u);
//        System.out.println("Space : "+spa);
//    
    }

