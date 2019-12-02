package Interfete.Vehicul;

public interface VehiculTerestru extends Vehicul {
    
    public abstract int spuneNrRoti();
    
    public default void spuneCuloare(){
        System.out.print("Rosu");
    }
}
