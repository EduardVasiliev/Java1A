package fireDeExecutie;
public class evenNumbersRunnable implements Runnable {

      @Override
      public void run(){
          for(int i=0; i<50; i+=2){
              System.out.print(i+" ");
          }
      }
      
}