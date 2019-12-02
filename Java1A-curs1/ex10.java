// Switch
public class ex10 {
    public static void main(String[] args){
        int x = 2;
        
        // fara break, cursorul se duce pe 2, si curge in jos pana la final
        switch(x){
            case 1 : System.out.println("X este 1");
            case 2 : System.out.println("X este 2");
            case 3 : System.out.println("X este 3");
            case 4 : System.out.println("X este 4");
            default : System.out.println("invalid \n");
        }
        
        switch(x){
            case 1 : System.out.println("X este 1");
            break;
            case 2 : System.out.println("X este 2");
            break;
            case 3 : System.out.println("X este 3");
            break;
            case 4 : System.out.println("X este 4");
            break;
            default : System.out.println("invalid");
        }
        
        // Tipuri 
        // byte, short, int, char, String, Enum. 
    }
}
