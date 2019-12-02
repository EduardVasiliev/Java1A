package ProgramCafenea;
import java.util.*;
public class Ex {
    
    private static void afis(){ //pt Thread
        while (true){
            int count = Cafenea.getInstance().getCount();
            System.out.println("Exista " + count + "bauturi");

            try{
                Thread.sleep(10000);  //thread-ul asteapta 10 secunde.
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args){
        new Thread(() -> afis()).start(); //pt Thread;  // new Thread(Ex::afis).start(); REFERINTA LA METODA
        
        Scanner scan = new Scanner(System.in);
        
        String line;
        String [] input;
        
        while(true){
            try{
                line = scan.nextLine();
                input = line.split("\\s+");
                
                switch(input[0].toUpperCase()){
                    case "ADD_S" :
                        String nume = input[1];
                        int pret = Integer.parseInt(input[2]);
                        int zahar = Integer.parseInt(input[3]);
                        Cafenea.getInstance().adauga(
                            new Suc(nume, pret, zahar)
                        );
                        break;
                    case "ADD_C" : 
                        String nume1 = input[1];
                        int pret1 = Integer.parseInt(input[2]);
                        int cofeina = Integer.parseInt(input[3]);
                        Cafenea.getInstance().adauga(
                            new Cafea(nume1, pret1, cofeina)
                        );
                        break;
                    case "PRINT" :
                        Cafenea.getInstance().afiseazaBauturi();
                        break;
                    case "PRINT_S" :
                        Cafenea.getInstance().afiseazaSucuri();
                        break;
                    case "REMOVE" :
                        Cafenea.getInstance().sterge(input[1]);
                        break;
                    case "EXIT" :
                        System.exit(0);
                        break;
                    default: System.err.println("Comanda invalida");
                    
                }
            }catch (Exception e){
                System.err.println(e);
            }
        }
    }
}