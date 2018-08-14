/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nextfinal;

import java.util.Scanner;


public class ballLoop {
//     public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String lotto = randomLotto();
//        String guessLotto = "";
//        System.out.println(lotto);
//        while(!guessLotto.equals("0")){
//            System.out.print("Enter your lotto number : ");
//            guessLotto = sc.next();
//            if(guessLotto.length()==6){
//                System.out.println(lottoCheck(guessLotto,lotto));
//            }else if(guessLotto.equals("0")){
//                System.out.println("End Program");
//            }else{
//                System.out.println("Enter 6 number lotto");
//            }   
//        }
//    }
//    
//    public static String randomLotto(){
//        int num1 = (int)(Math.random()*(10)) ;
//        int num2 = (int)(Math.random()*(10)) ;
//        int num3 = (int)(Math.random()*(10)) ;
//        int num4 = (int)(Math.random()*(10)) ;
//        int num5 = (int)(Math.random()*(10)) ;
//        int num6 = (int)(Math.random()*(10)) ;
//        return ""+num1+num2+num3+num4+num5+num6 ;
//    
//    }
//    public static String lottoCheck(String guessLotto, String lotto){
//        String result = " " ;
//        
//        if(guessLotto.equals(lotto)){
//            result = "Reward 1" ;
//        }else if((guessLotto.substring(guessLotto.length()-3 , guessLotto.length())).equals((lotto.substring(lotto.length()-3 , lotto.length())))){
//            result = "Reward 2" ;
//        }else if((guessLotto.substring(guessLotto.length()-2 , guessLotto.length())).equals((lotto.substring(lotto.length()-2 , lotto.length())))){
//            result = "Reward 3" ;
//        }else{
//            result = "Not correct reward" ;
//        }
//        return result ;
//    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = (int)(Math.random()*(9-0+1)+0);
        int b = (int)(Math.random()*(9-0+1)+0);
        int c = (int)(Math.random()*(9-0+1)+0);
        int d = (int)(Math.random()*(9-0+1)+0);
        int e = (int)(Math.random()*(9-0+1)+0);
        int f = (int)(Math.random()*(9-0+1)+0);
        
        String ran = ""+a+b+c+d+e+f;
        System.out.println("Lotto is : "+ran);
        
        System.out.print("Enter 6 num :");
        String num = sc.next();
            while(!num.equals("0")){
                if(num.length()==6){
                    if(num.equals(ran)){
                        System.out.println("Reward 1");
                    }else if(num.substring(3).equals(ran.substring(3))){
                        System.out.println("Reward 2");
                    }else if(num.substring(4).equals(ran.substring(4))){
                        System.out.println("Reward 3");
                    }else{
                        System.out.println("No reward");
                    }
                }else{
                    System.out.println("Please enter again");
                }
                System.out.print("Enter 6 num :");
                num = sc.next();
            }
            System.out.println("End program lotto");
     
    }

}
