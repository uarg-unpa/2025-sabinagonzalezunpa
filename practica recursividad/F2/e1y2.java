public class e1y2 {

    //Programar un algoritmo recursivo que permita sumar los elementos de un vector.

    public static int sumar(int []vec, int i){
        if( i == vec.length){
            return 0;
        }else{
            return vec[i] + sumar(vec, i + 1);
        }
    }
    
    //Escribir un método recursivo que calcule la suma de los dígitos de un numero entero positivo. Por ejemplo, si el numero es 1234, el resultado debería ser 1 + 2 + 3+ 4 = 10.
    //Pista: El caso base es cuando el número es 0, la suma es 0. En caso contrario, suma el ultimo digito (n%10) y llama recursivamente con n / 10.

    public static int sumarDigitos(int n){
        if(n < 10){
            return n;
        }else{
            return ( n % 10) + sumarDigitos( n / 10);
        }
    }

}
