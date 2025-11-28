public class Personaje1 {
    private String nombre;
    private int niveldenergia;
    private String ptsdevida;
    private String arma;

    public Personaje1(String nombre, int niveldenergia, String ptsdevida, String arma){
        this.nombre = nombre;
        this.niveldenergia = niveldenergia;
        this.ptsdevida = ptsdevida;
        this.arma = arma;
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
    public void setPtsdevida(String ptsdevida){
        this.ptsdevida = ptsdevida;
    }
    public String getPtsdevida(){
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

    public static int esAtaque(int ptsdevida, int resta){
        resta = 10;
        ptsdevida = ptsdevida - resta;
    }

    public String toString(){
        return "Personaje:" +nombre+ ", Nivel de Energia:" +niveldenergia+ ", Puntos de Vida:" +ptsdevida+ ", Arma: " +arma+ ""; 
    }
}
