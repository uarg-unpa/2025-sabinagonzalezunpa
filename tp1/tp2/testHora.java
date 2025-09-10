package tp1.tp2;

public class testHora {
    public static void main(String[] args){
        Hora hora1 =new Hora (12, 46, 17);
        Hora hora2 =new Hora (22, 35,55);    
}
System.out.println(" Hora 1: " + hora1.mostrarHora());
System.out.println(" Hora 2: " + hora2.HoraenMinutos());

hora1.Cambiarhora();
hora1.Cambiarminutos();
hora1.Cambiarsegundos();

}