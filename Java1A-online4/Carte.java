public class Carte {
    private String autor;
    private int numarPagini;
    
    public Carte(String autor, int numarPagini){
        this.autor = autor;
        this.numarPagini = numarPagini;
    }
    
    public String getAutor(){
        return autor;
    }
    
    public int numarPagini(){
        return numarPagini;
    }
}
