package Aplicatie;

import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        
        String line;
        String[] input;
        
        while(true){
            line = scan.nextLine();
            input = line.split("\\s+");
            
            switch(input[0].toUpperCase()){
                case "ADD" :               
                    list.add(new Integer(input[1]));
                    break;
                    
                case "PRINT" :               
                    list.forEach(i -> System.out.println(i));      //exact acelasi lucru ca enhanced for, doar ca pentru lambda.
                    break;
                    
                case "PRINT_SORTED" :          
                    List<Integer> aux = new ArrayList<>(list);     //facem o clona a listei
                    Collections.sort(aux);
                    aux.forEach(i -> System.out.println(i));
                    break;
   
                case "REMOVE" :        
                    list.remove(new Integer(input[1]));
                    break;
                    
                case "REMOVE_ALL" : 
                    Integer x = Integer.parseInt(input[1]);
                    while(list.contains(x)){   //stergerea permanenta a unui element.
                        list.remove(x);
                    }
                    break;
                case "CLEAR" : 
                    list.clear();
                    break;
                    
                case "EXIT" : 
                    System.exit(0);
                    break;
                    
                default: System.err.println("Comanda Invalida");
            }
        }
    }
}