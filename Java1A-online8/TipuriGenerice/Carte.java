package TipuriGenerice;
public class Carte {
    String titlu;
    
    Carte(){
        
    }
    
    Carte(String titlu){
        this.titlu = titlu;
    }
    
    @Override
    public String toString(){
        return this.titlu;
    }
}