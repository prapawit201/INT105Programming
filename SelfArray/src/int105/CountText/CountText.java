/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package int105.CountText;

/**
 *
 * @author Tisanai.Cha
 */
public class CountText {

//    public static void main(String[] args) {
//        String sentence = "Java application";
//        char[] char4count = {'a', 'I', 'c'};
//        int[] frequency = countCharInText(sentence, char4count);
//        for (int i = 0; i < char4count.length; i++) {
//            System.out.println("number of character " + char4count[i] + " is " + frequency[i]);
//        }
//
//    }
//
//    public static int[] countCharInText(String sentence, char[] char4count) {
//        int[] counText = new int[char4count.length];
//        for (int j = 0; j < char4count.length; j++) {
//            for (int i = 0; i < sentence.length(); i++) {
//                if ((char4count[j] + "").equalsIgnoreCase(sentence.charAt(i) + "")) {
//                    counText[j]++;
//                }
//            }
//        }
//        return counText;
//    }
    
    public static void main(String[] args) {
         String sentence = "Java application";
         char[] char4count = {'a', 'I', 'c'};
         int[] fre = countCharInText(sentence ,char4count );
         for(int i = 0;i<char4count.length;i++){
             System.out.println("number of character "+char4count[i]+" is "+fre[i]);
         }
    }
    public static int[] countCharInText(String sentence,char[] char4count){
           int[] charte = new int[char4count.length];
           for(int i = 0 ; i<char4count.length;i++){
               for(int u = 0 ; u< sentence.length();u++){
                   if((char4count[i]+"").equalsIgnoreCase(sentence.charAt(u)+"")){
                       charte[i]++;
                   }
               }
           }
           return charte;
    }
}
