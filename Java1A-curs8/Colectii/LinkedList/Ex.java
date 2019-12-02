package Colectii.LinkedList;

import java.util.*;
public class Ex {
    public static void main(String[] args){
        LinkedList<Integer> list = new LinkedList<>();
        
        list.addFirst(6);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);        // 6 3 4 5
        list.removeFirst();     // 3 4 5
        list.addFirst(0);       // 0 3 4 5
        list.addLast(1);        // 0 3 4 5 1
        list.removeFirst();     // 3 4 5 1
        list.removeLast();      // 3 4 5
        
        for (int x: list){
            System.out.print(x + " ");
        }
    }
}
