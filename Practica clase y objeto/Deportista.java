public class Deportista {

    private String nombre;
    private int edad;
    private String deporte;
    private int puntos;

    public Deportista(String nombre, int edad, String deporte, int puntos){
        this.nombre=nombre;
        this.edad=edad;
        this.deporte=deporte;
        this.puntos=puntos;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public int getEdad(){
        return this.edad;
    }
    public void setEdad(int edad){
        this.edad=edad;
    }
    public String getDeporte(){
        return this.deporte;
    }
    public void setDeporte(String deporte){
        this.deporte=deporte;
    }
    public int getPuntos(){
        return this.puntos;
    }
    public void setPuntos(int puntos){
        this.puntos=puntos;
    }

    public boolean esMasExperimentado(Deportista otro){
        if (this.edad > otro.getEdad()){
            return true;
        }else{
            return false;
        }
    }
    public boolean esMayorDeEdad(){
        if(this.edad >= 18){
            return true;
        }else{
            return false;
        }
    }
    public String toString(){
        return "Nombre: " + nombre + " Edad: " + edad + " Deporte: " + deporte + " Puntos: " + puntos;
    }
    
}
