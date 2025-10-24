public class Cola {
    public class ColaInt {
    private int [] elementos;
    private int frente;
    private int fin;
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
    public void encolar(int elem){
        elementos[fin] = elem;
        fin++;
    }
    public int desencolar(){
        int aux = elementos[frente]; 
        for (int i = 0 ; i < fin -1 ; i++){
            elementos[i] = elementos [i + 1];
        }
        fin--; 
        return aux;
    }
    
}
}