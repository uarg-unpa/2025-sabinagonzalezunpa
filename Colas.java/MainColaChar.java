import java.util.Scanner;

public class MainColaChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ColaChar cola = new ColaChar();

        System.out.println("Encolando 5 comandos:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese un caracter: ");
            char elem = scanner.next().charAt(0);
            cola.encolar(elem);
        }

        System.out.println("Cola actual: " + cola);

        System.out.println("Desencolando 2 comandos...");
        for (int i = 0; i < 2; i++) {
            char frente = cola.desencolar();
            System.out.println("Comando eliminado: " + frente);
        }

        System.out.println("Cola después de desencolar: " + cola);

         while (!cola.estaLlena()) {
            System.out.print("Ingrese un nuevo comando: ");
            char c = scanner.next().charAt(0);
            cola.encolar(c);
        }

        System.out.println("Cola final: " + cola);

        if (cola.estaLlena()) {
            System.out.println("Cola llena");
        } else {
            System.out.println("Cola vacía");
        }

        scanner.close();
    }

}
