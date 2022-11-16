package moe.kogasa;

public class ArgsException extends RuntimeException {
    public ArgsException()
    {
        super("Error Args");
    }

    public ArgsException(String error)
    {
        super(error);
    }
    
}
