import java.util.Scanner;
public class MainEmpleado {

    public static void maain(String [] args){
    Empleado e1 = new Empleado( 2111 , 500000, 2200, 1500 , true, 3 );

    System.out.println("Complemento por las horas extras:" + e1.CalculoComplementoHorasExtra());
    System.out.println("Devolucion del sueldo bruto:" + e1.SueldoBruto());
    System.out.println("Devolucion de las retenciones;"+ e1.CalculoDeRetenciones());
    }
    
}
