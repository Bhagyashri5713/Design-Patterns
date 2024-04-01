package StrategyDesignPattern;

public class Client {
    public static void main(String[] args) {
        TripPlanner tripPlanner = new TripPlanner();

        TransportationStrategy car = new CarStrategy();
        TransportationStrategy train = new TrainStrategy();
        TransportationStrategy plane = new PlaneStrategy();

        tripPlanner.setStrategy(car);
        tripPlanner.executeStrategy();

        tripPlanner.setStrategy(train);
        tripPlanner.executeStrategy();

        tripPlanner.setStrategy(plane);
        tripPlanner.executeStrategy();
    }
}
