package abstract_shape;

public class Main {
    public static void main(String[]args){
        Shape hinhVuong1 = new Square(5);
        Shape hinhVuong2 = new Square("black", true, 10);
        System.out.println(hinhVuong1);
        System.out.println(hinhVuong2);
    }

}
