package javainterfaces;

public class Dog implements AnimalInterface {
    @Override
    public void makeSound(){
        System.out.println("Woof!");
    }
}
