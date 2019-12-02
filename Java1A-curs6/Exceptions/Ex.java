package Exceptions;

public class Ex {
    public static void main(String[] args){
        System.out.println("Inceput Main");
        
        try{
            m(1);  
        }catch(MyException e){   //am tratat pentru MyException pentru nu a ajunge in Runtime.
            System.out.println("catch 1");
            System.out.println(e.getMessage());
            System.out.println(e);
            e.printStackTrace();     
        }catch(MyRuntimeException | NullPointerException e){
            System.out.println("catch 2");       
        }finally{
            System.out.println("in finally");
        }
        
        System.out.println("Sfarsit Main");
    }
    
    private static void m(int i) throws MyException, MyRuntimeException{         
        switch(i){
            case 1:
                MyRuntimeException e = new MyRuntimeException();
                 if(1 == 1) throw e;
                 System.out.println("Dupa Throw");
            case 2:
                throw new MyException();  //am propagat-o prin 'throws MyException'
        }
    }
}