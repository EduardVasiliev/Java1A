package Thread.ConsumatorProducator;
public class Consumator extends Thread{
    
    public Consumator(String nume){
        super(nume);
    }
    
    @Override
    public void run(){
        while(true){
            
            try{
                synchronized(Ex.list){
                    if(!Ex.list.isEmpty()){
                        int x = Ex.list.get(0);
                        Ex.list.remove(0);
                        System.out.println("A fost eleminat elementul: " + x);
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
}