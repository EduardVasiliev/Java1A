package SingletonPattern.Nesincronizat;

public class Ex {
    public static void main(String[] args){
        Pisica p = Pisica.getInstance();
        p.Nume = "Tom";
        
        Pisica p1 = Pisica.getInstance();
        p1.Nume = "Mitzi";
        
        System.out.println(p.Nume);  
    }
    
}

// Avem o singura instanta.