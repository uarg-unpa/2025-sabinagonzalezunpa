public class Main {
        
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    PilaChar pila = new PilaChar();
    ColaChar cola = new ColaChar();

    System.out.println("Ingrese la cadena de caracteres:");
    String cadena =scanner.mextLine();

    for (int i = 0; i < cadena.length(); i++) {
    char caracter = cadena.charAt(i);
        pila.meter(caracter);
        cola.encolar(caracter);
    }

    boolean esPalindromo = true;

    if(!pila.estaVacia() && !cola.estaVacia()){
        char dePila = pila.sacar();
        char deCola = cola.desencolar();

    if (dePila != deCola) {
        esPalindromo = false;
    }
    }
    if (esPalindromo == true) {
         System.out.println("La cadena es un palíndromo.");
    } else {
        System.out.println("La cadena no es un palíndromo.");
    }
    
    scanner.close();
}
}