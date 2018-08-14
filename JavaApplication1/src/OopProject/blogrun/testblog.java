
package OopProject.blogrun;

import java.util.Scanner;


public class testblog {
      public static void main(String[] args) { 
          Scanner sc = new Scanner(System.in);
          
          System.out.print("Name : ");
          String name = sc.next();
          System.out.print("Can visible (yes,no) : ");
          boolean visible = sc.next().equalsIgnoreCase("yes");
          System.out.print("Topic : ");
          String topic = sc.next();
          System.out.print("Content : ");
          String content = sc.next();
          blog s1 = new blog(name,visible,topic,content);
          
          System.out.println("-------------------");
          
          System.out.print("Name : ");
          name = sc.next();
          System.out.print("Can visible (yes,no) : ");
          visible = sc.next().equalsIgnoreCase("yes");
          System.out.print("Topic : ");
          topic = sc.next();
          System.out.print("Content : ");
          content = sc.next();
          blog s2 = new blog(name,visible,topic,content);
         
           System.out.println("-------------------");
          
          System.out.print("Name : ");
          name = sc.next();
          System.out.print("Can visible (yes,no) : ");
          visible = sc.next().equalsIgnoreCase("yes");
          System.out.print("Topic : ");
          topic = sc.next();
          System.out.print("Content : ");
          content = sc.next();
          blog s3 = new blog(name,visible,topic,content);
          
          System.out.println("-------------------");
          System.out.println("++++++summary info+++++++");
          System.out.println("press 1 - number of blog : ");
          System.out.println("press 2 - number visible blog : ");
          System.out.println("press 3 - number invisible blog : ");
          System.out.println("press 0 - Exit");
          
          System.out.print("Enter function : ");
          int a = sc.nextInt();
          
          while(a!=0){
              if(a==1){
                  System.out.println("Number of blog : "+blog.getCountall());
              }else if(a==2){
                  System.out.println("Number of visible blog : "+blog.getCountvi());
              }else if(a==3){
                  System.out.println("Number of invisible blog : "+blog.getCountinvi());
              }
          System.out.print("Enter function : ");
          a = sc.nextInt();
              
          }
          System.out.println("End game");
      }
}
