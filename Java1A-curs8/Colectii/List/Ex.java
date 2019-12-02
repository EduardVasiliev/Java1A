package Colectii.List;
import java.util.*;

public class Ex {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        
        list.add(5);
        list.add(4);
        list.add(7);
        System.out.println(list.add(4));  //verific daca a fost modificata colectia
        System.out.println(list.get(0));
        System.out.println(list.contains(4)); 
        System.out.println(list.size());
        System.out.println(list.isEmpty());   
        
        //parcurgere
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i));
        }
        
        for(int x:list){
            System.out.println(x);
        }
        
        
    }

}

//Lista e o colectie care retine duplicatele si pastreaza ordinea in care elementele sunt adaugate (este ordonata)
