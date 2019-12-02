package Colectii.TreeSet;
import java.util.*;

public class Ex {
    public static void main(String[] args){
        Set<Integer> set = new TreeSet<>();
        
        set.add(1);
        set.add(4);
        set.add(8);
        set.add(1);
        
        System.out.println(set);            // TreeSet SORTEAZA setul.
        
        set.forEach(i -> System.out.println(i));    //ca un enhanced for
        
        //predicat
        
        Predicat<Integer> p1 = i -> i%2 == 0;
        System.out.println(p1.test(3));
        System.out.println(p1.test(0));
    }
}