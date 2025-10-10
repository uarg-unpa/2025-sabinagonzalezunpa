public class Producto {

    private String nombre;
    private double precio;
    private int stock;

    public Producto(String nombre, double precio, int stock){
        this.nombre=nombre;
        this.precio=precio;
        this.stock=stock;
    }

    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public double getPrecio(){
        return this.precio;
    }
    public void setPrecio(double precio){
        this.precio=precio;   
    }
    public int getStock(){
        return this.stock;
    }
    public void setStock(int stock){
        this.stock=stock;
    }

    public boolean hayStock(int cantidad){
        if(this.stock >= cantidad){
            return true;
        }else{
            return false;
        }
    }
    
    public void vender(int cantidad){
        if(this.stock >= cantidad){
            stock = stock - cantidad;
        }
    }

    public void aumentarStock(int cantidad){
        this.stock = this.stock + cantidad;
    }

    public boolean tieneMasStockQue(Producto otro){
        if(this.stock > otro.getStock()){
            return true;
        }else{
            return false;
        }
    }

    public String toString(){
        return "[ " + this.nombre + "] [ " + this.stock + "] [ " + this.precio + "]";
}
}
