package Exceptions.DB;

public class Ex {
    public static void main(String[] args){
        ConexiuneDB con = null;
        
        try{
            con = new ConexiuneDB();
        }catch(DBException e){
         
        }finally{
            
            if(con != null){
                con.close();
            }
        }
    }
}