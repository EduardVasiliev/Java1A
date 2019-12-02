package TipuriGenerice;
public class Ex {
    public static void main(String[] args){
        new Cutie();
        
        new Cutie<Creion>();
        new Cutie<Carte>();
        
        //new Cutie<int>(); <- nu se folosesc primitive, doar clase Wrapper
        new Cutie<Integer>();
        new Cutie<int[]>(); // <-- array-urile sunt obiecte
        
        
        Cutie<?> c3 = new Cutie<Creion>();
        Cutie<?> c4 = new Cutie<Integer>();
        
        Cutie<? extends Number> c5 = new Cutie<Integer>();
        Cutie<? super Integer> c7 = new Cutie<Number>();
        Cutie<? super Integer> c8 = new Cutie<Object>();
        
        CutieExtinsa<?, Creion> c10 = new CutieExtinsa<Integer,Creion>(15, new Creion("albastru"));
        System.out.println(c10);
        
        CutieExtinsa<? super Integer,? extends Number> c11 = new CutieExtinsa<Object, Double>();
        
        Cutie<Carte> c12 = new Cutie<>(new Carte("Morometii"));
        Cutie<Creion> c13 = new Cutie<>(new Creion("Rosu"));
        System.out.println(c12);
        System.out.println(c13);
    }
}