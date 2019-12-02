package Colectii.List;
import java.util.*;
public class Ex2 {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(0);
        list.add(4);
        list.add(9);
        
        list.remove(0);                 //sterge indexul(pozitia)
        list.remove(new Integer(0));    //sterge valoarea 0
        
        System.out.println(list);   //afiseaza un toString
    }
}