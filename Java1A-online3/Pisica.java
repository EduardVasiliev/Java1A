//Transfer prin valoare vs Transfer prin referință
public class Pisica {
    int varsta;
    String nume;
    double greutate;
    
    void transferPrinValoare(int varsta){
        varsta++;
        /*
            modificarile din cadrul acestei metode se pastreaza doar la nivel local.
            varsta fiind de fapt o copie a unui parametru trimis din programul principal.
        */
    }
    
    void transferPrinReferinta(Pisica p1){
        p1.varsta++;
        /*
            intrucat ca si parametru am trimis o referinta aunei instante de obiect a clasei Pisica,
            modificarile ce se efectueaza in cadrul metodei se vor pastra la nivel global.
        */
    }    
}
