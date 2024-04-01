package PrototypeDesignPattern;

public class Client {
    public static void main(String[] args) {
        LogoPrototype logoTemplate = new LogoTemplate("Company XYZ");
        LogoPrototype logo1 = logoTemplate.clone();
        LogoPrototype logo2 = logoTemplate.clone();

        ((LogoTemplate) logo1).draw();
        ((LogoTemplate) logo2).draw();

        //((LogoTemplate) logo1).setContent("Company ABC");
        //((LogoTemplate) logo2).setContent("Company 123");
        ((LogoTemplate) logo1).draw();
        ((LogoTemplate) logo2).draw();
    }
}
