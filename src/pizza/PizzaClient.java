package pizza;

public class PizzaClient {
    static void run(){
        IShape c1 = new Circle(5);
        Pizza p1 = new Pizza(10, c1);
        IShape c2 = new Circle(6);
        Pizza p2 = new Pizza(11, c2);
        PizzaDeal pizzaDeal= new PizzaDeal();
        if(pizzaDeal.betterDeal(p1, p2)){
            System.out.println(p1+ " is better than:" + p2);
        }else{
            System.out.println(p2+ " is better than:" + p1);
        }
    }
    public static void main(String[]args){
        run();
    }
}
