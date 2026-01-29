public class Departments {
    
    private int id;
    private String name;

    public Departments(){

    }
    public Departments(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTable() {
        return name;
    }
    public void setTable(String name) {
        this.name = name;
    }


    
}
