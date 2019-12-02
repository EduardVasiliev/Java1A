package Colectii.TreeSetAngajati;
import java.util.*;

public class Ex9 {
    public static void main(String[] args){
        Comparator<Angajat> comp = new Comparator<Angajat>(){
            
            @Override
            public int compare(Angajat a1, Angajat a2){
                return a1.nume.compareTo(a2.nume);
            }
        };
        
        // cu lambda
        Comparator<Angajat> comp2 = (a1,a2) -> a1.nume.compareTo(a2.nume);
        
        Set<Angajat> angajati = new TreeSet<>(comp);
        
        angajati.add(new Angajat("Gigel", 24));
        angajati.add(new Angajat("Costel", 30));
        angajati.add(new Angajat("Ionel", 21));
        angajati.add(new Angajat("Maria", 22));
        
        System.out.println(angajati);
    }
}