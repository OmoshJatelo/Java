package javaClasses; //Tells java: I live in the javaClasses folder so group me with ithers here.
public class Teacher extends User {
    public Teacher(String name, int age) {
        super(name, age);
    }

    @Override
    public void greet(){
        System.out.println("Hello, I am a teacher");
    }

    public static void main(String[] args){
        User user1 = new Teacher("Onyi",34);
        user1.greet();
    }
}

