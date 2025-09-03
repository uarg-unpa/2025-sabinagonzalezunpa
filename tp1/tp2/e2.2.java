package tp1.tp2;

public class Libro {

    private String edicion;
    private String titulo;
    private String autor;
    private String editorial;
    private String añodepublicacion;

    public Libro(String edicion, String titulo, String autor, String editorial, String añodepublicacion)
    {
        this.edicion=edicion;
        this.titulo=titulo;
        this.autor=autor;
        this.editorial=editorial;
        this.añodepublicacion=añodepublicacion;
    }
    public String getEdicion()
    {
        return this.edicion;
    }
    public void setEdicion(String edicion)
    {
        this.edicion=edicion;
    }
    public String getTitulo()
    {
        return this.titulo;
    }
    public void setTitulo(String titulo)
    {
        this.titulo=titulo;
    }
    public String getAutor()
    {
        return this.autor;
    }
    public void setAutor(String autor)
    {
        this.autor=autor;
    }
    public String getEditorial()
    {
        return this.editorial;
    }
    public void setEditorial(String editorial)
    {
        this.editorial=editorial;
    }
    public String getAñodepublicacion()
    {
        return this.añodepublicacion;
    }
    public void setAñodepublicacion(String añodepublicacion)
    {
        this.añodepublicacion=añodepublicacion;
    }
}  