package abstract_shape;

public class Rectangle extends Shape{
    double width;
    double length;
    public Rectangle(){
        super();
        this.width = 1;
        this.length = 1;
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (this.length + this.width);
    }

    public Rectangle(double width, double length){
        super();
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

}
