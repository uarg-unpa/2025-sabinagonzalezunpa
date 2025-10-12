public class Pc {

    private String marca;
    private String procesador;
    private double precio;
    private int ram;

    public Pc(String marca, String procesador, double precio, int ram){
        this.marca=marca;
        this.procesador=procesador;
        this.precio=precio;
        this.ram=ram; 
    }

    public String getMarca(){
        return this.marca;
    }
    public void setMarca(String marca){
        this.marca=marca;
    }
     public String getProcesador(){
        return this.procesador;
    }
    public void setProcesador(String procesador){
        this.procesador=procesador;
    }
     public double getPrecio(){
        return this.precio;
    }
    public void setPrecio(double precio){
        this.precio=precio;
    }
     public int getRam(){
        return this.ram;
    }
    public void setRam(int ram){
        this.ram=ram;
    }

    public void actualizarRam(int nuevaRam){
        this.ram = nuevaRam;
    }
    public void aplicarDescuento(double porcentaje){
        this.precio = this.precio - (this.precio * (porcentaje/100));
    }
    public boolean mayorRam(Pc p){
        if(this.ram > p.getRam()){
            return true;
        }else{
            return false;
        }
    }
    public String toString(){
        return "[" + this.marca + "] [ " + this.procesador + "] [ " + this.ram + "] [ " + this.precio + "]";
    }
}
