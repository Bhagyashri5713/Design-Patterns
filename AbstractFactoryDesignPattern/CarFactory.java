package AbstractFactoryDesignPattern;

public interface CarFactory {
    Engine createEngine();
    Interior createInterior();
    Exterior createExterior();
}
