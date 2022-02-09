import java.util.*;

class person {
    // Attribute
    protected String name;
    protected int age;

    // Methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void printInformation() {

        System.out.println("Name : " + getName());
        System.out.println("Age : " + getAge());

    }

    public static void main(String[] args) {
        Instructor assign = new Instructor();
        assign.setName("Sonesavanh MANVILAI");
        assign.setAge(21);
        assign.printInformation();
        assign.assign();
    }
}

// Inheritance
class Student extends person {
    protected int year;
    @Size(max = 1)
    Set<Select> own;

    // .........
}

class Instructor extends person {
    @Size(max = 1)
    Set<Course> teacher;

    public void assign() {
        System.out.println("-- Assign --");
    }
}

class Course {
    protected String name;
    protected Double grade;
    Set<Instructor> teach;
    @Size(max = 1) Set<Select> lesson;

}

class Select{
    protected float mark;
    protected String location;
    Set<Course> lesson;
    Set<Student> make;
    
}
