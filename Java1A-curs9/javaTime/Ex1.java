package javaTime;
import java.time.*;
public class Ex1 {
    public static void main(String[] args){
        //LocalDate
        LocalDate ld1 = LocalDate.now(); //obtine data actuala a sistemului pe care apare aplicatia.
        System.out.println(ld1);
        
        LocalDate ld2 = LocalDate.of(1970, 1, 1);  //an luna zi
        System.out.println(ld2);
        
        LocalDate ld3 = LocalDate.of(1960, Month.JANUARY, 1);
        System.out.println(ld3);
        
        System.out.println("---------------------");
        
        //LocalTime
        LocalTime lt1 = LocalTime.now();
        LocalTime lt2 = LocalTime.of(10, 42, 35);  //10:42:35
        
        System.out.println(lt1);
        
        System.out.println("---------------------");
        
        //LocalDateTime
        LocalDateTime ldt1 = LocalDateTime.now();
        LocalDateTime ldt2 = LocalDateTime.of(2017,01,01, 12,30,37);
        LocalDateTime ldt3 = LocalDateTime.of(ld1, lt1);                //supraincarcare
        System.out.println(ldt1);
        System.out.println(ldt2);
        System.out.println(ldt3);
    }
}
/*
toate clasele din pachet sunt imutabile. Toate au constructorul privat.
.now(); metoda statica. Este dereferentiata direct din clasa LocalDate.
Ordinea datei este de la cel mai mare parametru la cel mai mic.
*/