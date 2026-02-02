package day7;

public class Woman extends person{
    private String mentalState;

    public String getMentalState() {
        return mentalState;
    }

    public void setMentalState(String mentalState) {
        this.mentalState = mentalState;
    }

    public Woman(){
        System.out.println("woman default constructor 2");
        setName("woman");
    };
}
