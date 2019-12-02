package Colectii.TreeSetAngajati;

public class Angajat {
    String nume;
    int varsta;
    
    public Angajat(String nume, int varsta){
        this.nume = nume;
        this.varsta = varsta;
    }
    
    public int compareTo(Angajat other){
        return (this.varsta - other.varsta) * (-1);
    }
    
    @Override
    public String toString(){
        return nume + " " + varsta;
    }
    
}