package DecoratorDesignPattern;

public class CaramelDecorator extends CoffeeDecorator{
    public CaramelDecorator(Coffe coffe) {
        super(coffe);
    }

    public double cost(){
        return super.cost() + 20.0;
    }
    public String getDescription(){
        return super.getDescription() + "with caramel";
    }
}
