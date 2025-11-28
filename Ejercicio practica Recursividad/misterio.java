public class misterio {

    public static int misterioo(int a, int b){
        if(a == 0){
            return b;
        }else{
            return misterioo(a - 1, b + 1);
        }
    }
    
