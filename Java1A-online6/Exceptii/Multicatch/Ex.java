package Exceptii.Multicatch;
public class Ex {
    public static void main(String[] args){
        try{
            m(17);
            int x[] = new int[5];
            x[6] = 10;       //ArrayIndexOutOfBoundException
            int y = 10/0;    //ArithmeticException
            
            
        }catch(ArrayIndexOutOfBoundsException | ArithmeticException  | DerivedException e){
            System.out.println("A");
            System.out.println(e.getMessage());
        }catch(BaseException e){
            System.out.println("B");
        }
    }
    
    public static void m(int x) throws BaseException, DerivedException{
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