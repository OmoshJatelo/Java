package javainterfaces;

public class Cat implements AnimalInterface {
    @Override
    public void makeSound(){
        System.out.println("Moew!");
    }
}
