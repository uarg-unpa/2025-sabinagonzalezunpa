package tp1;

public class Personaje {
    private String nombre;
    private int niveldenergia;
    private int ptsdevida;
    private String arma;

    public Personaje(String nombre, int niveldenergia, int ptsdevida, String arma){
        this.nombre = nombre;
        this.niveldenergia = niveldenergia;
        this.ptsdevida = ptsdevida;
        this.arma = arma;
    }
    
        public Personaje(String nombre, String arma){
            this.nombre=nombre;
            this.arma=arma;
        }
    
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setNiveldenergia(int niveldenergia){
        this.niveldenergia = niveldenergia;
    }
    public int getNiveldenergia(){
        return this.niveldenergia;
    }
    public void setPtsdevida(int ptsdevida){
        this.ptsdevida = ptsdevida;
    }
    public int getPtsdevida(){
        return this.ptsdevida;
    }
    public void setArma(String arma){
        this.arma = arma;
    }
    public String getArma(){
        return this.arma;
    }

    public boolean puedePelear(){
        if(this.niveldenergia > 10){
            return true;
        } else {
            return false;
        }
    }

    public int esAtaque( int dano){
        this.ptsdevida = this.ptsdevida - dano;
        return this.ptsdevida;
    }

    public String toString(){
        return "Personaje:" +nombre+ ", Nivel de Energia:" +niveldenergia+ ", Puntos de Vida:" +ptsdevida+ ", Arma:" +arma;
    }
}
