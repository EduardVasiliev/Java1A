package ConsumatorProducator;
import java.util.*;
public class Producator extends Thread{
    private Random r = new Random();
    
    public Producator(String nume){
        super(nume);    //constructorul clasei Thread
    }
    
    @Override
    public void run(){
        while(true){

            try{
                synchronized(Ex.list){
                    if(Ex.list.size() < 100){
                        int x = r.nextInt();
                        Ex.list.add(x);
                        System.out.println("A fost adaugat elementul " + x);
                        Ex.list.notifyAll();
                    }else{
                        Ex.list.wait();
                    }
                }
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
    
    public synchronized void m(){
        //monitorul este chiar instanta clasei
        //daca era metoda statica, s-ar fi folosit tipul clasei
    }
}