
package OopProject.BlogSafe;

import java.util.Scanner;

public class testBlog {
      public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numx;
        
        Blog b1 = new Blog();
        System.out.print("Author Name1: ");
        b1.setName(input.next());
        System.out.print("Can visible(yes/no): ");
        b1.setVisible(input.next().equalsIgnoreCase("yes"));
        System.out.print("TOPIC: ");
        b1.setTopic(input.next());
        System.out.print("Content: ");
        b1.setContent(input.next());
        
        Blog b2 = new Blog();
        System.out.print("\nAuthor Name2: ");
        b2.setName(input.next());
        System.out.print("Can visible(yes/no): ");
        b2.setVisible(input.next().equalsIgnoreCase("yes"));
        System.out.print("TOPIC: ");
        b2.setTopic(input.next());
        System.out.print("Content: ");
        b2.setContent(input.next());
        
        Blog b3 = new Blog();
        System.out.print("\nAuthor Name3: ");
        b3.setName(input.next());
        System.out.print("Can visible(yes/no): ");
        b3.setVisible(input.next().equalsIgnoreCase("yes"));
        System.out.print("TOPIC: ");
        b3.setTopic(input.next());
        System.out.print("Content: ");
        b3.setContent(input.next());
        
        System.out.println("\n++++summary info++++");
        System.out.println("press 1-number of blog");
        System.out.println("press 2-number visible blog");
        System.out.println("press 3-number invisible blog");
        System.out.println("press 0-EXIT");
        System.out.print("\nEnter function: ");
        numx = input.nextInt();
        while(numx!=0){
            if(numx==1){
                System.out.println("Number of blog"+Blog.getCountall());
            }else if(numx==2){
                System.out.println("Visi : "+Blog.getCountvisible());
            }else if(numx==3){
                System.out.println("Invi : "+Blog.getCountinvisible());
            }
            System.out.print("Enter function : ");
            numx = input.nextInt();
        }
          System.out.println("End Program");
        
        
}

}
