package tp1.tp2;

public class Alumno {
    
    String nombre;
    String apellido;
    String carrera;
    int edad;
    int legajo;
    int dni; 

    public Alumno(String nombre, String apellido, String carrera, int edad, int legajo, int dni)
    {
        this.nombre=nombre;
        this.apellido=apellido;
        this.carrera=carrera;
        this.edad=edad;
        this.legajo=legajo;
        this.dni=dni;
    }
    public String getNombre()
    {
        return this.nombre;
    }
    public void setNombre(String nombre)
    {
        this.nombre=nombre;
    }
    public String getApellido()
    {
        return this.apellido;
    }
    public void setApellido(String apellido)
    {
        this.apellido=apellido;
    }
    public String getCarrera()
    {
        return this.carrera;
    }
    public void setCarrera(String carrera)
    { 
        this.carrera=carrera;
    }
    public int getEdad()
    {
        return this.edad;
    }
    public void setEdad(int edad)
    {
        this.edad=edad;
    }
    public int getLegajo()
    {
        return this.legajo;
    }
    public void setLegajo(int legajo)
    { 
        this.legajo=legajo;
    }
    public int getDni()
    {
        return this.dni;
    }
    public void setDni(int dni)
    {
        this.dni=dni;
    }
}
