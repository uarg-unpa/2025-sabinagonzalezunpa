package tp1.tp2;

public class Persona {
    
    String nombre;
    String apellido;
    int edad;
    int dni; 

    public Persona(String nombre, String apellido, int edad, int dni)
    {
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
        this.dni=dni;
    }
//metodos gets y sets
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

//otras operaciones 
public boolean mayorDeEdad()
{
    if(edad >= 18)
        return true;
    else 
        return false;
 }
}