public class Student extends User{
    char grade;
    String comment;
    public Student (String name, int age ,char grade, String comment) {
        super(name,age);
        this.grade = grade;
        this.comment =comment;
    }
    public void showGrade() {

        System.out.println("Your Grade :" +grade);
        System.out.println(comment);
    }
    public static void main() {

        Student student1 =new Student("Smart",21,'A',"This is very Assiduous");
        student1.greetJatelo();
        student1.showGrade();

    }
}


