public class ex5 {
    public static void main(String[] args){
        int a[][] = new int[3][3];
        
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a.length; j++){
                a[i][j] = i+j;
            }
        }
        for(int x[] : a){
            for(int y : x){
                System.out.print(y + " ");
            }
            System.out.println();
        }
        
        int a1[][] = new int [4][];
            a[0] = new int[2];
            a[1] = new int[4];
            a[2] = new int[3];
            a[2] = new int[1];
    }
}
