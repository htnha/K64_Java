package pizza;

public class Pizza {
    private double _price;
    private IShape _shape;

    public Pizza(double _price, IShape _shape) {
        this._price = _price;
        this._shape = _shape;
    }

    public double getPrice() {
        return _price;
    }

    public IShape getShape() {
        return _shape;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                " Price=" + _price +
                ", Area=" + _shape.getArea() +
                '}';
    }
}
