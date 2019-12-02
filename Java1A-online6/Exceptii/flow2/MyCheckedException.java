package Exceptii.flow2;

import Exceptii.flow.*;

public class MyCheckedException extends Exception {
    
    public MyCheckedException(){
        super("This is a checked exception. Must be treated!");
    }
}