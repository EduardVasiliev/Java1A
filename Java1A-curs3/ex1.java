// Static,Blocuri anonime
import java.util.Scanner;
public class ex1 {

    public static void main(String[] args) {
        caine c1 = new caine("Rex", 10);
        caine c2 = new caine("Max", 4);
        
       System.out.println(c1.id);
       c2.id++;
       System.out.println(c1.id);
        
    }
    
}

