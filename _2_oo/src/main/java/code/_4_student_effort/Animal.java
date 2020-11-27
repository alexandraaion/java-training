package code._4_student_effort;

public abstract class Animal {
    protected int legs;

    protected Animal(Integer legs) {
        this.legs = legs;
    }

    public abstract void eat();

    public void walk() {
        System.out.println("This animal has " + legs + " legs and is walking!");
    }
}
