package tp1;
import java.util.Scanner;
public class NumMayor {

    public static void main(String[] args) { 
        Scanner entrada = new Scanner(System.in);  
        int nro1, nro2, nro3;

        System.out.print("Ingrese el primer número");
        nro1 = entrada.nextInt();
        System.out.print("Ingrese el segundo número"); 
        nro2 = entrada.nextInt();
        System.out.print("Ingrese el tercer número");
        nro3 = entrada.nextInt();

        if (nro1 > nro2 && nro1 > nro3) 
        {
            System.out.println("El mayor es: " + nro1);
        } 
        else 
            if (nro2 > nro1 && nro2 > nro3)
            {
                System.out.println("El mayor es: " + nro2);
            } 
            else
            {
                System.out.println("El mayor es: " + nro3);
            }
        entrada.close();
    }
}