package Exceptii.flow;
public class Ex {
    public static void main(String[] args){
        int x = 11;
        
        try{
            System.out.println("A");
            if (x>5){
                MyCheckedException e = new MyCheckedException();
                throw e;
            }
            System.out.println("B");
            
        }catch(MyCheckedException e){
            System.out.println("D");
            
        }finally{
            System.out.println("C");
        }
    }
}