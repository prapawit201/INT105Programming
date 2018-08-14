//รวมข้อ4ทั้งหมดไว้เเล้ว
package OOPOLIV.olivPen;

public class testpen {
    public static void main(String[] args) {
        pen s1 = new pen();
        System.out.println(s1);//ข้อ4
        System.out.println("ด้ามที่ :"+pen.Countpen());//ข้อ4.1
        
        pen s2 = new pen(1);
        System.out.println(s2);
        System.out.println("ด้ามที่ :"+pen.Countpen());
        
        pen s3 = new pen(1,"pen");
        System.out.println(s3);
        System.out.println("ด้ามที่ :"+pen.Countpen());
        
        pen s4 = new pen(1,"pen","pen");
        System.out.println(s4);
        System.out.println("ด้ามที่ :"+pen.Countpen());
        
        pen s5 = new pen(1,"pen","pen",150.00);
        System.out.println(s5);
        System.out.println("ด้ามที่ :"+pen.Countpen());
        
        System.out.println("------------------");
        
         pen s6 = new pen(2,"pen","pen",200.00);
          pen s7 = new pen(3,"pen","pen",250.00);
           pen s8 = new pen(4,"pen","pen",300.00);
        
        System.out.println(pen.getAllpen());
        
    }
}
//รวมข้อ4ทั้งหมดไว้เเล้ว