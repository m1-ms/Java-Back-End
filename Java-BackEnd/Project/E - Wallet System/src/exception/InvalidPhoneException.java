package exception;

public class InvalidPhoneException extends AccountException{

    public InvalidPhoneException(String phone){
        super(" - Invalid PhoneNumber : " + phone);
    }

}
