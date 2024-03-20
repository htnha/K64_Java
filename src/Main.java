import person.Person;
import person.Student;
import person.Teacher;
import shape.Circle;
import shape.IShape;
import shape.Rectangle;

public class Main {
    public static void main(String[] args) {
//        Person p1 = new Student("Dung", 20, "Dong Hoi", 8.0);
//        Person p2 = new Student("Vu", 21, "Quang Ninh", 7.5);
//        Person p3 = new Teacher("Nha",40,"Dong Hoi", 1000000);
//        Person[] list = {p1, p2, p3};
//        for (Person p:list){
//            p.display();
//        }
        IShape c1 = new Circle(3.0);
        IShape c2 = new Circle(5.0);
        IShape r1 = new Rectangle(2, 3);
        IShape r2 = new Rectangle(3, 5);
        IShape[] list = {c1, c2, r1, r2};
        for (IShape s:list){
            System.out.println("Dien tich la:" + s.getArea());
        }
    }
}