package AbstractFactoryDesignPattern;

public class Client {
    public static void main(String[] args) {
        CarFactory carFactory = new LuxuryCarFactory();
        Engine le = carFactory.createEngine();
        Interior li = carFactory.createInterior();
        Exterior lex = carFactory.createExterior();

        le.start();
        li.assemble();;
        lex.paint();

        CarFactory sports = new SportsCarFactory();
        Engine se = sports.createEngine();
        Interior si = sports.createInterior();
        Exterior sex = sports.createExterior();

        se.start();
        si.assemble();;
        sex.paint();

    }
}
