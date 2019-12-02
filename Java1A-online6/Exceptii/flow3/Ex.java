package Exceptii.flow3;

public class Ex {
    public static void main(String[] args){
        
        try{
            System.out.println("A");
            m(17);
            System.out.println("B");
            
        }catch(DerivedException e){
            System.out.println("C");
            
        }catch(BaseException e){
            System.out.println("D");
            
        }catch(Exception e){
            System.out.println("Exceptie generala");
            
        }finally{
            System.out.println("C");
        }
    
    }
    
    public static void m(int x) throws DerivedException, BaseException{
        
        if(x<10){
            BaseException e = new BaseException();
            throw e;
        }
        if(x>15){
            DerivedException e = new DerivedException();
            throw e;
        }
    }
}