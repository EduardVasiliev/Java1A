package SingletonPattern.Sinconizat;

public class Ex {
    public static void main(String[] args){
        Caine c1 = Caine.getInstance();
        c1.nume = "Han";
        
        System.out.println(c1.nume);
        
        Caine c2 = Caine.getInstance();
        c2.nume = "Ref";
        
        System.out.println(c1.nume);
    }
}