public class PilaEntero{

    private int[] elementos; 
    private int cima;       
    private final int MAX = 10; 

    public PilaEntero() {
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

    public void meter(int elem){
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
    }
    public int contOcurrencia(int elemen){
        Pila aux = new Pila();
        contador=0;


        while (!estaVacia()){
            int elemento = sacar();
            if( elemento = elemen){
                contador ++;
                aux.meter(elementos);
            }
        }
        // restaurar
        while (!aux.estaVacia()){
            insertar(aux.sacar());
            return contador;
        }
    }
}  
}