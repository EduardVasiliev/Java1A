package Lambda;

public class Ex {
    public static void main(String[] args){
        
        // Clasic
        
        Functie f1 = new Functie(){        
            @Override
            public double operatie(int x){
                return ++x;
            }
        };
        
        // Lambda
      
        Functie f2 = (int x) -> ++x;
        
        Functie f3 = (x) -> --x;
        Functie f4 = x -> {
            return ++x;
        };  
        
        System.out.println(f2.operatie(1));
        
        // Bifucntie
        
        BiFunctie b1 = (int x, int y) -> x + y;
        
        BiFunctie b2 = (a,b) -> a + b;
        BiFunctie b3 = (x,y) -> {
            return x/y;
        };
        BiFunctie b4 = (x,y) -> x - y;
    }
}