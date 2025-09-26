package tp1.tp2;

public class Fecha {
    
    private int dia;
    private int mes;
    private int año;

public Fecha(int dia, int mes, int año)
{
    if( dia > 1 && dia < 31){
        this.dia=dia;
    }else{
        this.dia=1;
    }
    if ( mes > 1 && mes < 12){
        this.mes=mes;
    }else{
        this.mes=1;
    }
    if ( año > 2000 && año < 2010){
        this.año=año;
    }else{
        this.año=2013;
    }
}
public int getDia()
{
    return this.dia;
}
public void setDia(int dia) 
{
    this.dia=dia;
}
public int getMes()
{
    return this.mes;
}
public void setMes(int mes)
{
    this.mes=mes;
}
public int getAño()
{
    return this.año;
}
public void setAño( int año)
{
    this.año=año; 
}
public void cambiarDia(int nuevodia){
    this.dia=nuevodia; 
}
public void cambiarMes(int nuevomes){
    this.mes=nuevomes;
}
public void cambiarAño(int nuevoaño){
    this.año=nuevoaño;
}
public String nombreMes(){
    String[] nombre= {
        "Enero" ,"Febrero" ,"Marzo" ,"Abril","Mayo" ," Junio" ,"Julio" ,"Agosto" ,"Septiembre" ,"Octubre" ,"Noviembre" , "Diciembre"
        };
        return nombre[this.mes - 1];
}
public String mostrarFecha(){
    return this.dia + "de" +  nombreMes() + "de" + this.año;
}
}