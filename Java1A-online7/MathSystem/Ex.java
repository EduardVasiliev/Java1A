package MathSystem;

public class Ex {
    public static void main(String[] args){
        double a = Math.random();
        double b = Math.pow(2, 10);
        double c = Math.sqrt(225);
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        
        long l1 = System.currentTimeMillis();
        int x[] = new int[5];
        
        for(int i=0; i<x.length; i++){
            x[i] = i;
        }
        
        for(int i : x){
            System.out.print(i + " ");
        }
        System.out.println();
        
        int y[] = new int[6];
        System.arraycopy(x, 0, y, 0, 5);
        y[5] = 10;
        for(int i : y){
            System.out.print(i + " ");
        }
        System.out.println();
        
        long l2 = System.currentTimeMillis();
        
        System.out.println("Executia dureaza: " + (l2-l1) + " milisecunde");
    }
}