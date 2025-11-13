package Control de niveles;

public class TemaMusical {
    private String interprete;
    private String genero;
    private int anio;

    public TemaMusical(String interprete, String genero, int anio){
        this.interprete= interprete;
        this.genero = genero;
        this.anio = anio;

        public String getInterprete(){
            return interprete;
        }
        public String getGenero(){
            return genero;
        }
        public int getAnio(){
            return anio;
        }
        public String toString(){
            return interprete + " " + genero + "(" + anio +")";
        }
    }
    
}
