public class ejercicio1 {

    //Escribe un metodo recursivo que calcule el producto de los elementos pares de un arreglo
    public static int producto(int[]arr, int i){
        if(i == arr.length){
            return 1;
        }else{
            if(arr[i] % 2 == 0){
                return arr[i] * producto(arr, i + 1);
            }else{
                return producto(arr, i + 1);
            }
        }
    }

    //Escribe un metodo recursivo que muestre una cadena en forma inversa
        
    public static void cadenaInversa(String s, int i){
        if(i < 0){      
            return;
        }else{
        System.out.print(s.charAt(i));   
        cadenaInversa(s, i - 1);  
        }
    }
    

    
        

//2. imprimo en la vuelta
    
    
}
