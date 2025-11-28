public class MainEmpleado {
    public static void main(String[] args) {

        Empleado e1 = new Empleado("Lara", 1010, 2000);
        Empleado e2 = new Empleado("Juan" , 1020, 2500);
        Empleado e3 = new Empleado("Thiago" , 1030, 3000);
        
    
        System.out.println("Empleado 1: " + e1.getNombre() + " Legajo: " + e1.getLegajo() + " Sueldo: " + e1.getSueldo());
        System.out.println("Empleado 2: " + e2.getNombre() + " Legajo: " + e2.getLegajo() + " Sueldo: " + e2.getSueldo());
        System.out.println("Empleado 3: " + e3.getNombre() + " Legajo: " + e3.getLegajo() + " Sueldo: " + e3.getSueldo());


        if(e2.ganaMasQue(e3)){
            System.out.println("El empleado 2 gana mas que el empleado 3");
        }else{
            System.out.println("El empleado 3 gana mas que el empleado 2");
        }
    }
    
}

