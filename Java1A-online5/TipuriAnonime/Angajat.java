package TipuriAnonime;

public class Angajat {
    double salariu;
    int aniVechime;
    
    public Angajat(double salariu, int aniVechime){
        this.salariu = salariu;
        this.aniVechime = aniVechime;
    }
    
    public double calculeazaSalariu(){
        if(aniVechime >= 3){
            return salariu += 500;
        }else{
            return salariu;
        }
    }
}