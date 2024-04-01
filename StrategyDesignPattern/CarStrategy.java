package StrategyDesignPattern;

public class CarStrategy implements TransportationStrategy{
    @Override
    public void travel() {
        System.out.println("Travelling by Car.......");
    }
}
