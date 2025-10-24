public class ColaVF {
    
    private int frente;
    private int fin; 
    private int [] elementos;


    public ColasVF(){
        elementos = new int[MAX];
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
    public boolean sonIguales(ColaVF otraCola){
        ColaVF aux1 = new ColaVF();
        ColaVF aux2 = new ColaVF();
        boolean iguales = true;

        while(!this.estaVacia() && !otraCola.estaVacia()){
            int e1 = this.desencolar();
            int e2 = otraCola.desencolar();

            if (e1 != e2){
                iguales = false;
            }
        }
        aux1.encolar(e1);
        aux2.encolar(e2);
    }
    if(!this.estaVacia() || !otraCola.estaVacia()){
        iguales = false;
    }
    while(!aux1.estaVacia()){
        this.encolar(faux1.desencolar());
    }
    while(!aux2.estaVacia()){
        otraCola.encolar(aux2.desencolar());
    }
    return iguales;
}
