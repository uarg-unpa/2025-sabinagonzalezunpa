public class MainPilaCola {

    public static void main(String[] args) {
        Pila pila = new Pila();
        Cola cola = new Cola();

        while(!pila.estaVacia()){
            int elem = pila.sacar();
            if(elem % 2 == 0){
                cola.encolar(elem);
            }
        }
        
    }
    
}
