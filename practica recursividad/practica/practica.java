package practica;

public class practica {
    
    //Cantidad de dígitos. Contar cuántos dígitos tiene un número entero positivo. Ej: 5432 → 4.

    public static int cantidadDigitos(int n){
        if(n < 10){
            return 1;
        }else{
            return 1 + cantidadDigitos(n / 10);
        }
    }

    //Imprimir solo los dígitos pares de un número. Sin usar System.out.println adentro del método (que devuelva un String).

    public static String digitosPares(int n){
        if(n == 0){
            return "";
        }
        int digito = n % 10;
        if(digito %2 == 0){
            return digitosPares(n / 10) + digito;    //resto más digito actual
        }else{
        return digitosPares(n / 10);     //no lo agrego
        }
    }

    // Contar cuántas vocales tiene un String. Usando recursividad y sin usar substring si querés (solo charAt y un índice).
    public static int contarVocales(String cadena, int i){
        if(i == cadena.length()){
            return 0;
        }else{
            if(cadena.charAt(i) == 'a' || cadena.charAt(i) == 'e' || cadena.charAt(i) == 'i' || cadena.charAt(i) == 'o' || cadena.charAt(i) == 'u' || cadena.charAt(i) == 'A' || cadena.charAt(i) == 'E' || cadena.charAt(i) == 'I' || cadena.charAt(i) == 'O' || cadena.charAt(i) == 'U' ){
                return 1 + contarVocales(cadena, i + 1);
            }else{
                return contarVocales(cadena, i + 1);
            }
        }
    }

    //Buscar un número en un arreglo. Devuelve true si está, false si no. Pista: caso base cuando i == arr.length.
    public static boolean buscarNumero(int[]arr, int i, int x){
        if( i == arr.length){
            return false;
        }else{
            if(arr[i] == x){
                return true;
            }else{
                return buscarNumero(arr, i + 1, x);
            }
        }
    }

    //Encontrar el valor mínimo de un arreglo.
    public static int minimo(int[]arr, int i){
        if(i == arr.length - 1){
            return arr[i];
        }else{
            int min = minimo(arr, i + 1);
            if(arr[i] < min){
                return arr[i];
            }else{
                return min; 
            }
        }
    }

    //Contar cuántas veces aparece un número en un arreglo. Ej: arr = {1,2,3,2,2,5} y x=2 → 3.
    public static int contar(int[]arr, int i, int x){
        if(i == arr.length){
            return 0;
        }else{
            if(arr[i] == x){
                return 1 + contar(arr, i + 1, x);
            }else{
                return contar(arr, i + 1, x);
            }
        }
    }

    // Sumar todos los elementos del arreglo. Devuelve un número.
    public static int sumar(int[]arr, int i){
        if(i == arr.length){
            return 0;
        }else{
            return arr[i] + sumar(arr, i + 1);
        }
    }

    // Invertir un string. 
    public static String invertir(String s){
        if(s.length() <= 1){
            return s;
        }else{
            return invertir(s.substring(1)) + s.charAt(0);
        }
    } 
    public static void inversa(String s, int i){
        if(i < 0){      
            return;
        }else{
        System.out.print(s.charAt(i));  
         
        inversa(s, i - 1);  
        }
    }

    //Contar cuántas veces aparece un carácter en un string. Ej: “banana”, ‘a’ → 3.
    public static int contarCaracter(String s, char x){
        if(s.length() == 0){
            return 0;
        }else{
            if(s.charAt(0) == x){
                return 1 + contarCaracter(s.substring(1), x);
            }else{
                return contarCaracter(s.substring(1), x);
            }
        }
    }

    // Ver si un string es palíndromo.
    public static boolean esPalindromo(String s){
        if(s.length() <= 1){        
            return true;
        } else {
            if(s.charAt(0) == s.charAt(s.length() - 1)){   
                return esPalindromo(s.substring(1, s.length() - 1)); 
            } else {
                return false;
            }
        }
    }
    //sin substring, con índice inicial y final
    public static boolean esPalindromo(String s, int i, int j){
        if(i >= j){      // ya se cruzaron → palíndromo
            return true;
        }

        if(s.charAt(i) != s.charAt(j)){
            return false;
        }

        return esPalindromo(s, i + 1, j - 1);
    }

    //Sumar los dígitos de un número. Ej: 543 → 5+4+3 = 12.
    public static int sumar(int n){
        if(n < 10){
            return n;
        }else{
            return (n % 10) + sumar(n / 10);
        }
    }

    // Producto de 2 números por sumas sucesivas. Usando recursividad y sin multiplicación.
    public static int producto(int a, int b){
        if(b == 0){                  // caso base
            return 0;
        } else {
            return a + producto(a, b - 1);   // suma sucesiva
        }
    }

    // Elevar un número a una potencia. Pero sin usar multiplicación directa; solo llamados recursivos.
    public static int potencia(int a, int b){
        if(b == 0){                     // caso base: a^0 = 1
            return 1;
        } else {
            return producto(a, potencia(a, b - 1));
        }
    }

    // Dado un arreglo de enteros, devolver otro arreglo invertido. Usando solo recursión, sin for.
    public static int[] invertir(int[] arr){
        int[] invertido = new int[arr.length];
        invertirRec(arr, invertido, 0);
        return invertido;
}

    private static void invertirRec(int[] arr, int[] invertido, int i){
        if(i == arr.length){     // caso base
            return;
        } else {
            invertido[arr.length - 1 - i] = arr[i];    // coloco el elemento actual en posición invertida
            invertirRec(arr, invertido, i + 1);        // sigo con el siguiente
        }
    }

    // Sumar solo los elementos pares del arreglo
    public static int sumarPares(int[] arr, int i){
        if(i == arr.length){          // caso base: llegue al final
            return 0;
        } else {
            if(arr[i] % 2 == 0){      // si es par, lo sumo
                return arr[i] + sumarPares(arr, i + 1);
            } else {                  // si no es par, no sumo
                return sumarPares(arr, i + 1);
            }
        }
    }

    // Contar cuántos negativos tiene el arreglo
    public static int contarNegativos(int[] arr, int i){
        if(i == arr.length){                                     // caso base: llegué al final
            return 0;
        } else {
            if(arr[i] < 0){                                     // si es negativo, cuento 1
                return 1 + contarNegativos(arr, i + 1);
            } else {                                           // si no, no cuento
            return contarNegativos(arr, i + 1);
            }
        }
    }

    // Devolver el índice de la primera ocurrencia de un número. Si no está, devolver –1.
    public static int primeraOcurrencia(int[] arr, int i, int x){
        if(i == arr.length){       // caso base: llegué al final
            return -1;             // no lo encontré
        }

        if(arr[i] == x){           // si lo encontré en esta posición
            return i;
        }

        return primeraOcurrencia(arr, i + 1, x);   // sigo buscando
    }

    // Suma alternada. Ej: arr = {1,2,3,4,5} → 1 - 2 + 3 - 4 + 5
    public static int sumaAlternada(int[] arr, int i){
        if(i == arr.length){               
            return 0;
        } else {
            if(i % 2 == 0){                // posición par, se suma
                return arr[i] + sumaAlternada(arr, i + 1);
            } else {                       // posición impar,  se resta
                return (-arr[i]) + sumaAlternada(arr, i + 1);
            }
        }
    }

}
