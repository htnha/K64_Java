package shape;

public class Rectangle implements IShape{
    double width;
    double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double getArea() {
        return this.length*this.width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (this.length + this.width);
    }
}
