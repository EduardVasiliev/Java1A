package Colectii.Map;
import java.util.*;

public class Ex {
    public static void main(String[] args){
        Map<String,Integer> map = new HashMap<>();
        
        map.put("Gigel", 24);
        map.put("Costel", 25);
        map.put("Gigel", 20);
        
        System.out.println(map);
        
        for (String key : map.keySet()){
            System.out.println(key + " : " + map.get(key));
        }
        
        //forEach
        map.forEach((k,v) -> System.out.println(v));
    }
}