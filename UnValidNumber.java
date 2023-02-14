package MyExep;

public class UnValidNumber extends Exception{
    private final String Message = "Number Must be between 1 and 4";
    public UnValidNumber (String s)
    {
        super(s);
    }
}
