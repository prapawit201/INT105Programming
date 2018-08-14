
package trainerapp;

public class TrainerApp {

        private String name;
        private int kcal;
        private int weight;
        private Exercise exercise;
        private EatingFood eating;

    public TrainerApp(String name, int kcal, int weight) {
        this.name = name;
        this.kcal = kcal;
        this.weight = weight;
        this.exercise = new Exercise();
        this.eating = new EatingFood();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKcal() {
        return kcal;
    }

    public void setKcal(int kcal) {
        this.kcal = kcal;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    
 
    public int exerciseCourse(char type){
        if(type == 'A'){
            if(kcal-exercise.courseA()>=1200){
                kcal = kcal-exercise.courseA();
                return kcal;
            }
            else{
                return -1 ;
            }
        }else{
                if(kcal-exercise.courseB()>=1200){
                kcal = kcal-exercise.courseA();
                return kcal;
            }
            else{
                return -1 ;
            }
        }
    }
    
    public int exerciseSpecific(String type, int amount){
        if(type.equalsIgnoreCase("treadmil")){
            if(kcal-exercise.playTreadmill(amount)>-1200){
                kcal = kcal - exercise.playTreadmill(amount);
                return kcal;
            }else{
                return -1 ;
            }
        }else if(type.equalsIgnoreCase("elliptical")){
            if(kcal-exercise.playElliptical(amount)>-1200){
                kcal = kcal - exercise.playElliptical(amount);
                return kcal;
            }else{
                return -1 ;
            }
        }else{
            if(kcal-exercise.sitUp(amount)>-1200){
                kcal = kcal - exercise.sitUp(amount);
                return kcal;
            }else{
                return -1 ;
            }
        }
        
    }
    
    public int eatingFood(String type){
        if(type.equalsIgnoreCase("Normalfood")){
            kcal = kcal + eating.getEnergy();
           
        }else{
            kcal = kcal + eating.getEnergyMore();
        }
        
        return kcal;
    }
    
    public int guessYourWeight(){
        int guess = kcal/7000;
        
        return weight+guess;
    }


}
