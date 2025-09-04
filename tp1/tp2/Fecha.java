package tp1.tp2;

public class Fecha {
    
    private int dia;
    private int mes;
    private int año;

public Fecha(int dia, int mes, int año)
{
    if(esValida(dia, mes, año)){
        this.dia=dia;
        this.mes=mes;
        this.año=año;
    }else{
        this.dia=1;
        this.mes=1;
        this.año=2013;
    }
}


}
