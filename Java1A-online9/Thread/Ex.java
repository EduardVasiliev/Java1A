package Thread;

public class Ex {
    public static void main(String[] args){
        OddNumbersThread thr1 = new OddNumbersThread();     //Thread
        EvenNumbersRunnable r = new EvenNumbersRunnable();  //Runnable
        Thread thr2 = new Thread(r);
        
        thr1.start();
        thr2.start();
        
        System.out.println("The End");
    }
}