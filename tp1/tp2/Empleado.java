public class Empleado {
    
    private int legajo;
    private double sueldoBase;
    private double pagoHoraExtra;
    private int horaExtraMes;
    private boolean casado;
    private int numHijos; 

    public Empleado (int legajo, double sueldoBase, double pagoHoraExtra, int horaExtraMes, boolean casado, int numHijos ){
        this.legajo=legajo;
        this.sueldoBase=sueldoBase;
        this.pagoHoraExtra=pagoHoraExtra;
        this.horaExtraMes=horaExtraMes;
        this.casado=casado;
        this.numHijos=numHijos; 
    }

    public int getLegajo()
    {
        return this.legajo;
    }
    public void setLegajo(int legajo)
    {
        this.legajo=legajo;
    }
    public double getSueldoBase()
    {
        return this.sueldoBase;
    }
    public void setSueldoBase(double sueldoBase)
    {
        this.sueldoBase=sueldoBase;
    }
    public double getPagoHoraExtra()
    {
        return this.pagoHoraExtra;
    }
    public void setPagoHoraExtra( double pagoHoraExtra)
    {
        this.pagoHoraExtra=pagoHoraExtra;
    }
    public int getHoraExtraMes()
    {
        return this.horaExtraMes;
    }
    public void setHoraExtraMes(int horaExtraMes)
    {
        this.horaExtraMes=horaExtraMes;
    }
    public boolean getCasado()
    {
        return this.casado;
    }
    public void setCasado(boolean casado)
    {
        this.casado=casado;
    }
    public int getNumHijos()
    {
        return this.numHijos;
    }
    public void setNumHijos(int numHijos)
    {
        this.numHijos=numHijos;
    }

    public double CalculoComplementoHorasExtra(){
        return horaExtraMes * pagoHoraExtra;
    }
    public double SueldoBruto(){
        return sueldoBase + CalculoComplementoHorasExtra();
    }
    public double CalculoDeRetenciones(){
        double porcentaje=0;
        if(this.casado){
        porcentaje = porcentaje + 10;
    }
    if(this.numHijos > 0){
        porcentaje = porcentaje + (1 * this.numHijos);
    }
    double aumento = this.sueldoBase * porcentaje / 100;
    return this.sueldoBase + aumento;
    }
}
