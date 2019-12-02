package TipuriGenerice;
public class CutieExtinsa<T, U> {
    T comportament1;
    U comportament2;
    
    CutieExtinsa(){
        
    }
    
    CutieExtinsa(T comportament1, U comportament2){
        this.comportament1 = comportament1;
        this.comportament2 = comportament2;
    }
    
    
    public String toString(){
        return this.comportament1 + " " + this.comportament2;
    }
}