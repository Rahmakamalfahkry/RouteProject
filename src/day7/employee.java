package day7;

public class employee extends person {
    private int id;
    private String title;
    private double salary;

    public employee(){
        super("rahma");
        System.out.println("employee default constructor");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
