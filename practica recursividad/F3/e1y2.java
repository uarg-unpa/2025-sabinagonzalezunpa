public class e1y2 {

    //Dado un array de elementos enteros, diseñar tres algoritmos recursivos que realicen lo siguiente:
    //a) El mayor elemento del array.
    public static int mayor(int[]array, int i){
        if(i == array.length - 1){
            return array[i];
        }else{
            int mayor = mayor(array, i + 1);
            if(array[i] > mayor){
                return array[i];
            }else{
                return mayor;
            }
        }
    }
    
    //b)El producto de los elementos del array
    public static int producto(int[]array, int i){
        if(i == array.length){
            return 1;
        }else{
            return array[i] * producto(array, i + 1);
        }
    }

    //c) La cantidad de números negativos.
    public static int negativos(int[]array, int i){
        if(i == array.length){       //llega al final del array
            return 0;
        }else{
            if(array[i] < 0){
                return 1 + negativos(array, i + 1);
            }else{
                return negativos(array, i + 1);
            }
        }
    }
}
