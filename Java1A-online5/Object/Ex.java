package Object;

public class Ex {
    public static void main(String[] args){
        Punct p1 = new Punct(1,1);
        Punct p2 = new Punct(1,1);
        Punct p3 = p2;
        Punct p4 = new Punct(2,2);
        
        System.out.println(p1 == p2);
        System.out.println(p2 == p3);
        System.out.println(p1.equals(p2));
        System.out.println(p2.equals(p4));
        
        System.out.println(p1);
        System.out.println(p4);
        System.out.println(new Punct(10,5));
    }
}