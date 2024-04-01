package DecoratorDesignPattern;

public class Client {
    public static void main(String[] args) {
        Coffe coffe = new SimpleCoffe();
        System.out.println("Cost: "+ coffe.cost() + "Description:" + coffe.getDescription());

        coffe = new MilkDecorator(coffe);
        System.out.println("Cost: "+ coffe.cost()+"Description: "+ coffe.getDescription());

        coffe = new CaramelDecorator(coffe);
        System.out.println("Cost: "+coffe.cost() +"Description: "+ coffe.getDescription());
    }
}
