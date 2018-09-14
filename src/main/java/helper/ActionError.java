package helper;

public class ActionError extends RuntimeException{
    public ActionError(){
        super();
    }
    public ActionError(String message){
        super(message);
    }
}
