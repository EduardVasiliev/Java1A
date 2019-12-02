package Colectii.Deque;

import java.util.*;

public class Ex {
    public static void main(String[] args){
        
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        
        deque.push(6);      //'addFirst'
        deque.push(4);
        deque.push(3);
        deque.offer(8);     //'addLast'
        
        System.out.println(deque);
        System.out.println("POP: " + deque.pop());      //'removeFirst' <- daca nu are ce sa itoarca: null
        System.out.println(deque);
        System.out.println("POLL: " + deque.poll());    //'removeFirst' <- daca nu are ce sa intoarca: exceptie
        System.out.println(deque);
        System.out.println("PEEK: " + deque.peek());    //'getFirst'
    }
}
//ArrayDeque este considerat un deque pur.