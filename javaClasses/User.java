package javaClasses;

public class  User{
    protected String name;
    protected int age;

    public User (String name, int age) {
        this.name = name;
        this.age = age;
    }

    protected void greet() {
        System.out.println("Sedulous! " + name + ", You are " + age + " years now");
    }
}
