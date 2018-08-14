/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OopProject.testsafe;

public class safe {

    private String name;
    private boolean visible;
    private String topic;
    private String content;
    private static int countblog, countvi, countinvi;

//    public void getsafe(String invi) {
//
//        if (invi.equals("yes")) {
//            this.visible = true;
//            countvi++;
//        } else if (invi.equals("no")) {
//            this.visible = false;
//            countinvi++;
//        }
//
//    }

    public safe(String name, boolean visible, String topic, String content) {
        countblog++;
        this.name = name;
        this.visible = visible;
        this.topic = topic;
        this.content = content;
    }

    public safe() {
    }


    public String getName() {
        return name;
    }

    public void getsafe(String name, String visi, String topic, String content){
        countblog++;
         if (visi.equals("yes")) {
            this.visible = true;
            countvi++;
        } else if (visi.equals("no")) {
            this.visible = false;
            countinvi++;
        }
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

    public static int getCountblog() {
        return countblog;
    }

    public static void setCountblog(int countblog) {
        safe.countblog = countblog;
    }

    public static int getCountvi() {
        return countvi;
    }

    public static void setCountvi(int countvi) {
        safe.countvi = countvi;
    }

    public static int getCountinvi() {
        return countinvi;
    }

    public static void setCountinvi(int countinvi) {
        safe.countinvi = countinvi;
    }

    @Override
    public String toString() {
        return "safe{" + "name=" + name + ", visible=" + visible + ", topic=" + topic + ", content=" + content + '}';
    }

}
