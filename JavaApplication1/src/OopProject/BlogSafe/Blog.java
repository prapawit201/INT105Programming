
package OopProject.BlogSafe;

public class Blog {
    private String name;
    private boolean visible;
    private String topic;
    private String content;
    private static int countall,countvisible,countinvisible;

    public Blog(String name, boolean visible, String topic, String content) {
        countall++;
        this.name = name;
        if(visible == true){
            countvisible++;
        }else{
            countinvisible++;
        }
        this.topic = topic;
        this.content = content;
    }

    public Blog() {
        countall++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        if(visible==true){
            countvisible++;
        }else if(visible == false){
            countinvisible++;
        }
        this.visible = visible;
        
            
        
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public static int getCountall() {
        return countall;
    }

    public static void setCountall(int countall) {
        Blog.countall = countall;
    }

    public static int getCountvisible() {
        return countvisible;
    }

    public static void setCountvisible(int countvisible) {
        Blog.countvisible = countvisible;
    }

    public static int getCountinvisible() {
        return countinvisible;
    }

    public static void setCountinvisible(int countinvisible) {
        Blog.countinvisible = countinvisible;
    }

    @Override
    public String toString() {
        return "Blog{" + "name=" + name + ", visible=" + visible + ", topic=" + topic + ", content=" + content + '}';
    }
    
   
    
    
}
