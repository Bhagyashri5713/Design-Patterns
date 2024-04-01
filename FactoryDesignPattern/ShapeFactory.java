package FactoryDesignPattern;

public class ShapeFactory {
    public Shape createShape(String type){
        if(type.equalsIgnoreCase("circle"))
        {
            return new Circle();
        }else if (type.equalsIgnoreCase("square")) {
            return new Square();
        } else if (type.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        } else {
            System.out.println("Unsupported shape type: " + type);
            return null;
        }
    }
}
