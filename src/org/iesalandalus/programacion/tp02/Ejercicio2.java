package org.iesalandalus.programacion.tp02;

import org.iesalandalus.programacion.utilidades.Entrada;

public class Ejercicio2 {
    public static void main(String[] args) {
        int numeroUsuario, cifras, aux, resto, resultado;
        boolean validador = true;
        resultado = 0;
        do {
            validador = true;
            System.out.print("Introduce un número binario positivo: ");
            numeroUsuario = Entrada.entero();
            if (numeroUsuario < 0) {
                validador = false;
            } else {
                aux = numeroUsuario;
                cifras = 0;
                while (aux != 0) {
                    if (aux % 10 > 1) {
                        validador = false;
                        break;
                    }
                    aux = aux / 10;
                    cifras++;
                }
            }
        } while (!validador);
        aux = numeroUsuario;
        cifras = (int) Math.log10(numeroUsuario);
        for (int i = cifras; i >= 0; i--) {
            resto = (int) (aux % (Math.pow(10, i)));
            aux = (int) (aux / (Math.pow(10, i)));
            resultado += aux * Math.pow(2, i);
            aux = resto;
        }
        System.out.println("El número binario " + numeroUsuario + ", expresado en decimal es " + resultado);
    }
}
