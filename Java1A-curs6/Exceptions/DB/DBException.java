package Exceptions.DB;

public class DBException extends Exception {

    public DBException(){
        super("Conexiune esuata");
    }
}