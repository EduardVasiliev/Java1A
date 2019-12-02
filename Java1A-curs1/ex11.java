// Structuri repetitive
public class ex11 {
    public static void main(String[] args){
        int i = 0;
        while(i <= 4){
            
            if (i == 2){
                i++;
                continue;  //incheie loop-ul si o ia de la capat. Continua cu un nou loop.
            }
            
            System.out.println(i);
            i++;
            
        }
    }
}
