package exception;

public class InvalidPasswordException extends AccountException{

    public InvalidPasswordException(){
        super(" - Invalid Password [Must be at least 6 characters].");
    }

}
