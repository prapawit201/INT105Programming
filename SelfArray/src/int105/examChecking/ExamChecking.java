/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package int105.examChecking;

/**
 *
 * @author Tisanai.Cha
 */
public class ExamChecking {

//    public static int examChecking(char[] stdAnswer, char[] solAnswer) {
//        if (stdAnswer.length != solAnswer.length) {
//            return -1;
//        }
//        int count = 0;
//        for (int i = 0; i < stdAnswer.length; i++) {
//            if (stdAnswer[i] == solAnswer[i]) {
//                count++;
//            }
//        }
//        return count;
//    }
    
//   public static int examChecking(char[] stdAnswer, char [] solAnswer){
//      int count = 0;
//       if(stdAnswer.length!=solAnswer.length){
//          return -1;
//      }
//     for(int i = 0 ; i< stdAnswer.length ; i++){
//         if(stdAnswer[i]==solAnswer[i]){
//             count++;
//         }
//     }
//       return count;
//   }
    
    public static int examChecking(char[] stdAnswer, char [] solAnswer){
        if(stdAnswer.length != solAnswer.length){
            return  -1;
        }
        int count = 0 ;
        for(int i = 0 ; i < solAnswer.length ; i++){
            if(stdAnswer[i] == solAnswer[i]){
                count++;
            }
        }
        return count ;
    }
        
    
}
