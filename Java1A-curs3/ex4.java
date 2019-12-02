public class ex4 {
    public static void main(String[] args){
        int a[];
        
        a = new int[]{ 5, 1,8};
        int b[] = {5, 1, 8};
        
        int a1[];
        a1 = new int[3];
        a1[0] = 5;
        a1[1] = 1;
        a1[2] = 8;
        
        System.out.println(new ex4().compara(a1, a));
    }
    //returneaza true daca toate elementele din a sunt egale cu cele din b.
    boolean compara(int a[], int b[]){
        
        if (a.length != b.length){
           return false;
        }
        for (int i=0;i<a.length; i++){
            if (a[i] != b[i]){
               return false;
            }
        }
    return true;
    }
}
