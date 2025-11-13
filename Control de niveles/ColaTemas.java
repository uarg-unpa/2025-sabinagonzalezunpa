package Control de niveles;

public class ColaTemas {
    private TemaMusical[]elementos;
    private int frente;
    private int fin;
    private final int MAX = 10;

    public ColaTemas(){
        elementos = new TemaMusical[MAX];
        frente = 0;
        fin = 0;
    }

    public boolean estaVacia(){
        return frente == fin;
    }
    public boolean estaLlena(){
        return (fin + 1) % MAX == frente;
    }    
    public void encolar(TemaMusical tema){
        elementos [fin ] = tema;
        fin = (fin +1 ) % MAX;
    }
    public TemaMusical desencolar(){
        TemaMusical t = elementos [frente];
        frente = (frente + 1 ) % MAX;
        return t;
    }
}
