package StrategyDesignPattern;

public class PlaneStrategy implements TransportationStrategy{
    @Override
    public void travel() {
        System.out.println("Travelling by Plane....");
    }
}
