package tp1;

public class Libro1 {
    private String titulo;
    private String autor;
    private int añoPublicacion;
    private int cantidadPaginas;

    public Libro1(String titulo, String autor, int añoPublicacion, int cantidadPaginas)
    {
        this.titulo=titulo;
        this.autor=autor;
        this.añoPublicacion=añoPublicacion;
        this.cantidadPaginas=cantidadPaginas;
    }
    public void setTitulo(String titulo)
    { 
        this.titulo=titulo;
    }
    public String getTitulo()
    {
        return this.titulo;
    }
    public void setAutor(String autor)
    {
        this.autor=autor;
    }
    public String getAutor()
    {
        return this.autor;
    }
    public void setAñoPublicacion(int añopublicacion)
    {
        this.añoPublicacion=añopublicacion;
    }
    public int getAñoPublicaion()
    {
        return this.añoPublicacion; 
    }
    public void setCantidadPaginas(int cantidadPaginas)
    {
        this.cantidadPaginas=cantidadPaginas;
    }
    public int getCantidadPaginas()
    {
        return this.cantidadPaginas;
    }

    public boolean esReciente () {
        if (this.añoPublicacion > 2010){
        return true;
        }else {
        return false;
        }
    }
}
