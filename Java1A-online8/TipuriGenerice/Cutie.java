package TipuriGenerice;
public class Cutie<T> {
    T continut;
    
    Cutie(){      
    }
    
    Cutie(T continut){
        this.continut = continut;
    }
    
    @Override
    public String toString(){
        return this.continut + " ";
    }
    
    public static <U> void metodaStatica(){  //Metodele statice au tipul generic declarat
        
    }
}