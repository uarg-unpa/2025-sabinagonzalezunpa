package FG;

public class e1y2 {

    //e1. Escribe un método recursivo que calcule a ^ b(a elevado a la potencia b). Por ejemplo, 2 ^3 debería devolver 8.
    public static int potencia(int a, int b){
        if(b == 0){
            return 1;
        }else{
            return a * potencia(a, b - 1);
        }
    }
    
    //e2. Escribe un método recursivo que calcule la suma de los primeros n números pares naturales. Por ejemplo, si n = 8, el resultado debe ser 2 + 4 + 6 + 8 =20.
    public static int suma(int n){
        if(n == 0){
            return 0;
        }else{
            return (2 * n) + suma( n - 1);
        }
    }

    //Dado un número entero, diseñar un algoritmo recursivo que calcule la suma de los dígitos pares del número.
    public static int pares(int n){
        if(n == 0){
            return 0;
        } else {
            int num = n % 10;      // último dígito del número
            if(num % 2 == 0){      // si es par
                return num + pares(n / 10);  // lo sumás
            } else {
                return pares(n / 10);        // si no, lo ignorás
        }
    }
}

}
