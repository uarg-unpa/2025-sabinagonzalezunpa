public class Auto {

    private String marca;
    private String modelo;
    private int anio;
    private int velocidadMax;
    
    public Auto(String marca, String modelo, int anio, int velocidadMax){
        this.marca=marca;
        this.modelo=modelo;
        this.anio=anio;
        this.velocidadMax=velocidadMax;
    }
    public String getMarca(){
        return this.marca;
    }
    public void setMarca(String marca){
        this.marca=marca;
    }
    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String modelo){
        this.modelo=modelo;
    }
    public int getAnio(){
        return this.anio;
    }
    public void setAnio(int anio){
        this.anio=anio;
    }
    public int getVelocidadMax(){
        return this.velocidadMax;
    }
    public void setVelocidadMax(int velocidadMax){
        this.velocidadMax=velocidadMax;
    }

    public boolean esMasRapidoQue(Auto otro){
        if(this.velocidadMax > otro.getVelocidadMax()){
            return true;
        }else{
            return false;
        }
    }
    public boolean esAutoClasico(){
        if(this.anio < 2000){
            return true;
        }else{
            return false;
        }
    }
    public String toString(){
        return "Marca: " + marca + " Modelo: " + modelo + " Anio: " + anio + " Velocidad Maxima: " + velocidadMax;
    }
}
