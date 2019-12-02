public class Punct {
    int x;
    int y;
    static int z;   // pot aplela z prin Punct.z
    
    static double calculeazaDistanta(){
        z++;
        // x++; Zonele non-statice nu pot fi accesate;
        return 0.0;
    }
}

