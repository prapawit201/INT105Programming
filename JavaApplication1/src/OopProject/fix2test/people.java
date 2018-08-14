
package OopProject.fix2test;

public class people {

        private String name;
        private String gentle;
        private static int count;

    public people(String name, String gentle) {
        this.name = name;
        this.gentle = gentle;
        count++;
    }

    public people() {
        count++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGentle() {
        return gentle;
    }

    public void setGentle(String gentle) {
        this.gentle = gentle;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        people.count = count;
    }
    
}
