package org.iesalandalus.programacion.tp02;

import org.iesalandalus.programacion.utilidades.Entrada;

public class Ejercicio3 {
    public static void main(String[] args) {
        int numeroUsuario;
        char caracterUsuario;
        do {
            System.out.print("Introduce la altura del rectángulo: ");
            numeroUsuario = Entrada.entero();
        } while (numeroUsuario < 1);
        System.out.print("Introduce el caracter de relleno: ");
        caracterUsuario = Entrada.caracter();
        for (int i = 0; i < (numeroUsuario); i++) {
            for (int j = 0; j < (numeroUsuario * 2); j++) {
                if ((i == 0) || (i == (numeroUsuario - 1))) {
                    System.out.print(caracterUsuario);
                } else {
                    if (j == 0 || j == ((numeroUsuario * 2) - 1)) {
                        System.out.print(caracterUsuario);
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println("");
        }
    }
}
