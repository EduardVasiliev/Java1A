package Thread;

public class OddNumbersThread extends Thread {
    
    OddNumbersThread(){
        
    }
    
    @Override
    public void run(){
        try{
            for(int i=1; i<20; i+=2){
                System.out.print(i + " ");
                Thread.sleep(200);
            }
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}