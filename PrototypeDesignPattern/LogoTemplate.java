package PrototypeDesignPattern;

public class LogoTemplate implements LogoPrototype{
    private String content;
    public LogoTemplate(String content) {
        this.content = content;
    }
    @Override
    public void draw() {
        System.out.println("Drawing logo with content: " + content);
    }

    @Override
    public LogoPrototype clone() {
        try {
            return (LogoTemplate) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}
