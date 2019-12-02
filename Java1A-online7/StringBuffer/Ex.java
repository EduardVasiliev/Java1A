package StringBuffer;
public class Ex {
    public static void main(String[] args){
        String s1 = "Hello World";
        
        StringBuffer sb1 = new StringBuffer(s1);

        sb1.append(" Happy");        
        sb1.delete(0, 6);  //sterge de la -> la.     
        sb1.replace(0, 1, "HEY");
        sb1.substring(0,2);
        sb1.setCharAt(0, 'K');
        sb1.reverse();

    }
}