package AbstractFactoryDesignPattern;

public class LuxuryCarFactory implements CarFactory{
    @Override
    public Engine createEngine() {
        return new LuxuryEngine();
    }

    @Override
    public Interior createInterior() {
        return new LuxuryInterior();
    }

    @Override
    public Exterior createExterior() {
        return new LuxuryExterior();
    }
}
