
public class Genero{
    
    private String nombre;
    private int rating;

    public Genero(String nombre, int rating){
    this.nombre=nombre;
    this.rating=rating;
    }
    public String getNombre()
    {
        return this.nombre;
    }
    public void setNombre(String nombre)
    {
        this.nombre=nombre;
    }
    public int getRating()
    {
        return this.rating;
    }
    public void setRating(int rating)
    {
        this.rating=rating;
    }
    
}