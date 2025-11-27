public class F1 {
    
    //e1. Escribe un método recursivo que calcule el máximo elementos de un vector de enteros.
     public static int maximo(int [] vec, int i){
        if(i == vec.length - 1){
            return vec[i];
        }else{
            int max = maximo(vec, i + 1);
            if(vec[i] > max){
                return vec[i];
            }else{
                return max;
            }
        }
    }
     //e2. Escribir un método recursivo que calcule la suma de los primeros n números múltiplos de 3. Por ejemplo, si n = 15, el resultado debe ser 3 + 6 +9 + 12 + 15 = 45.
     public static int suma(int n){
        if(n == 0){
            return 0;
        }else{
            return (3 * n) + suma ( n - 1);
        }
     }

     public static int sumarMultiplosDe3(int n){
        if(n == 0){                    // caso base
            return 0;
        } else {
            if(n % 3 == 0){            // si n es múltiplo de 3
                return n + sumarMultiplosDe3(n - 1);
            } else {                   // si no, no lo sumo
                return sumarMultiplosDe3(n - 1);
            }
        }
    }
}
