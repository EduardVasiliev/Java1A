public class ex3 {
    public static void main(String[] args){
        Punct p1 = new Punct();
        Punct p2 = new Punct();
    
        // Zone de memorie statice
        
        p1.z = 2;
        System.out.println(p1.z);
        
        Punct.z = 10;
        System.out.println(Punct.z); // z este static. il pot apela prin numele clasei
        
        // Metode statice
        
        p1.calculeazaDistanta();
        Punct.calculeazaDistanta();
      
        
    }
}
