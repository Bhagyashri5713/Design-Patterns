package StrategyDesignPattern;

public class TrainStrategy implements TransportationStrategy{
    @Override
    public void travel() {
        System.out.println("Travelling by Train......");
    }
}
