package TipuriAnonime;

public class Ex {
    public static void main(String[] args){
        Angajat a1 = new Angajat(2500, 5);
        Angajat a2 = new Angajat(4200, 10);
        
        Angajat a3 = new Angajat(1553, 2){
            @Override
            public double calculeazaSalariu(){
                return 5000;
            }
        };
        
        System.out.println(a1.calculeazaSalariu());
        System.out.println(a2.calculeazaSalariu());
        System.out.println(a3.calculeazaSalariu());
    }
}