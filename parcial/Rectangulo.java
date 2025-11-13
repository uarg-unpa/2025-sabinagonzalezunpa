public class Rectangulo {

    private double base;
    private double altura;

    public Rectangulo(double base, double altura){
        this.base=base;
        this.altura=altura;
    }
    public double getBase(){
        return this.base;
    }
    public void setBase(double base){
        this.base=base;
    }
    public double getAltura(){
        return this.altura;
    }
    public void setAltura(double altura){
        this.altura=altura;
    }
    
    public double calcularArea(){
        return (base * altura);
    }
    public double calcularPerimetro(){
        return ((2 * base) + (2 * altura));
    }
    public boolean esMayorElArea(Rectangulo R){
        if(this.calcularArea() > R.calcularArea()){
            return true;
        }else{
            return false;
        }
    }
    public String toString(){
        return "[" + this.base + "] [" + this.altura + "]";
    }
}
