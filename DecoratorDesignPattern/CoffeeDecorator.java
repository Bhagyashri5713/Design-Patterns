package DecoratorDesignPattern;

public abstract class CoffeeDecorator implements Coffe {
    protected final Coffe decoratedCoffee;

    public CoffeeDecorator(Coffe coffe)
    {
        this.decoratedCoffee = coffe;
    }

    public double cost(){
        return decoratedCoffee.cost();
    }
    public String getDescription(){
        return decoratedCoffee.getDescription();
    }
}
