package Exceptii.flow2;

public class Ex {
    public static void main(String[] args){
        int x = 11;
        
        try{
            System.out.println("A");
            m(x);
            System.out.println("B");
            
        }catch(MyCheckedException e){
            System.out.println("D");
            
        }finally{
            System.out.println("C");
        }
    
    }
    
    public static void m(int x) throws MyCheckedException{
        if (x>5){
            MyCheckedException e = new MyCheckedException();
            throw e;
        }
    }
}