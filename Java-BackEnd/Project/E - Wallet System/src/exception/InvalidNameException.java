package exception;

public class InvalidNameException extends AccountException {

    public InvalidNameException(String name){
        super(" - Invalid Name : " + name + "\n - [ [Min 3 chars ]");
    }

}
