
public class Pelicula{

    private String titulo;
    private String director;
    private Genero genero;
    private int añoDePublicacion;
    private int contenidopelicula;
    private int duracion;

    public Pelicula(String titulo, String director, Genero genero, int añoDePublicacion, int contenidopelicula, int duracion){
    this.titulo = titulo;
    this.director = director;
    this.genero = genero;
    this.añoDePublicacion = añoDePublicacion;
    this.contenidopelicula= contenidopelicula;
    this.duracion=duracion;
    }

    public String getTitulo()
    {
        return this.titulo;
    }
    public void setTitulo(String titulo)
    {
        this.titulo=titulo;
    }
    public String getDirector()
    {
        return this.director;
    }
    public void setDirector(String director)
    {
        this.director=director;
    }
    public Genero getGenero()
    {
        return this.genero;
    }
    public void setGenero(Genero genero)
    {
        this.genero=genero;
    }
    public int getAñoDePublicacion()
    {
        return this.añoDePublicacion;
    }
    public void setAñoDePublicacion(int añoDePublicacion)
    {
        this.añoDePublicacion=añoDePublicacion;
    }
    public int getContenidopelicula()
    {
        return this.contenidopelicula;
    }
    public void setContenidoPelicula(int contenidopelicula)
    {
        this.contenidopelicula=contenidopelicula;
    }
    public int getDuracion()
    {
        return this.duracion;
    }
    public void setDuracion( int duracion)
    {
        this.duracion=duracion;
    }

    public boolean esParaAdulto(){
        if( this.contenidopelicula >= 18){
            return true;
        }else{
            return false;
        }
    }
    public void actualizarRating(int rating){  
        this.genero.setRating(rating);
    }
    public int calcularDuracionMinutos(){
        return (duracion * 60);
    }
    public String toString(){
        return "[ " + this.titulo + "] [ " + this.director + "] [ " + this.genero + "] [ " + this.añoDePublicacion + "] [ " + this.contenidopelicula + "] [ " + this.duracion + "]";
    }
}