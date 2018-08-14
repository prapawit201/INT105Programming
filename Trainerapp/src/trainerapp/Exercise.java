
package trainerapp;


public class Exercise {
    private Treadmill treadmil;
    private Elliptical elliptical;

    public Exercise() {
        this.elliptical = new Elliptical();
        this.treadmil = new Treadmill();
    }


    public int courseA(){
        return treadmil.helpMetabolism()+(elliptical.helpMetabolism()/2) ;
    }
    public int courseB(){
       return (int)(treadmil.helpMetabolism()*1.5)+sitUp(30) ;
    }
    public int sitUp(int amount){
       return (int)amount/2 ;
    }
    public int playTreadmill(int time){
       double kcal = ((treadmil.helpMetabolism()*time)/60);
       return (int)kcal ;
    }
    public int playElliptical(int time){
       double kcal = ((elliptical.helpMetabolism()*time)/60);
       return (int)kcal ;
    }
    
}
