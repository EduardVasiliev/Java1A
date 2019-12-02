package Colectii.Seturi;
import java.util.*;

public class Ex {
    public static void main(String[] args){
        
        Set<String> set = new HashSet<>();
        
        set.add("Iasi");
        set.add("Brasov");
        set.add("Sibiu");
        set.add("Iasi");
        set.add("Bucuresti");
        
        System.out.println(set);   //Ordinea este stabilita de hashSet. Orice set inlatura duplicatele
        
        Set<String> set2 = new LinkedHashSet<>();
        
        set2.add("Iasi");
        set2.add("Brasov");
        set2.add("Sibiu");
        set2.add("Iasi");
        set2.add("Bucuresti");
        
        System.out.println(set2);   //Ordinea este pastrata
        
        
        
    }
}