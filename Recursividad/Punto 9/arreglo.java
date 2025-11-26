public class arreglo {

    public static boolean estaEnElArreglo(int[]arreglo, int n, int x){
        if(n == arreglo.length){  
            return false;
        }else{
            if(arreglo[n] == x){
                return true;
            }else{
                return estaEnElArreglo(arreglo, n + 1, x);   
            }
        }
    } 
}
