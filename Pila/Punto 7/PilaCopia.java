public class PilaCopia {
    private int[] elementos;
    private int cima;
    private final int maxpila = 15;

    public PilaCopia() {
        elementos = new int[maxpila];
        cima = -1;
    }

    public boolean estaVacia() {
        return cima == -1;
    }

    public boolean estaLlena() {
        return cima == maxpila - 1;
    }

    public void meter(int elem) {
        if (!estaLlena()) {
            cima++;
            elementos[cima] = elem;
        }
    }

    public int sacar() {
        int aux = -1;
        if (!estaVacia()) {
            aux = elementos[cima];
            cima--;
        }
        return aux;
    }

    public PilaCopia copiar() {
        PilaCopia auxpilac = new PilaCopia();
        PilaCopia copia = new PilaCopia();
        int x;

        while (!this.estaVacia()) {
            x = this.sacar();
            auxpilac.meter(x);
        }

        while (!auxpilac.estaVacia()) {
            x = auxpilac.sacar();
            this.meter(x);
            copia.meter(x);
        }

        return copia;
    }
}
