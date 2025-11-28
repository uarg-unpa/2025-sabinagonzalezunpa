public class e1y2{

    //e1. Dado una cadena de caracteres(String), diseñar un algoritmo recursivo que calcule la cantidad de vocales en la cadena.

    public static int caracteres(String s){
        if(s.length() == 0){
            return 0;
        }else{
            if(s.charAt(0) == 'a' || s.charAt(0) == 'e' || s.charAt(0) == 'i' || s.charAt(0) == 'o' || s.charAt(0) == 'u' || s.charAt(0) == 'A' || s.charAt(0) == 'E' || s.charAt(0) == 'I' || s.charAt(0) == 'O' || s.charAt(0) == 'U' ){
                return 1 + caracteres(s.substring(1));
            }else{
                return caracteres(s.substring(1));
            }
        }
    }

    //e2. Dado un numero entero, diseñar un algoritmo recursivo que calcule el producto de los dígitos del número.

    public static int producto(int n){
        if(n < 10){
            return n;
        }else{
            return (n % 10) * producto (n / 10);
        }
    }
}