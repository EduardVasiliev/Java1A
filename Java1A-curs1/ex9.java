public class ex9 {
    public static void main(String[] args){
        int a = 10;
        int b = 5;
        int c = 9;
        
        if (a>b && a>c){
            System.out.println("a este cel mai mare");
        }else if(b>a && b>c){
            System.out.println("b este cel mai mare");
        }else if (c>a && c>b){ 
            System.out.println("c este cel mai mare");
        }else{
            System.out.println("a aparut o eroare");
        }
        
        //operator ternar
        int max = a>b ? a : b;
        System.out.println(max>c ? max: c);
    }
}
