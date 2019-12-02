package Object;

public class Punct {
    int x;
    int y;
    
    Punct(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    @Override
    public String toString(){
        return "Punctul are coordonatele X: "+ this.x +" Y: "+ this.y;
    }
}

/*
        equals();
        toString();
        hashCode();
        finalize();
*/