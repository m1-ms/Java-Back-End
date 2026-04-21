package exception;

public class InvalidAgeException extends AccountException{

    public InvalidAgeException(int age){
        super(" - Invalid Age : " + age);
    }

}
