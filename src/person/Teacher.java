package person;

public class Teacher extends Person{
    double salary;

    public Teacher(String name, int age, String address, double salary) {
        super(name, age, address);
        this.salary = salary;
    }
    public void display(){
        super.display();
        System.out.println("SALARY:" + this.salary);
    }
}
