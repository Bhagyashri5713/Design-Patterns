package AbstractFactoryDesignPattern;

public class SportsInterior implements Interior{
    @Override
    public void assemble() {
        System.out.println("Assembling Sports Interior");
    }
}
