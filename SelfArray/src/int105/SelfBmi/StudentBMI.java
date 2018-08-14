package int105.SelfBmi;

public class StudentBMI {

//    public static String[] bmiStudents(Student std[]) {
//        String[] temp = new String[std.length];
//        for (int i = 0; i < std.length; i++) {
//            temp[i] = bmiCategory(std[i]);
//        }
//        return temp;
//    }
//
//    public static String bmiCategory(Student std) {
//        double bmi = calBmi(std);
//        if (bmi < 0) {
//            return "none";
//        } else if (bmi < 18.5) {
//            return "under weight";
//        } else if (bmi < 25) {
//            return "normal weight";
//        } else if (bmi < 30) {
//            return "over weight";
//        } else {
//            return "obesity";
//        }
//
//    }
//
//    public static double calBmi(Student std) {
//        if (std.getHeight() == 0) {
//            return -2;
//        }
//        if (std.getHeight() < 0 || std.getWeight() < 0) {
//            return -1;
//        }
//        return std.getWeight() / Math.pow(std.getHeight(), 2);
//    }
//     public static String[] bmiStudents(Student std[]){
//         String[] temp = new String[std.length];
//         for(int i = 0 ; i < temp.length ; i++){
//             temp[i] = bmiCategory(std[i]);
//         }
//         return temp;
//     }
//     
//     public static String bmiCategory(Student std) {
//         String status;
//         double bmi = calBmi(std);
//         if(bmi <= 0){
//             status = "none";
//             System.out.println(status);
//         }else if(bmi < 18.5){
//             status = "under weight";
//             System.out.println(status);
//         }else if(bmi < 25 ){
//             status = "normal weight";
//             System.out.println(status);
//         }else if(bmi < 30){
//             status = "over weight";
//             System.out.println(status);
//         }else{
//             status = "obesity";
//             System.out.println(status);
//         }
//         return status;
//     }
//     
//     public static double calBmi(Student std){
//         if(std.getWeight()<0  || std.getHeight()<0){
//             return -1 ;
//         }
//         if(std.getHeight()==0){
//             return -2 ;
//         }
//         return std.getWeight()/Math.pow(std.getHeight(), 2);
//     }
    public static String[] bmiStudents(Student std[]) {
        String[] temp = new String[std.length];
        for (int i = 0; i < std.length; i++) {
            temp[i] = bmiCategory(std[i]);
        }
        return temp;
    }

    public static String bmiCategory(Student std) {

        String status;
        double bmi = calBmi(std);
        if (bmi <= 0) {
            status = "none";
            System.out.println(status);
        } else if (bmi < 18.5) {
            status = "under weight";
            System.out.println(status);
        } else if (bmi < 25) {
            status = "normal weight";
            System.out.println(status);
        } else if (bmi < 30) {
            status = "over weight";
            System.out.println(status);
        } else {
            status = "obesity";
            System.out.println(status);
        }
        return status;
    }

    public static double calBmi(Student std) {
        if (std.getWeight() < 0 || std.getHeight() < 0) {
            return -1;
        }
        if (std.getHeight() == 0) {
            return -2;
        }
        return std.getWeight() / Math.pow(std.getHeight(), 2);
    }

}
