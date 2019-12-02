package StringBuilder;
public class Ex {
    public static void main(String[] args){
        String s1 = " Hello World!";
        
        if(!s1.isEmpty()){
            System.out.println(s1.length());
            s1 = s1.trim();
            System.out.println(s1.length());
            
            StringBuilder sb1 = new StringBuilder(s1);
            sb1.reverse();
            System.out.println(sb1);
        }else{
            System.out.println("Stringul este gol");
        }
        
        int i = 1;
        StringBuilder sb2 = new StringBuilder();
        while (i<100){
            sb2.append(i);
            i++;
        }
        System.out.println(sb2);
        
    }
}