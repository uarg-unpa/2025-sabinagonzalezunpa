public class Motor {

    private int cilindrada;
    private String tipo;

    public Motor(int cilindrada, String tipo){
        this.cilindrada=cilindrada;
        this.tipo=tipo;
    }

    public int getCilindrada()
    {
        return this.cilindrada;
    }
    public void setCilindrada(int cilindrada)
    {
        this.cilindrada=cilindrada;
    }
    public String getTipo()
    {
        return this.tipo;
    }
    public void setTipo(String tipo)
    {
        this.tipo=tipo;
    }

    public String toString(){
        return "[ " + this.cilindrada + "] [ " + this.tipo + "]";
    
}
