package code._4_student_effort;

public class Student1 implements Observer {
    String name;

    public Student1(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println("Student " + name + " learned about " + message);
    }

    public void listenTo(Teacher teacher) {
        teacher.register(this);
    }
}
