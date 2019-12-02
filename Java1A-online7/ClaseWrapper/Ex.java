package ClaseWrapper;
public class Ex {
    public static void main(String[] args){
        int x = 10;
        
        Integer i1 = x;  //boxing
        Integer i2 = 10; //boxing
        
        int i3 = new Integer(15); //unboxing
        
        Integer i4 = new Integer(20);
        Integer i5 = new Integer("30");
        
        String s1 = "45";
        int i6 = Integer.parseInt(s1);
        
        Boolean b1 = new Boolean("true");
        Boolean b2 = new Boolean(false);
        
        Character c1 = new Character('c');
        
    }
}