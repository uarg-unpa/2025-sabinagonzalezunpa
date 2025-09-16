
public class Vehiculo{  
    
    private String tipo;
    private int velocidadMaxima;
    private double precio;

    public Vehiculo(String tipo, int velocidadMaxima, double precio){
        this.tipo=tipo;
        this.velocidadMaxima=velocidadMaxima;
        this.precio=precio;
    }

    public String getTipo()
    {
        return this.tipo;
    }
    public void setTipo(String tipo)
    {
        this.tipo=tipo;
    }
    public int getVelocidadMaxima()
    {
        return this.velocidadMaxima;
    }
    public void setVelocidadMaxima(int velocidadMaxima)
    {
        this.velocidadMaxima=velocidadMaxima;
    }
    public double getPrecio()
    {
        return this.precio;
    }
    public void setPrecio(double precio)
    {
        this.precio=precio;
    }

    public double aplicarDescuento(double porcentaje ){
        if(this.precio > 0)
        this.precio=this.precio - porcentaje;
        return this.precio;
    }
    public int aumentarVelocidadMaxima(int incremento ){
        this.velocidadMaxima= this.velocidadMaxima + incremento;
        return this.velocidadMaxima;
    }
     public boolean mayorVelocidad( Vehiculo V){ 
        if(this.velocidadMaxima > V.getVelocidadMaxima()){
            return true;
        }else{
            return false;
        }
     }
}