package SingletondesignPattern;

public class Client {
    public static void main(String ar[])
    {
        SecurityControlCenter securityControlCenter = SecurityControlCenter.getInstance();
        SecurityControlCenter s2 = SecurityControlCenter.getInstance();

        System.out.println("Are both control centers the same instance? " +(securityControlCenter == s2));
        securityControlCenter.monitorSecurity();
        s2.monitorSecurity();
    }
}
