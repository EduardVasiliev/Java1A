public class ex6 {
    public static void main(String[] args){
    // && - face 'scurt-circuit'. Daca primul termen e fals -> rezultat automat fals
    boolean b1 = true;
    boolean b2 = false;
    boolean b3 = !b2;
    
    System.out.println(b3);
    System.out.println(b1 || b2);
    System.out.println(b2 && b3);
    
    }
}
