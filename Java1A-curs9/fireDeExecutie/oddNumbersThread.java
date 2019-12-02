package fireDeExecutie;
public class oddNumbersThread extends Thread {
    @Override
    public void run(){
        
        for(int i=1; i<50; i+=2){
            System.out.print(i+" ");
            
            try{
                Thread.sleep(100);               //asteapta 10ms
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }   
    }
}
//Fir de executie - set de instructiuni care de executa in paralel cu altul.
//Folosim clasa Thread.
//Orice metoda care pune un fir de executie in BLOCKED trebuie sa aiba o exceptie