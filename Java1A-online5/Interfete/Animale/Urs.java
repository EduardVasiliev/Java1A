package Interfete.Animale;


public class Urs implements Carnivor, Ierbivor {
    
    @Override
    public void manancaCarne(){
        System.out.println("Mananca Carne");
    }
    
    @Override
    public void manancaIarba(){
        System.out.println("Mananca Iarba");
    }
}
