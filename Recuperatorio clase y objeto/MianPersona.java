import java.util.Scanner;

import tp1.tp2.Persona;

public class MianPersona {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el apellido de la persona 1:");
        String apellido1 = scanner.nextLine();
        System.out.println("Ingrese la edad de la persona 1:");
        int edad1 = scanner.nextInt();
        System.out.println("Ingrese el DNI de la persona 1:");
        int dni1 = scanner.nextInt();
        System.out.println("Ingrese el sexo de la persona 1:");
        char sexo1 = scanner.nextLine();
        System.out.println("Ingrese el peso de la persona 1:");
        double peso1 = scanner.nextDouble();
        System.out.println("Ingrese la altura de la persona 1:");
        double altura1 = scanner.nextDouble();

        Persona1 p1 = new Persona1 (apellido1, edad1, dni1, sexo1, peso1, altura1);

        System.out.println("Ingrese el apellido de la persona 2:");
        String apellido2 = scanner.nextLine();
        System.out.println("Ingrese la edad de la persona 2:");
        int edad2 = scanner.nextInt();
        System.out.println("Ingrese el DNI de la persona 2:");
        int dni2 = scanner.nextInt();
        System.out.println("Ingrese el sexo de la persona 2:");
        char sexo2 = scanner.nextLine();
        System.out.println("Ingrese el peso de la persona 2:");
        double peso2 = scanner.nextDouble();
        System.out.println("Ingrese la altura de la persona 2:");
        double altura2 = scanner.nextDouble();

        Persona p2 = new Persona1 (apellido2, edad2, dni2, sexo2, peso2, altura2);

        if(p1.calcularIMC() == -1){
            System.out.println("La persona 1 esta por debajo de su peso ideal");
        }else if(p1.calcularIMC() == 0)
            System.out.println("La persona 1 esta en su peso ideal");
         else{
            System.out.println("La persona 1 tiene sobre peso");
        }
        
        if(p2.calcularIMC() == -1){
            System.out.println("La persona 2 esta por debajo de su peso ideal");
        }else if(p2.calcularIMC() == 0)
            System.out.println("La persona 2 esta en su peso ideal");
         else{
            System.out.println("La persona 2 tiene sobre peso");
        }

        int contadorMayores = 0;
        if(p1.esMayorDeEdad()){
            contadorMayores ++;
        }
        if(p2.esMayorDeEdad()){
            contadorMayores ++;
        }
        System.out.println("Los que son mayor de edad son:" + contadorMayores);

        
        if(p1.esMayorQue(p2)){
            System.out.println("La persona 1 es mayor");
        }else if(p2.esMayorQue(p1)){
            System.out.println("La persona 2 es mayor");
        }else{
            System.out.println("Ambas personas tienen la misma edad");
        }
        
    }
    
}
