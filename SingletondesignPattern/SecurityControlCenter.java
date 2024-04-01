package SingletondesignPattern;

public class SecurityControlCenter {
    private static SecurityControlCenter instance;
    private SecurityControlCenter(){

    }
    public static SecurityControlCenter getInstance(){
        if(instance == null)
        {
            instance = new SecurityControlCenter();
        }
        return instance;
    }
    public void monitorSecurity() {
        System.out.println("Monitoring security operations...");
    }
}
