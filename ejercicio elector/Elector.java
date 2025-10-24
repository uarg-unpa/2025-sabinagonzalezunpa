public class Elector {

    private String nombre;
    private String apellido;
    private int matricula;
    private int clase;
    private Domicilio domicilio;

    public Elector(String nombre, String apellido, int matricula, int clase, Domicilio domicilio){
        this.nombre=nombre;
        this.apellido=apellido;
        this.matricula=matricula;
        this.clase=clase;
        this.domicilio=domicilio;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre (String nombre){
        this.nombre = nombre;
    }
    public String getApellido(){
        return this.apellido;
    }
    public void setApellido(String apellido){
        this.apellido=apellido;
    }
    public int getMatricula(){
        return this.matricula;
    }
    public void setMatricula(int matricula){
        this.matricula=matricula;
    }
    public int getClase(){
        return this.clase;
    }
    public void setClase (int clase){
        this.clase=clase;
    }
    public Domicilio getDomicilio(){
        return this.domicilio;
    }
    public void setDomicilio(Domicilio domicilio){
        this.domicilio=domicilio;
    }
    public String toString(){
        return "[ " + this.nombre + "] [ " + this.apellido + "] [ " + this.matricula + "] [ " + this.clase + "] [ " + this.domicilio + "]";
    }
}