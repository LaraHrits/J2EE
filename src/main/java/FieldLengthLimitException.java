public class FieldLengthLimitException extends Exception{
    public static final int maxLength = 50;

    public FieldLengthLimitException(String msg){
        super(msg);
    }
}
