package Exceptions.DB;

public class Ex2 {
    public static void main(String[] args){
        
        try (ConexiuneDB con1 = new ConexiuneDB();
             ConexiuneDB con2 = new ConexiuneDB()){
            
            throw new RuntimeException("In Try");
            
        }catch (Exception e){
            System.out.println(e);
            
            //afisarea exceptiilor suprimate
            Throwable [] ts = e.getSuppressed();
            for(Throwable t : ts){
                System.out.println(t);
            }
        }
    }
}

// Acelasi lucru ca la Ex, scris mai scurt.
// Resursele se inchid automat aici
// Resursele se inchid de jos in sus
