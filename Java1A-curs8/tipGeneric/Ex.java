package tipGeneric;

public class Ex {
    public static void main(String[] args){
        Cutie c1 = new Cutie();
        
        Cutie<Integer> c2 = new Cutie<Integer>();  // T = integer;
        
        // 'Boundary'
        Cutie<?> c3 = new Cutie<int[]>();
       
        Cutie<? extends Number> c4 = new Cutie<Double>();    //<ceva ce mosteneste Number>
        Cutie<? extends Number> c5 = new Cutie<Number>();
        //c5 = new Cutie<Object>();    -> Object nu extinde Number. Conditia ? nu este indeplinita.
        Cutie<? super Number> c6 = new Cutie<Object>();
        
        //Operator diamond;
        Cutie<? super Integer> c7 = new Cutie<>();
        
        new Cutie<Cutie<Cutie<Cutie<String>>>>();   //(*)
        
        //instantierea lui A
        new A<StringBuilder, String, Cutie<String>>();  //StringBuilder este un CharSequence
    }
}

/*
Un tip generic repr. abstractizarea unui tip de data intr-o clasa.
c2 are o instanta Cutie care accepta un tip generic Integer.
? - 'ceva'.

            ? extends Number
          --------------->
Object <- Number <- Integer
<---------------
  ? super Number

instanta cu un tip generic precizat formeaza la randul sau un alt tip de date. //(*)
*/