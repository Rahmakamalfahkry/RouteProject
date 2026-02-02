package day7;

public class Dog extends Animal{
    @Override
    public void makeSound(){
        System.out.println("bark");
    }
    public void bite(){
        System.out.println("I am a dog I bite");
    }
}
