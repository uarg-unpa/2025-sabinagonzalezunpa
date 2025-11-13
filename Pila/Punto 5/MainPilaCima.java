public class MainPilaCima {
   public static void main(String[] args){

        PilaCima pila = new PilaCima();

        pila.meter('A');
        pila.meter('B');
        pila.meter('C');

        System.out.println("Elemento en la cima: " + pila.elementoCima());

        System.out.println("Elemento sacado: " + pila.sacar());

        System.out.println("Nueva cima: " + pila.elementoCima());

        System.out.println("Elemento sacado: " + pila.sacar());
        System.out.println("Elemento sacado: " + pila.sacar());

        if (pila.estaVacia()) {
            System.out.println("La pila esta vacia");
        }
    }
}
