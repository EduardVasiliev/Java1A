package Exceptii;

public class MyRuntimeException extends RuntimeException {
    
    public MyRuntimeException(){
        super("Aceasta este exceptia mea de Runtime(Unchecked)");
    }
}