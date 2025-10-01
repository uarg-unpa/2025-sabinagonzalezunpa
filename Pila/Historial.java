public class Historial {
    private Url[] paginas;
    private int cima;
    private final int MAX = 5;

    public Historial() {
        paginas = new Url[MAX];
        cima = -1;
    }

    public boolean estaVacia() { 
        if (cima == -1)
            return true;
        else
            return false;
     }
    public boolean estaLlena() { return cima == MAX - 1; }
    public void meter(Url pagina) {
        cima++;
        paginas[cima] = pagina;
    }
}
