public class Colas3 {

    private final int MAX = 5;
    private int frente;
    private int fin; 
    private int [] elementos; 

    public Colas3 (){
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

    public int ElminarElementosRepetidos(){
        Colas3 aux= new Cola3();
        Cola3 aux2 = new Colas3();
        int eliminados = 0;

        while(!this.estaVacia()){
            int elem = this.desencolar();

        boolean encontrado = false;

        while (!aux.estaVacia()){
            int x = aux.desencolar();
            if(elem == x){
                encontrado = true;
                aux2.encolar(x);
            }
        }
        while(!aux2.estaVacia()){
            aux.encolar(aux2.desencolar());
        }
        if(!encontrado){
            aux.encolar(elem);
        }else{
            eliminados ++;
        }
        }
        while(!aux.estaVacia()){
            this.encolar(aux.desencolar());
        }
        return eliminados;
    }
}
