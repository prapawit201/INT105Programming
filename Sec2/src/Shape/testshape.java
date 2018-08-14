
package Shape;
//interface ไม่มีโค้ด
public class testshape {
    public static void main(String[] args) {
//        shape[] shape = new shape[2];
        circle c1 = new circle("White",10);
        rectangle r1 = new rectangle("Black",20,10);
//        System.out.println(c1+"\n"+r1);

//        shape[0] = new circle("White",10);
//        shape[1] = new rectangle("Black",20,10);
        
        System.out.println(c1.getArea());
        System.out.println(r1.getArea());
        
        System.out.println("-------------");
        //วิธีที่2
//        System.out.println(((circle)shape[0]).getArea());//จะผูกกับAreaของ circle ที่เราอยากรู้เเต่ชื่อ ต้องเหมือนกัน
//        System.out.println(((rectangle)shape[1]).getArea());
//        
//        System.out.println("-------------");
//        System.out.println(((circle)shape[0]).getPerimeter());//เหมือนกับareaด้านบน



//        for(int i = 0;i<shape.length;i++){
//            System.out.println("-------------");
//            System.out.println(shape[i]);
//        }
//        System.out.println("-------------");
//        System.out.println(shape[0].getColor());
//        System.out.println("-------------");
        
        circle c2 = new circle("White",10);
        circle c3 = new circle("White",10);
        if(c2.equal(c3)){
            System.out.println("True : c2 == c3");
        }else{
            System.out.println("False : c2!= c3");
        }
        System.out.println("--------------");
        
        rectangle r2 = new rectangle("White",10,10);
        rectangle r3 = new rectangle("White",10,10);
        if(r2.equal(r3)){
            System.out.println("True : r2 == r3");
        }else{
            System.out.println("False : r2!= r3");
        }
        System.out.println("--------------");
        
        System.out.println(r2 instanceof rectangle);
        System.out.println(c2 instanceof circle);
        
        System.out.println("--------------");
        
        shape[] shape1 = new shape[4];
        shape1[0] = new circle ("White",10);
        shape1[1] = new rectangle ("White",10,10);
        shape1[2] = new triangle ("yellow",10,10,10);
        for(int i = 0 ; i < shape1.length ; i++){
            System.out.println(shape1[i]);
        }
        
    }
}
