package SingletonPattern.Sinconizat;

public class Caine {
    public String nume;
    
    private Caine(){
        
    }
    
    private static final class singletonHolder{
        public static final Caine SINGLETON = new Caine();
        
    }
    
    public static Caine getInstance(){
        return singletonHolder.SINGLETON;
        
    }
}