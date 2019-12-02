package clasaObject;

public class Ex {
    public static void main(String[] args){
        Hamster h1 = new Hamster();
        h1.nume = "pufi";
        h1.varsta = 3;
        
        Hamster h2 = new Hamster();
        h2.nume = "pufi";
        h2.varsta = 3;
        
        Hamster h3 = h2;
        
        System.out.println(h1.equals(null));
        System.out.println(h1.equals(h2));
        System.out.println(h1 == h2);
        System.out.println(h2 == h3);
        
        System.out.println(h1.hashCode());
        System.out.println(h2.hashCode());
        
        System.out.println(h1.toString()); 
    }
}

// .equals testeaza daca doua instante sunt identice ca parametrii (Continut).
// == testeaza daca ambele instante sunt egale; Referintele arata spre acelasi loc. Compara adresele.
