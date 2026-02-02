package day7;

public class person {
    private String name;
    private int age;
    private String gender;

    public person(){
        System.out.println("person default constructor 1");
        setName("person");
    }
    public person(String name){
        System.out.println("person parameterized constructor");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
