public class queHago {
    
    public void queHago(int n) {
    if (n == 0) {                          //caso base, nunca llega a 0, porque n no se modifica.
        System.out.println("Termine");
    } else {
        System.out.println(n);             //caso general 
        queHago(n);  //En la llamada recursiva no se reduce el problema, por lo que n no cambia, y se genera una recursión infinita
    }
}
}
