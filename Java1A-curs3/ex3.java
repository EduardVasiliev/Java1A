//array
public class ex3 {
    public static void main(String[] args){
        int a[] = {1, 2, 3};
        
        for(int i=0;i<a.length;i++){
            System.out.print(" " + a[i]);
        }
        for(int x:a){
            System.out.print(" "+x);
        }
    }
}
