package Pilas;

 public class PilaEnteros {
    private int[] elementos; // Array para almacenar los elementos
    private int cima;       
    private final int MAX = 10; // Capacidad máxima de la pila

    // Constructor: inicializa el array y la cima
    public PilaEnteros() {
        elementos = new int[MAX]; // Crear el array
        cima = -1;
        // Completar: inicializar cima
    }

    // Verifica si la pila está vacía
    public boolean estaVacia() {
        if(cima == -1){
        return true;
        // Completar: devolver true si cima indica que la pila está vacía
        }else{
            return false;
    }
}

    // Verifica si la pila está llena
    public boolean estaLlena() {
        if(cima == MAX -1){
        return true;
        // Completar: devolver true si cima está en el límite del array
        }else {
            return false;
    }

    // Agrega un elemento en la cima (push)
    public void meter(int elem) {
        if( cima < MAX - 1){
            cima = cima +1;
            elementos[cima]=elem;
        }
              // Completar: incrementar cima y asignar el elemento
        
    }

    // Saca y devuelve el elemento de la cima (pop)
    public int sacar() {
        if (cima >= 0) {
            int elem= elementos[cima];
            cima=cima -1;
            return elem;    
    }
    return -1;
                  // Completar: guardar el elemento de la cima, decrementar cima y devolverlo
    }  
}
