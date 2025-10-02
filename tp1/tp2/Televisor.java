package tp1.tp2;

public class Televisor {

    private boolean encendido;
    private int canal;
    private int canalAnterior;
    private int volumen;

    public Televisor (boolean encendido, int canal, int canalAnterior, int volumen)
    {
        this.encendido=false;
        this.canal=1;
        this.canalAnterior=1;
        this.volumen=10;
    }
    public boolean getEncendido()
    {
        return this.encendido;
    }
    public void setEncendido(boolean encendido)
    {
        this.encendido=encendido;
    }
    public int getcanal()
    { 
        return this.canal;
    }
    public void setCanal(int canal)
    {
        if(canal > 0){
            this.canalAnterior=canal;
            this.canal=canal;
        }
    }
    public int getCanalAnterior()
    {
        return this.canalAnterior;
    }
    public void setCanalAnterior(int canalAnterior)
    {
        this.canalAnterior=canalAnterior;
    }
    public int getVolumen()
    {
        return this.volumen;
    }
    public void setVolumen(int volumen)
    {
        if( volumen >= 0 && volumen <= 100){
        this.volumen=volumen;
        }
    }
    public void encender(){
        this.encendido=true;
    }
    public void apagar(){
        this.encendido=false;
    }
    public void subirCanal(){
        this.canalAnterior=canal++;
    }
    public void bajarCanal(){
        if (canal > 1){
            this.canalAnterior=canal--;
        }    
    }
    public void subirVolumen(){
        if( volumen < 100){
            this.volumen ++;
        }
    }
    public void bajarVolumen(){
        if (volumen > 0){
            this.volumen --;
    }
    public void volverCanalAnterior(){
        int temp=canal;
        this.canal=this.canalAnterior;
        this.canalAnterior=temp;
    } 
}