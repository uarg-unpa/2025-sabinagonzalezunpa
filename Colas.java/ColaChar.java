public class ColaChar {
    private char [] elementos;
    private int frente;
    private int fin;
    private final int MAX = 10;

    public ColaChar() {
        elementos = new char[MAX];
        frente = 0;
        fin = 0;
    }

    public boolean estaVacia() {
        return fin == 0;
    }

    public boolean estaLlena() {
        return fin == MAX; 
    }

    public void encolar(char elem) {
        elementos[fin] = elem;
        fin++; 
    }

    public char desencolar() {
        if(!estaVacia()){
            char frente = elementos[0];
            for (int i = 0; i < fin - 1; i++) {
                elementos[i] = elementos[i + 1];
        }
        fin--; 
        return frente;
    }

    public char peek()  {
        if (!estaVacia()) {
            return elementos[0];
        }
        return 0;
    }
}
}