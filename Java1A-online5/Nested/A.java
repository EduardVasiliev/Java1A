package Nested;

public class A {
    int x;
    private int z;
    static int y;
    
    //inner non-statica;
    public class B{
        int x;
        
        public void m1(){
            z++;
            this.x++;
            A.this.x++;
            // am facut referire la atributul x al clasei top-level;
            // aceasta este singurul context in care se deferentiaza this.
            y++;
        }
    }
    
    static public class C{
        public void m2(){
            y++;
            
            //x++;  x nu e static.
        }
    }
}