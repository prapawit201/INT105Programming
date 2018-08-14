        
package OopProject.oopMim2;

public class book {
   private String name ;
   private String category ;
   private static int countlan,countsci;
   
   public int numOfBooksByCategory(String category){
       if(category.equalsIgnoreCase("language")){
       return   countlan++;
       }else {
       return   countsci++;
       }
      
   }

    public static int getCountlan() {
        return countlan;
    }

    public static void setCountlan(int countlan) {
        book.countlan = countlan;
    }

    public static int getCountsci() {
        return countsci;
    }

    public static void setCountsci(int countsci) {
        book.countsci = countsci;
    }

   
    public book(String name, String category) {
        this.name = name;
        this.category = category;
         if(category.equalsIgnoreCase("language")){
            countlan++;
       }else if(category.equalsIgnoreCase("Science")){
            countsci++;
       }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "book{" + "name=" + name + ", category=" + category + '}';
    }
   
   

    
    
    
}
