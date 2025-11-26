public class Suma {

    public static int sumaRecursividad(int n){
        if(n == 1){
            return 1;
        }else{
            return n + sumaRecursividad(n - 1);
        }
    }
    
}
