package Interfete.Animale;

@FunctionalInterface
public interface Carnivor {
    public abstract void manancaCarne();
    
    public default void aleargaPrade(){
        System.out.println("Alearga dupa prada!");
    }
}
