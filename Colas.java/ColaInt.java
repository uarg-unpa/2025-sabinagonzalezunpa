public class ColaInt {
    private int [] elementos;
    private int frente;
    private final int MAX = 10;

    public ColaInt (){
        elementos = new int [MAX];
        frente = 0;
        fin = 0;
    }
    public boolean estaVacia(){
        return fin == 0;
    }
    public boolean estaLlena(){
        return fin == MAX; 
    }
}
