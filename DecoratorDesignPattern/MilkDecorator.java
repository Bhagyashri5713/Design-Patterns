package DecoratorDesignPattern;

public class MilkDecorator extends CoffeeDecorator{
    public MilkDecorator(Coffe coffe) {
        super(coffe);
    }

    public double cost(){
        return super.cost()+10.0;
    }

    public String getDescription(){
        return super.getDescription() +"with Milk";
    }
}
