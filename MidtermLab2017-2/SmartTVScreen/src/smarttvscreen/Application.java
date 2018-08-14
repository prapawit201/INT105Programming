/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smarttvscreen;

//เพิ่มทั้งหน้า
public class Application {
    private String  name;
    private String  image;
    private String description;

    public Application() {
    }

    public Application(String name) {
        this.name = name;
    }

    public Application(String name, String image) {
        this.name = name;
        this.image = image;
    }

    public Application(String name, String image, String description) {
        this.name = name;
        this.image = image;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Application{" + "name=" + name + ", image=" + image + ", description=" + description + '}';
    }
    
    
}
