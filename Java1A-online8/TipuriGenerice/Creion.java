package TipuriGenerice;
public class Creion {
    String culoare;
    
    Creion(){
        
    }
    
    Creion(String culoare){
        this.culoare = culoare;
    }
    
    @Override
    public String toString(){
        return this.culoare;
    }
    
    
}