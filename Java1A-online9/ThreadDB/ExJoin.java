package ThreadDB;
public class ExJoin {
    public static void main(String[] args){
        long l1 = System.currentTimeMillis();
        
        Thread thr1 = new Thread(() -> collectDataFromDB1());
        Thread thr2 = new Thread(() -> collectDataFromDB2());
        thr1.start();
        thr2.start();
        
        //join
        try{
            thr1.join();
            thr2.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        
        long l2 = System.currentTimeMillis();
        System.out.println("Exection time: " + (l2-l1));
    }
    
    public static void collectDataFromDB1(){
        try{
            Thread.sleep(2000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
    
    public static void collectDataFromDB2(){
        try{
            Thread.sleep(3000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}