package person;

public class Student extends Person{
    double gpa;

    public Student(String name, int age, String address) {
        super(name, age, address);
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void display(){
        super.display();
        System.out.println("GPA:" + this.gpa);
    }
}
