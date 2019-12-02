package tipGeneric;

public class Cutie<T> {
    
    //public Object continut;
    public T continut;
    
    public T getContinut(){
        return continut;
    }
    
    public void setContinut(T continut){
        this.continut = continut;
    }
    
    static <T> void m(T t){             //metoda cu tip generic
        System.out.println(t);
    }
}

/*
orice tip referinta poate fi convertit la Object prin polymorphism. 
Insa trebuie facut cast mereu pentru a converti String<->Object. Creem un tip generic T.
Atributele statice sau metodele statice de clasa nu pot folosi T.

O metoda poate avea propriul ei tip generic.
Avantaj : dinamismul clasei.
Dezavantaj : 
*/