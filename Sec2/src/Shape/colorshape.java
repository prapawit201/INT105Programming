package Shape;
//implementคือ ไปเอาabstract มาจากshapeเเล้วเลยไม่ตค้องเขียนเพิ่ม
  public abstract class colorshape implements shape {
        private String color;

    public colorshape(String color) {
        this.color = color;
    }
    
    public final String getColor() {
        return color;
    }
    

    //วิธีที่1
//    public double getArea(){
//        return  0 ;
//       
//    }
//    public double getPerimeter(){
//        return  0 ;
//       
//   }
    

  
    
    @Override
    public String toString() {
        return "shape{" + "color=" + color + '}';
    }
    //abstract ังคับให้ทำ
    //final บังคับไม่ให้เเก่ไข
    //final
}

