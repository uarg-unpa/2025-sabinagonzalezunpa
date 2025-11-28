package F5;

public class e1y2 {
    //Diseñar un algoritmo recursivo que imprima los dígitos pares de un numero decimal. Ej: n 12345 -> 2 4.
    
    public static void pares(int n){
        if(n == 0){
            return;
        }else{
            int num = n % 10;
            if(num % 2 == 0){
                System.out.println(num + "");
            }
            pares(n / 10);
        }
    }

    //Tu código (correcto para sumar dígitos pares)
    public static int digitosPares(int n){
        if(n == 0){
            return 0;
        }
        int num = n % 10;
        if(num % 2 == 0){
            return digitosPares(n / 10) + num;
        }else{
            return digitosPares(n / 10);
        }
    }

    //e2. Dado un array de elementos enteros, diseñar un algoritmo recursivo que calcule y devuelva el menor elemento del array.
    public static int menorElemento(int[]array, int i){
        if(i == array.length - 1){
            return array[i];
        }else{
            int menor = menorElemento(array, i + 1);
            if(array[i] < menor){
                return array[i];
            }else{
                return menor;
            }
        }
    }
}