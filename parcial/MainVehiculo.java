public class MainVehiculo {
    public static void main(String[]args){

        Vehiculo v1=new Vehiculo("Auto", 120, 12500);
        Vehiculo v2=new Vehiculo("Moto", 80, 8500);

        System.out.println("Aplicar descuento al vehiculo 1" + v1.aplicarDescuento(10));
        System.out.println("El vehiculo 2 aumento su velocidad " + v2.aumentarVelocidadMaxima(5));

        if(v1 > v2){
            System.out.println("El vehiculo con mayor velocidad es" + v1.mayorVelocidad(v1));
        }else{
            System.out.println("El vehiculo con mayor velocidad es" + v2.mayorVelocidad(v2));
    }
}
}