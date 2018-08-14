package smarttvscreen;

public class InstalledApp extends Application /*เพิ่มตรงนี้*/ {

    private String company;
    
    //เพิ่มตรงนี้
    public InstalledApp(String name, String company) {
         super(name);
        this.company = company;
    }
    //เพิ่มตรงนี้
    public InstalledApp(String name, String description, String company) {
         super(name,description);
        this.company = company;
    }

    @Override
    public String toString() {
        return this.getName() + "\n- Installed App " + " company:  " + company + "\n" + this.getDescription();
    }

}
