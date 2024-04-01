package PrototypeDesignPattern;

public interface LogoPrototype extends Cloneable{
    void draw();
    LogoPrototype clone();
}
