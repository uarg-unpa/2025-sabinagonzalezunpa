public class SumaEnteros {

    public int sumaParesRecursividad(int n){
        if(n % 2 != 0){
            n = n - 1;   
        }
        if(n == 2){
            return 2;    
        }else{
            return n + sumaParesRecursividad(n - 2);
        }
    }  
}
