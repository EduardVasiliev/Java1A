package SingletonPattern;

public class ConexiuneBD {
    int durata;
    String nume;
    private static ConexiuneBD SINGLETON;
    
    private ConexiuneBD(){
        
    }
    
    public static final ConexiuneBD getInstance(){
        if(SINGLETON == null){
            SINGLETON = new ConexiuneBD();
        }
        
        return SINGLETON;
    }
}