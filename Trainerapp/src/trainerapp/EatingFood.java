
package trainerapp;

    public class EatingFood extends food{
        private String foodtime;

    public EatingFood(String foodtime) {
        this.foodtime = foodtime;
    }
        
    public EatingFood() {
        this.foodtime = "Dinner";
    }

    public String getFoodtime() {
        return foodtime;
    }

    public void setFoodtime(String foodtime) {
        this.foodtime = foodtime;
    }
        
        @Override
        public int getEnergy(){
            
            return 400 ;
        }
        public int getEnergyMore(){
            return 7000 ;
        }
        
    }

