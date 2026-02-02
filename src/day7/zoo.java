package day7;

public class zoo {
    public static void main(String[] args) {
//       Dog dog = new Dog();
//       dog.makeSound();

       Animal animal = new Dog();
        animal.makeSound();
        ((Dog)animal).bite();
        animal = new Cat();
        animal.makeSound();
        ((Cat)animal).Scratch();

    }
}
