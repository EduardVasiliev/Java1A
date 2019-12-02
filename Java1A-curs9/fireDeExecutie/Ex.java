package fireDeExecutie;
public class Ex {
    public static void main(String[] args){
        oddNumbersThread t1 = new oddNumbersThread();
        
        t1.start();     //initializarea firului de executie   
        
        evenNumbersRunnable runnable = new evenNumbersRunnable();
        Thread t2 = new Thread(runnable);
        
        t2.start();
        
        try{
            t1.join();
            t2.join();
        }catch(InterruptedException e){
            
        }

        System.out.println("the end");
        
    }
}
/*
.start(); duce t1 in RUNNABLE. main este in momentul ala in RUNNING. Masina virtuala considera ca este mai bine
sa ruleze prima data 'main' si apoi firul de executie, pentru ca mai are doar o instructiune si nu vrea sa schimbe procesul.
.join(); pune firul actual de executie in asteptare, pana se executa t1. Mainul se executa ultimul. SINCRONIZARE
*/