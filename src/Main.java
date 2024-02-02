import person.Person;
import person.Student;
import person.Teacher;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Student("Dung", 20, "Dong Hoi", 8.0);
        Person p2 = new Student("Vu", 21, "Quang Ninh", 7.5);
        Person p3 = new Teacher("Nha",40,"Dong Hoi", 1000000);
        Person[] list = {p1, p2, p3};
        for (Person p:list){
            p.display();
        }
    }
}