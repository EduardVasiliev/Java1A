package Exceptii;

public class Ex{
    public static void main(String[] args){
        int x = 10;
        if (x>5){
            MyRuntimeException e = new MyRuntimeException();
            throw e;
        }
    }
}