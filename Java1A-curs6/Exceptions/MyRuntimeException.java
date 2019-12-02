package Exceptions;

public class MyRuntimeException extends RuntimeException {
    
    public MyRuntimeException(){
        super("Aceasta este exceptia mea unchecked");
    }
    
}

/*

abatere de la flow-ul obisnuit de executie;
Throwable - clasa care defineste exceptii

    Exceptii - 1. Remediabile (definite de clasa EXCEPTION)
               2. Iremediabile (definite de clasa ERROR)

Erori:
1. OutofMemoryError     (umplerea memoriei heap)
2. StackOverflowError   (umplerea memoriei stack)

Exceptii:
1. Checked   -> definita prin mostenirea clasei Exception. Trebuie tratata sau propagata.
2. Unchecked -> definita prin mostenirea clasei RuntimeException. Apare in timpul rularii programului

3. Exceptii tehnice - compilatorul nu are nicio vina. Vina programatorului. Nu se trateaza, se modifica codul;
4. Exceptii business - creata de programator care semnalaeaza o anumita situatie.

*/