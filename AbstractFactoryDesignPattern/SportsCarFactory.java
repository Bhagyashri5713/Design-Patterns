package AbstractFactoryDesignPattern;

public class SportsCarFactory implements CarFactory{
    @Override
    public Engine createEngine() {
        return new SportsEngine();
    }

    @Override
    public Interior createInterior() {
        return new SportsInterior();
    }

    @Override
    public Exterior createExterior() {
        return new SportsExterior();
    }
}
