package tp1.tp2;

public class Hora {
    
    private int hora;
    private int minutos;
    private int segundos;

    public Hora(int hora, int minutos, int segundos)
    {
        if(hora > 0 && hora <12) {
            this.hora=hora;
        }else{
            this.hora=0;
        }
        if (minutos > 0 && minutos < 59){
            this.minutos=minutos;
        }else{
            this.minutos=0;
        }
        if( segundos> 0 && segundos < 59){
            this.segundos=segundos;
        }else{
            this.segundos=0;
        }    
     }

    public int getHora()
    {
        return this.hora;
    }
    public void setHora(int hora)
    {
        this.hora=hora;
    }
    public int getMinutos()
    {
        return this.minutos;
    }
    public void setMinutos(int minutos)
    {
        this.minutos=minutos;
    }
    public int getSegundos()
    {
        return this.segundos;
    }
    public void setSegundos(int segundos)
    {
        this.segundos=segundos; 
    }

    public void Cambiarhora(int nuevahora)
    {
        if (nuevahora >= 0 && nuevahora < 24){
        this.hora=nuevahora;
        }
    }
    public void Cambiarminutos(int nuevosminutos)
    {
        if (nuevosminutos >= 0 && nuevosminutos < 60){
        this.minutos=nuevosminutos; 
        }
    }
    public void Cambiarsegundos(int nuevossegundos)
    {
        if (nuevossegundos >= 0 && nuevossegundos < 60){
            this.segundos=nuevossegundos;
        }
    }
    public int HoraenMinutos (){
        return (hora * 60) + minutos + (segundos / 60);
    }
}