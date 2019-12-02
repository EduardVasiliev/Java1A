public class caine {
    final String nume;
    int varsta;
    static int id;
    
    {
        System.out.println("bloc anonim");
        //this.nume = "max";
    } 
    static{
        System.out.println("bloc anonim static");
    }

    public caine(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    
    
    static void sayHello(){  // void sayHello - comportament; static void sayHello - static (metoda de clasa)
        System.out.println("ham" /** this.nume **/);  //context static
        
        //pot scrie asa
        caine c = new caine("", 0);
        c.sayHello();
    }
}

/*  
    ceva non-static nu se poate folosi in context static.
    blocuri anonime - initializatori de instanta (non-static); initializatori de clasa (static).
    def - blocuri de acolade definite in clasa
    blocurile anonime statice se executa primele. Executarea se face sus->jos.

    1)la prima folosire a clasei in cod : este incarcat in memorie:
        -se aloca zonele de memorie statice;
        -se apeleaza blocurile anonime statice;
    
    2)la crearea instantei:
        -se aloca zonele de memorie non-statice;
        -se apeleaza blocurile anonime non-statice;
        -se apeleaza constructorul;
*/

