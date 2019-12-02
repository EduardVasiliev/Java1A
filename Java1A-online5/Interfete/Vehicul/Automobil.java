package Interfete.Vehicul;

public class Automobil implements VehiculTerestru, Vehicul {
    
    @Override
    public int spuneNrRoti(){
        return 4;
    }
    
    @Override
    public boolean seDeplaseaza(){
        return true;
    }
}
