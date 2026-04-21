package exception;

public class InvalidBalanceException extends AccountException{

    public InvalidBalanceException(double balance){
        super(" - Invalid Balance [Can't be negative] : " + balance);
    }

}
