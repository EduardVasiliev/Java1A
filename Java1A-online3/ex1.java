public class ex1 {
    public static void main(String[] args){
        Pisica p1 = new Pisica();
        p1.varsta = 10;
        // varsta e repr. cu ajutorul unei primitive de tip int
        System.out.println(p1.varsta); //valoarea initiala a valorii varsta este 10.
        
        p1.transferPrinValoare(p1.varsta);
        System.out.println(p1.varsta);
        //in urma transferului parametrului ca si valoare, modificarea nu se va pastra in cadrul programului, valoarea ramane 10.
        
        p1.transferPrinReferinta(p1);
        System.out.println(p1.varsta);
        //in urma transferului prin referinta, modificarea asupra atributului de varsta se va pastra la nivel global.
        
        
              
    }
}
