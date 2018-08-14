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
public class loopMyTest {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        System.out.print("Enter you sentence : ");
//        String sen = sc.nextLine();
//        
//        int a = 0;
//        int e = 0;
//        int i = 0;
//        int o = 0;
//        int u = 0;
//        
//        int word = 0 ;
//        while(word<=sen.length()-1){
//            if(sen.charAt(word)=='a'){
//                a = a+1;
//                word ++;
//            }else if(sen.charAt(word)=='e'){
//                e = e+1;
//                word ++;
//            }else if(sen.charAt(word)=='i'){
//                i = i+1;
//                word ++;
//            }else if(sen.charAt(word)=='o'){
//                o = o+1;
//                word ++;
//            }else if(sen.charAt(word)=='u'){
//                u = u+1;
//                word ++;
//            }else{
//                word++;
//            }
//        }
//        System.out.println("A has "+a);
//        System.out.println("E has "+e);
//        System.out.println("I has "+i);
//        System.out.println("O has "+o);
//        System.out.println("U has "+u);
//    }
    
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter your sentence : ");
//        String tennse = sc.nextLine();
//        String tense = tennse.toLowerCase();
//        
//        int a = 0 ;
//        int e = 0 ;
//        int i = 0 ;
//        int o = 0 ;
//        int u = 0 ;
//        
//        int word = 0 ;
//        
//        while(word<=tense.length()-1){
//            if(tense.charAt(word)=='a'){
//                a =a+1;
//                word++;
//            }else if(tense.charAt(word)=='e'){
//                e =e+1;
//                word++;
//            }else if(tense.charAt(word)=='i'){
//                i=i+1;
//                word++;
//            }else if(tense.charAt(word)=='o'){
//                o =o+1;
//                word++;
//            }else if(tense.charAt(word)=='u'){
//                u =u+1;
//                word++;
//            }else{
//                word++;
//            }
//        }
//        System.out.println("Output A : "+a);
//        System.out.println("Output E : "+e);
//        System.out.println("Output I : "+i);
//        System.out.println("Output O : "+o);
//        System.out.println("Output U : "+u);
//    
//    
//    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sentence : ");
        String senn = sc.nextLine();
        
        String sen = senn.toLowerCase();
        
        int a = 0 ;
        int e = 0 ;
        int i = 0 ;
        int o = 0 ;
        int u = 0 ;
        int spa = 0 ;
        int total = 0 ;
        while(total<=sen.length()-1){
            if(sen.charAt(total)=='a'){
                a=a+1;
                total++;
            }else if(sen.charAt(total)=='e'){
                e=e+1;
                total++;
            }else if(sen.charAt(total)=='i'){
                i=i+1;
                total++;
            }else if(sen.charAt(total)=='o'){
                o=o+1;
                total++;
            }else if(sen.charAt(total)=='u'){
                u=u+1;
                total++;
            }else if(sen.charAt(total)==' '){
                spa=spa+1;
                total++;
            }else{
                total++;
            }
            
        }
        System.out.println("A : "+a);
        System.out.println("E : "+e);
        System.out.println("I : "+i);
        System.out.println("O : "+o);
        System.out.println("U : "+u);
        System.out.println("Space : "+spa);
    
    }
}