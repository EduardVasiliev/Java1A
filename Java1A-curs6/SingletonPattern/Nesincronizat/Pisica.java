package SingletonPattern.Nesincronizat;

public class Pisica {
    static Pisica singleton;
    public String Nume;
    
    private Pisica(){
        
    }
    
    public static Pisica getInstance(){
        
        if(singleton == null){
            singleton = new Pisica();
        }
        
        return singleton;
    }
}

/*
    Metoda si atributul sunt statice. Altfel nu putem crea o instanta.
*/

