
public class Persona{

    private String nombre;
    private int edad;
    private int dni;
    private char sexo;
    private double peso;
    private double altura;

    public Persona (){
        this.nombre="";
        this.edad=0;
        this.dni=0;
        this.sexo="";
        this.peso=0;
        this.altura=0;
    }
    public Persona(String nombre){
        this.nombre=nombre;
    }

    public String getNombre()
    {
        return this.nombre;
    }
    public void setNombre(String nombre)
    {
        this.nombre=nombre;
    }
    public int getEdad()
    {
        return this.edad;
    }
    public void setEdad(int edad)
    {
        this.edad=edad;
    }
    public int getDni()
    {
        return this.dni;
    }
    public void setDni(int dni)
    {
        this.dni=dni;
    }
    public char getSexo()
    {
        return this.sexo;
    }
    public void setSexo(char sexo)
    {
        this.sexo=sexo;
    }
    public double getPeso()
    {
        return this.peso;
    }
    public void setPeso(double peso)
    {
        this.peso=peso;
    }
    public double getAltura()
    {
        return this.altura;
    }
    public void setAltura(double altura)
    {
        this.altura=altura;
    }

    public boolean esMayorDeEdad(){
        if(this.edad >= 18){
            return true;
        }else{
            return false;
        }
    }
    public char comprobarSexo(char sexo){
        if( sexo == H || sexo == M){
            return sexo;
        }
    }
    public String toString()
    {
        return "[" + this.nombre + "] ["+ this.edad +"] [" + this.dni +"] [" + this.sexo +"] [" + this.peso +"] [" + this.altura +"]";
    }
}