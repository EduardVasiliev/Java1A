package Nested;

public class Exemplu{
    public static void main(String[] args){
        A instantaA = new A();
        
        //instanta B inner-class non-statica
        A.B instantaB = instantaA.new B();
        
        //instanta C ineer-class statica
        A.C instantaC = new A.C();
    }
}