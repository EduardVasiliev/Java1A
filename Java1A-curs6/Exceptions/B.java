package Exceptions;
public class B extends A {
    
    public B() throws Exception, MyException{
        super();  //Super trebuie sa fie prima. Tratarea nu merge;
    }
    
    @Override
    void m(){
        
    }

}