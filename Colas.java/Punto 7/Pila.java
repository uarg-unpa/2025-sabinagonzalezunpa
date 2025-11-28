public class Pila {
    private int[] elementos; 
    private int cima;       
    private final int MAX = 10; 

    public Pila() {
        elementos = new int[MAX]; 
        cima = -1;
    }

    public boolean estaVacia() {
        if(cima == -1){
        return true;
        }else{
            return false;
    }
}

    public boolean estaLlena() {
        if(cima == MAX -1){
        return true;
        }else {
            return false;
    }

    public void meter(int elem) {
        if( cima < MAX - 1){
            cima = cima +1;
            elementos[cima]=elem;
        }
        
    }

    public int sacar() {
        if (cima >= 0) {
            int elem= elementos[cima];
            cima=cima -1;
            return elem;    
    }
    return -1;
    }  
}
}
