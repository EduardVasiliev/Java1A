package ProgramCafenea;
public abstract class Bautura {         //abstract impiedica instantierea clasei
    public String nume;
    public int pret;
    
    public Bautura(String nume, int pret){
        this.nume = nume;
        this.pret = pret;
    }
    
    @Override
    public String toString(){           //scrie instanta sub forma de string
        return nume + " : " + pret;
    }
    
    @Override
    public boolean equals(Object other){    //verificam egalitatea dintre bauturi
        if (!(other instanceof Bautura)){
            return false;
        }
        
        Bautura b = (Bautura) other;   //caset
        
        return this.equals(b.nume);
    }
    
    //la pachet cu equals vine si hashcode care trebuie deasemenea sa fie suprascrisa/
    
    @Override
    public int hashCode(){
        return nume.hashCode();
    }
    
    //design de clasa complet. Daca aveam de ex. sortare, trebuia suprascris Comparable.
}