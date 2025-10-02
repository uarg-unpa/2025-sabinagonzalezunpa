import java.util.Scanner;

public class MainCola {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ColaInt cola = new ColaInt();
        int opcion;
        do {
            System.out.println("\n=== MENÚ COLA DE TAREAS (Frente Fijo) ===");
            System.out.println("1. Encolar tarea (agregar número)");
            System.out.println("2. Desencolar tarea (sacar número)");
            System.out.println("3. Ver tarea en frente (peek)");
            System.out.println("4. Mostrar estado (vacía, llena o cantidad)");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el número de la tarea: ");
                    int tarea = sc.nextInt();
                    if (){
                        System.out.println("Error: La cola está llena (máximo 10 tareas). No se puede encolar " + tarea);
                    } else {
                        cola.;
                        System.out.println("Tarea " + tarea + " encolada con éxito.");
                    }
                    break;
                case 2:
                    if () {
                        System.out.println("Error: La cola está vacía. No se puede desencolar.");
                    } else {
                        int desencolada = cola
                        System.out.println("Tarea desencolada: " + desencolada);
                    }
                    break;
                case 3:
                    if () {
                        System.out.println("Error: La cola está vacía. No hay tarea en el frente.");
                    } else {
                        int frente = cola.;
                        System.out.println("Tarea en frente: " + frente);
                    }
                    break;
                case 4:
                    if () {
                        System.out.println("Estado: La cola está vacía.");
                    } else if () {
                        System.out.println("Estado: La cola está llena.");
                    } else {
                        System.out.println("Estado: La cola tiene " + 1 + " tarea(s).");//no implementado aun no hacerlo
                    }
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        } while (opcion != 0);
        sc.close();
    }
}