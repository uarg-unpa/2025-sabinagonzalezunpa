package Recursividad.Punto 1;

public class puzzle {
    int puzzle(int base, int limite)

        if(base > limite)
            return -1;
        else
        if(base == limite)
            return 1;
        else
            return (base * puzzle(base + 1, limite));
}

