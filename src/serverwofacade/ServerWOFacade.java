package serverwofacade;
public class ServerWOFacade {
    public static void main(String[] args) {
        Facade obj = new Facade();
        obj.startServer();
        obj.stopServer();
    }
    
}
