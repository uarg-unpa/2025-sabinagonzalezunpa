public class contarOcurrencias {
    
    public int contarOcu(int [] arreglo, int x, int n){
        if(n < 0){
            return 0;
        }
        if(arreglo[n] == x){
            return 1 + contarOcu(arreglo, x, n - 1);
        }else{
            return contarOcu(arreglo, x, n - 1);
        }
    }
}
