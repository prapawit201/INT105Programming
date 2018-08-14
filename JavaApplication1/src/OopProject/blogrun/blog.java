
package OopProject.blogrun;

public class blog {
    private  String name;
    private boolean visible;
    private String topic;
    private String content;
    private static int countall,countvi,countinvi ;

    public static int getCountall() {
        return countall;
    }

    public static void setCountall(int countall) {
        blog.countall = countall;
    }

    public static int getCountvi() {
        return countvi;
    }

    public static void setCountvi(int countvi) {
        blog.countvi = countvi;
    }

    public static int getCountinvi() {
        return countinvi;
    }

    public static void setCountinvi(int countinvi) {
        blog.countinvi = countinvi;
    }
    
    public blog(String name, boolean visible, String topic, String content) {
        this.name = name;
        this.visible = visible;
        this.topic = topic;
        this.content = content;
        countall++;
        if(visible==true){
            countvi++;
        }else if(visible==false){
            countinvi++;
        }
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

    @Override
    public String toString() {
        return "blog{" + "name=" + name + ", visible=" + visible + ", topic=" + topic + ", content=" + content + '}';
    }
    
}