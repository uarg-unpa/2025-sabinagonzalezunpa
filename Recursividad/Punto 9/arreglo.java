public class arreglo {

    public boolean estaEnElArreglo(int[]arreglo, int n, int x){
        if(n < 0){
            return false;
        }else{
            if(arreglo[n] == x){
                return true;
            }else{
                return estaEnElArreglo(arreglo, n - 1, x);
            }
        }
    } 
}
