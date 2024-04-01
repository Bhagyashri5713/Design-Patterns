package StrategyDesignPattern;

public class TripPlanner {
    private TransportationStrategy strategy;

    // Set strategy dynamically
    public void setStrategy(TransportationStrategy strategy) {
        this.strategy = strategy;
    }

    // Execute the strategy
    public void executeStrategy() {
        strategy.travel();
    }
}
