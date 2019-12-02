package Exceptii;

public class MyCheckedException extends Exception{
    
    public MyCheckedException(){
        super("Aceasta este o exceptie checked! Trebuie tratata!");
    }
}