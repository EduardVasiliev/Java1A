public class ex2 {
    public static void main(String[] args){
        
        //Tipuri intregi
        
        byte b1;
        b1 = 4;
        System.out.println(b1);
        b1 = 7;
        System.out.println(b1);
        
        short s1 = -27, s2, s3 = 1, s4, s5;
        
        //binar
        int i1 = 0b01110011;
        System.out.println(i1);
        
        //hexa
        int i2 = 0x2A5FB6;
        System.out.println(i2);
        
        //long. Se pune L la capat pentru a face conversia din int in long.
        long l1 = 10000000000L;
        System.out.println(l1);
        
        //Tipuri reale
        
        //float
        float f1 = 3.51f;
        //double
        double d1;
        d1 = 1_32_4.4_5;
        System.out.println(d1);
        
        //Tipuri de caractere
        
        //char
        char c1 = '$';
        System.out.println(c1);
        char c2 = '\n';
        System.out.println(c2);
        System.out.println("End");
        
        //cod Unicode
        char c3 = '\u1234';
        System.out.println(c3);
        
        //boolean
        boolean bo1 = true;
        boolean bo2 = false;
        System.out.println(bo1);
        
        // /n -> new line
        // //n -> /n este afisat
        String st1 = "Hello Wo\\nrld";
        System.out.println(st1 + 7 + 5);
        System.out.println(st1 + (7+5));
    }
}
