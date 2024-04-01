package DecoratorDesignPattern;

public class SimpleCoffe implements Coffe{
    @Override
    public double cost() {
        return 20.0;
    }

    @Override
    public String getDescription() {
        return "Simple Coffee";
    }
}
