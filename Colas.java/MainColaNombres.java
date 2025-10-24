import java.util.Scanner;

public class MainColaNombres {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        ColaNombres cola = new ColaNombres();
       
        System.out.println("Ingrese un nombre para encolar:");
        String nombre = scanner.nextLine();
        if (!cola.estaLlena()) {
            cola.encolar(nombre);
            System.out.println("Nombre encolado: " + nombre);
        } else {
            System.out.println("La cola está llena, no se puede encolar el nombre.");
        }

        if (!cola.estaVacia()) {
            String nombreDesencolado = cola.desencolar();
            System.out.println("Nombre más antiguo: " + nombreDesencolado);
        } else {
             System.out.println("No hay nombres para desencolar.");
        }

        String frente = cola.peek();
        if (frente != null) {
            System.out.println("Nombre en el frente de la cola: " + frente);
        } else {
            System.out.println("No hay nombre en el frente.");
        }

        if (cola.estaVacia()) {
            System.out.println("La cola está vacía.");
        } else {
             System.out.println("La cola está llena.");
        }

        System.out.println("Encolando 8 nombres");
        for (int i = 1; i <= 8; i++) {
            cola.encolar("Nombre" + i);
        }

        System.out.println("Desencolando 3 nombres");
        for (int i = 1; i <= 3; i++) {
            String desencolado = cola.desencolar();
            System.out.println("Desencolado: " + desencolado);
        }

        scanner.close();
    }
}