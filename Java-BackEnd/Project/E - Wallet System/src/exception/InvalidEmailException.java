package exception;

public class InvalidEmailException extends AccountException{

    public InvalidEmailException(String email){
        super(" - Invalid E-Mail : " + email);
    }

}
