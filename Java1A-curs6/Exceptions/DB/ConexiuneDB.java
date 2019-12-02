package Exceptions.DB;

public class ConexiuneDB implements AutoCloseable{
    
    public ConexiuneDB() throws DBException{
        System.out.println("Se deschide resursa");
    }
    
    
    
    @Override
    public void close(){
        System.out.println("Se inchide resursa");
        throw new RuntimeException("failed");
    }
    
}