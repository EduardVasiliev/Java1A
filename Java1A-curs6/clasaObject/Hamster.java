package clasaObject;

public class Hamster{
    String nume;
    int varsta;
    
    @Override
    public boolean equals(Object obj){
        
        if(!(obj instanceof Hamster)){
            return false;   
        }
        
        Hamster h = (Hamster) obj;  //cast
        
        if(this.varsta != h.varsta){
            return false;
        }
        
        if(!this.nume.equals(h.nume)){
            return false;
        }
        
        return true;
    }
    
    public int hashCode(){
        return varsta * 4 - nume.hashCode() / 3 ;
    }
    
    @Override
    public String toString(){
        return this.nume + " chitz chitz " + this.varsta;
    }
}

