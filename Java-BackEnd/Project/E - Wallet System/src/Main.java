import service.ApplicationService;
import service.impl.EWalletApplicationServiceImpl;

public class Main {
    public static void main(String[] args) {
        ApplicationService app = new EWalletApplicationServiceImpl();
        app.startApp();

        //     Login   -> Admin User
        //  UserName Admin : mahmoud_24
        //  Password Admin : Mahmoud#@080

    }
}


/*

Main :
 Sign-Up + Validation
 Login + 3 attempts
 Deposit / Withdraw / Transfer
 Change Password
 Show Account Details
 Logout

Bonus:
 Transaction History
 Admin Panel + isAdmin + auto admin user
 Delete Account
 Inactive Account
 Back option في كل عملية


 */