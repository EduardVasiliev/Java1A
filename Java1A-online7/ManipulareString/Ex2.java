package ManipulareString;
public class Ex2 {
    public static void main(String[] args){
        String s1 = " Hello World! ";
        
        if (!s1.isEmpty()){
            System.out.println(s1.length());
            s1 = s1.trim();
            System.out.println(s1.length());
        }else{
            System.out.println("Empty String");
        }
    }
}