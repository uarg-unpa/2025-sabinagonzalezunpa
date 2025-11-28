public class FuncionG {

    public static int G(int x, int y) {
        if(x <= y){
            return 1;
        }else{
            return G(x, y+1) + 1;
        }
    }
    //b) Encontrar el valor de G(8, 6)
    //c) Encontrar el valor de G(100, 10).

}
