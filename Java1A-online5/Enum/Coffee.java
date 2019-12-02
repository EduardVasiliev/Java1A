package Enum;

public enum Coffee {
    CAFE_LATE(10), ESPRESSO(15), COFFEE_BLACK(7), MACCIATO;
    //putem folosi supraincarcarea de constructori ca si la clase;
    
    double pret;
    
    Coffee(double pret){
        this.pret = pret;
    }
    
    Coffee(){
        
    }
}
