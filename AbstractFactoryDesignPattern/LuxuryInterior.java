package AbstractFactoryDesignPattern;

public class LuxuryInterior implements Interior{
    @Override
    public void assemble() {
        System.out.println("Assembling Luxury Interior");
    }
}
