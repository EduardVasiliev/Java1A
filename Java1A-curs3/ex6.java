public class ex6 {
    public static void maine(String[] args){
        int a1[], x1;  // a1 array, x1 primitiva
        int[] a2, x2; // a2, x2 array
        int[] a3, x3[][], y3[];
        // a3 - 1 dimensiune
        // x3 - 3 dimensiuni
        // y3 - 2 dimensiuni 
        System.out.println(suma(1, 2, 5));
        System.out.println(suma(1, 3));
        System.out.println(suma(new int[]{1, 3, 5}));
    }
    
    
    static int suma(int ... a){    //varargs
        int sum = 0;
        for(int i=0;i<a.length;i++){
            sum += a[i];
        }
    return sum;
    }
}

