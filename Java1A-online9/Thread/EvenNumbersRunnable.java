package Thread;

public class EvenNumbersRunnable implements Runnable{
    
    EvenNumbersRunnable(){
        
    }
    
    @Override
    public void run(){
        try{
            for(int i=0; i<20; i+=2){
                System.out.println(i+" ");
                Thread.sleep(200);
            }
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}