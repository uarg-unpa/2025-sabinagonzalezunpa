public class Vehiculo1 {

    private String marca;
    private String modelo;
    private Motor motor;

    public Vehiculo1(String marca, String modelo, Motor motor){
        this.marca=marca;
        this.modelo=modelo;
        this.motor=motor;;
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
        this.modelo=modelo;;
    }
    public Motor getMotor()
    {
        return this.motor;
    }
    public void setMotor(Motor marca)
    {
        this.motor=motor;
    }
    public boolean esPotente(){
        if(motor.getCilindrada() > 2000){
            return true;
        }else{
            return false;
        }
    }
    public void actualizarTipoMotor(String nuevoTipo){
        motor.setTipo(nuevoTipo);
    }
    }
    
    public String toString(){
        return "[ " + this.marca + "] [ " + this.modelo + "] [ " + this.motor + "]";

    
}
}
