import service.ApplicationService;
import service.impl.EWalletApplicationServiceImpl;

public class Main {
    public static void main(String[] args) {
        ApplicationService app = new EWalletApplicationServiceImpl();
        app.startApp();
    }
}