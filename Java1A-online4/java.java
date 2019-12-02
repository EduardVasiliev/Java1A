public class java {
    public static void main (String[] args){
        Punct p1 = new Punct();
        Cerc c1 = new Cerc();
        
        Punct p3 = new Cerc();
        
        boolean b1 = p1 instanceof Cerc;
        boolean b2 = c1 instanceof Cerc;
        boolean b3 = p3 instanceof Punct;
        boolean b4 = p3 instanceof Cerc;
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        
    }
}
