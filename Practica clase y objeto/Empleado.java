public class Empleado {

    private String nombre;
    private int legajo;
    private double sueldo;

    public Empleado(String nombre, int legajo, double sueldo){
        this.nombre=nombre;
        this.legajo=legajo;
        this.sueldo=sueldo;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public int getLegajo(){
        return this.legajo;
    }
    public void setLegajo(int legajo){
        this.legajo=legajo;
    }
    public double getSueldo(){
        return this.sueldo;
    }
    public void setSueldo(double sueldo){
        this.sueldo=sueldo;
    }

    public boolean ganaMasQue(Empleado Otro){
        if(getSueldo() > Otro.getSueldo()){
            return true;
        }else{
            return false; 
        }
    }
    public String toString() {
        return "Nombre: " + nombre + " Legajo: " + legajo + " Sueldo: " + sueldo;
}
}
