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
}
public