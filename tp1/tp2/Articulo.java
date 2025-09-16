
public class Articulo{

    private String descripcion;
    private double precio;
    private int codigo;
    private int stock;

    public Articulo(String descripcion, double precio, int codigo, int stock){
        this.descripcion=descripcion;
        this.precio=precio;
        this.codigo=codigo;
        this.stock=stock;
    }

    public String getDescripcion()
    {
        return this.descripcion;
    }
    public void setDescripcion(String descripcion)
    {
        this.descripcion=descripcion;
    }
    public double getPrecio()
    {
        return this.precio;
    }
    public void setPrecio(double precio)
    {
        this.precio=precio;
    }
    public int getCodigo()
    {
        return this.codigo;
    }
    public void setCodigo(int codigo)
    {
        this.codigo=codigo;
    }
    public int getStock()
    {
        return this.stock;
    }
    public void setStock(int stock)
    {
        this.stock=stock;
    }
    public void DecrementarStock(int cantidad){
        if(cantidad >0){
        if(this.stock >= cantidad){
            this.stock= this.stock - cantidad;
        }
    }
}
    public void AumentarStock(int cantidad){
        if(cantidad >0){
            this.stock=this.stock + cantidad;
        }
    }
}