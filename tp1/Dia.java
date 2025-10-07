package tp1;
import java.util.Scanner;
public class Dia {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char Dia;

        System.out.println("Ingrese dia");
        Dia = scanner.nextInt();
        switch (Dia)
        { 
            case 'L': {
                System.out.println("Lunes");
                break;
            }
            case 'M': {
                System.out.println("Hoy tengo resolución");
                break;
            }
            case 'I': {
                System.out.println("Hoy tengo resolución");
                break;
            }
            case 'J': {
                System.out.println("Hoy tengo resolución");
                break;
            }
            case 'V': {
                System.out.println("Viernes");
                break;
            }
            case 'S': {
                System.out.println("Sabado");
                break;
            }
            case 'D': {
                System.out.println("Domingo");
                break;
            }
        }
        System.out.println("Letra ingresada no valida");
    }
}