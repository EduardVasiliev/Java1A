package SingletonPattern;

public class EX {
    public static void main(String[] args){
        ConexiuneBD bd1 = ConexiuneBD.getInstance();    //prima data cand folosim metoda, facem instanta;
        
        bd1.durata = 10;
        bd1.nume = "Oracle";
        
        ConexiuneBD bd2 = ConexiuneBD.getInstance();    //se va folosi tot instanta creata initial
        
        System.out.println(bd2.durata);                 //parametrii vor avea valorile date mai sus, fiind de fapt doua referinte catre aceeasi instanta.
        System.out.println(bd2.nume);
    }
}