package Exceptii.flow2;

import Exceptii.flow.*;

public class MyRuntimeException extends RuntimeException{
    
    public MyRuntimeException(){
        super("This is my RuntimeException!");
    }
}