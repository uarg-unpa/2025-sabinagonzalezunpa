package tp1;
import java.util.Scanner;
public class OperacionesCasting {

public static void main(String[] args) {
    int valor1 = 5, valor2 = 3, resultadoEntero;
    double decimal1 = 2.5, decimal2 = 2.0, resultadoDecimal;

    resultadoEntero = valor1 / valor2;
    resultadoDecimal = valor1 / decimal1;
    resultadoDecimal = valor1 * decimal2;
    resultadoEntero = valor1 *(int) decimal2;
    resultadoEntero = (int) (decimal1 * decimal2);

    System.out.println("Resultado (valor1 / valor2) = " + resultadoEntero);
    System.out.println("Resultado (valor1 / decimal1) = " + resultadoDecimal);
    System.out.println("Resultado (valor1 * decimal2) = " + resultadoDecimal);
    System.out.println("Resultado (valor1 * (int) decimal2) = " + resultadoEntero);
    System.out.println("Resultado ((int) (decimal1 * decimal2)) = " + resultadoEntero);
    }
}  