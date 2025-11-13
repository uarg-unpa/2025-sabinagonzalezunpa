public class Persona1 {
    
    private String apellido;
    private int edad;
    private int dni;
    private char sexo;
    private double peso;
    private double altura;

    public Persona1(String apellido, int edad, int dni, char sexo, double peso, double altura){
        this.apellido=apellido;
        this.edad=edad;
        this.dni=dni;
        this.sexo=sexo;
        this.peso=peso;
        this.altura=altura;
    }
    public String getApellido(){
        return this.apellido;
    }
    public void setApellido(String apellido){
        this.apellido=apellido;
    }
    public int getEdad(){
        return this.edad;
    }
    public void setEdad(int edad){
        this.edad=edad;
    }
    public int getDni(){
        return this.dni;
    }
    public void setDni(int dni){
        this.dni=dni;
    }
    public char getSexo(){
        return this.sexo;
    }
    public void setSexo(char sexo){
        this.sexo=sexo;
    }
    public double getPeso(){
        return this.peso;
    }
    public void setPeso(double peso){
        this.peso=peso;
    }
    public double getAltura(){
        return this.altura;
    }
    public void setAltura(double altura){
        this.altura=altura;
    }
    
    public int calcularIMC(){
        double IMC;
        IMC = this.peso / (this.altura * this.altura);
        if(IMC < 18){
            return -1;
        }else{
            if(IMC >= 18 && IMC <= 25){
                return 0;
            }else{
                return 1;
            }
        }
    }
    public boolean esMayorDeEdad(){
        if(this.edad >= 18){
            return true;
        }else{
            return false;
        }
    }
    public boolean esMayorQue(Persona1 p){
        if(this.edad > p.getEdad()){
            return true;
        }else{
            return false;
        }
    }
    public String toString(){
        return "Apellido: " + apellido + " Edad: " + edad + " DNI: " + dni + " Sexo: " + sexo + " Peso: " + peso + " Altura: " + altura;
    }
}
