package pizza;

public class PizzaDeal {
    double deal(Pizza p){
        return p.getPrice() / p.getShape().getArea();
    }
    boolean betterDeal(Pizza p1, Pizza p2){
        return deal(p1) < deal(p2);
    }
}
