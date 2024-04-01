package FactoryDesignPattern;

public class Client {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();

        Shape circle = factory.createShape("circle");
        circle.draw();

        Shape s = factory.createShape("Square");
        s.draw();

        Shape r = factory.createShape("RECTANGLE");
        r.draw();
    }
}
