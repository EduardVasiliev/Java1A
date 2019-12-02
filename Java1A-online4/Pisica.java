//modificatori de acces
public class Pisica {
    int varsta;
    public String nume;
    protected String rasa;
    private double greutate;
    
    public Pisica(int varsta, String nume, String rasa, double greutate){
        this.varsta = varsta;
        this.nume = nume;
        this.rasa = rasa;
        this.greutate = greutate;
    }
    
    public double getGreutate(){
        return greutate;
    }
    
    public void setGreutate(double greutate){
        this.greutate = greutate;
    }
    
    public void spuneMeow(){
        System.out.println("Meaauu");
    }
    
    protected String spuneNume(){
        return "ma numesc " + nume;
    }
    
}
