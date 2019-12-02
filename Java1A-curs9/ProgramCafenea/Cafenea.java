package ProgramCafenea;
import java.util.*;
public class Cafenea {          //daca exista doar o cafenea, implementam Singleton
    private Map<String, Bautura> map = new HashMap<>();
    private static Cafenea singleton;
    
    private Cafenea(){   
    }
    
    public static Cafenea getInstance(){
        if (singleton == null){
            singleton = new Cafenea();
        }
        return singleton;
    }
    
    public void adauga(Bautura b) throws NameAlreadyExistsException {
        if(map.containsKey(b.nume)){
            throw new NameAlreadyExistsException();
        }
        
        map.put(b.nume, b);
    }
    
    public void sterge(String nume){ 
        map.remove(nume);
    }
    
    public void afiseazaBauturi(){ 
        map.forEach((k,v) -> System.out.println(v));    //forEach
    }
    
    public void afiseazaSucuri(){
        map.forEach((k,v) -> {
            if(v instanceof Suc){
                System.out.println(v);
            }
        });
    }
    
    public int getCount(){      //pentru Thread
        return  map.size();
    }

}