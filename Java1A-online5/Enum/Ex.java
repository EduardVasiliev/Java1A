package Enum;

public class Ex {
    public static void main(String[] args){
        
        Coffee c1 = Coffee.ESPRESSO;
        //deferentiere direct din numele enumerarii.
        
        switch(c1){
            case ESPRESSO:
                System.out.println("Ai comandat Espresso");
                break;
            case CAFE_LATE: 
                System.out.println("Ai comandat Cafe Late");
                break;
            case COFFEE_BLACK:
                System.out.println("Ai comandat Coffe Black");
                break;
            case MACCIATO:
                System.out.println("Ai comandat Macciato");
                break;
            default:
                System.out.println("Ai comandat alt tip de cafea");
        }
        
        //Parcurgere
        
        for (Coffee c : Coffee.values()){
            System.out.println(c.ordinal() +" "+c.name());
        }
    }
}