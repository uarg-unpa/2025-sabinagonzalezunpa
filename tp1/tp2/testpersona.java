package tp1.tp2;

    public class testPersona()

    Public static void main (String args[])
{
    int numero;
    Persona persona1; 
    Persona persona2; 


    persona1 = new Persona("Franco", "Herrera", "4211111");
    persona2 = new Persona("Felipe", "Costa" , "439999"); 
    persona1.mayorDeEdad();
}
System.out.print(persona1.mayorDeEdad);

boolean esMayor;
esMayor=persona1.mayorDeEdad();
