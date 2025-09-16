
public class Vehiculo{
    
    private String marca;
    private String modelo;
    private String motor;

    public Vehiculo (String marca, String modelo, String motor){

    this.marca=marca; 
    this.modelo=modelo;
    this.motor=motor;
    }

    public String getMarca()
    {
        return this.marca;
    }
    public void setMarca(String marca)
    {
        this.marca=marca;
    }
    public String getModelo()
    {
        return this.modelo;
    }
    public void setModelo(String modelo)
    {
        this.modelo=modelo;
    }
    public String getMotor()
    {
        return this.motor;
    }
    public void setMotor(String motor)
    {
        this.motor=motor;
    }
    public boolean esPotente(){
        if(this.motor >= 100caballos){
            return true;
        }else{
            return false;
        }
    }
}