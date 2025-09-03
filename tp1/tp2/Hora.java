package tp1.tp2;

public class Hora {
    
    private int hora;
    private int minutos;
    private int segundos;

    public Hora(int hora, int minutos, int segundos)
    {
        if((esValida)(hora, minutos, segundos)) {
        this.hora=hora;
        this.minutos=minutos;
        this.segundos=segundos;
        }else{
            this.hora=0;
            this.minutos=0;
            this.segundos=0;
        }
    }

    public int getHora()
    {
        return this.hora;
    }
    public int getMinutos()
    {
        return this.minutos;
    }
    public int getSegundos()
    {
        return this.segundos;
    }
    public void setHora(int hora)
    {
        if (hora >= 0 && hora <= 24){
        this.hora=hora;
        }
    }
    public void setMinutos(int minutos)
    {
        if (minutos >= 0 && minutos <= 60){
        this.minutos=minutos; 
        }
    }
    public void setSegundos(int segundos)
    {
        if (segundos >= 0 && segundos <= 60){
            this.segundos=segundos;
        }
    }
    public int HoraenMinutos (){
        return (hora * 60) + minutos + (segundos / 60);
    }
    public String mostrarHora (){
        return (hora , minutos, segundos);
    }
}