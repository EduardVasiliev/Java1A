//operatori de incrementare ; decrementare
public class ex7 {
    public static void main(String[] args){
        int x = 6;
        
        //post-incrementare
        x++;
        //pre-incrementare
        ++x;
        
        int a = x++ + ++x - 4;
       
        // ++x
        // a = x + x - 4; 
        // x++
        
        System.out.println("a= " + a);
        System.out.println("x= " + x);
        
        System.out.println( 4*(3+2)>12 || 5<3 && true);
        // ordine operatori : aritmetici > relationali > logici > atribuire
        // 4*(3+2)>12 -> true da valoare intregii paranteze
    }
}
