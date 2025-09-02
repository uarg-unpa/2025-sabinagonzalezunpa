package tp1.tp2;

public class Libro {

    String edicion;
    String titulo;
    String autor;
    String editorial;

    public Libro(String edicion, String titulo, String autor, String editorial)
    {
        this.edicion=edicion;
        this.titulo=titulo;
        this.autor=autor;
        this.editorial=editorial;
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
}  