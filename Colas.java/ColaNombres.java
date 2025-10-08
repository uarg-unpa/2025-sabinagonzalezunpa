public class ColaNombres {
    
    private String []elementos;
    private int frente;
    private int fin;
    private final int MAX = 10;

    public ColaNombres(){
        elementos = new String [MAX];
        frente = 0;
        fin = 0;
    }
    public boolean estaVacia(){
        return fin == 0; 
    }
    public boolean estaLlena(){
        return fin == MAX;
    }
    public void encolar(String nombre) {
        elementos[fin] = nombre;
        fin = (fin + 1) % MAX;
        fin++; 
    }
    public String desencolar() {
        String nombre = elementos[frente];
        frente = (frente + 1) % MAX;
        fin--; 
        return nombre;
    }
    public String peek() {
        if (!estaVacia()) {
        return elementos[frente];
    }
    return null; 
}
}