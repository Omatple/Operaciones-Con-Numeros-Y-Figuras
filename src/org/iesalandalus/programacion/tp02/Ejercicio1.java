package org.iesalandalus.programacion.tp02;

import org.iesalandalus.programacion.utilidades.Entrada;

public class Ejercicio1 {
    public static void main(String[] args) {
        int numeroUsuario;
        do {
            System.out.print("Introduce un número positivo de tres o cuatro cifras: ");
            numeroUsuario = Entrada.entero();
        } while (!((numeroUsuario > 99) && (numeroUsuario < 10000)));
        int aux = numeroUsuario;
        int resto = (int) (aux % (Math.pow(10, 1)));
        aux = (int) ((numeroUsuario) / (Math.pow(10, 1)));
        int cifras = (int) Math.log10(numeroUsuario);
        aux += (int) (resto * Math.pow(10, (cifras)));
        System.out.println("El número " + numeroUsuario + " desplazado a la derecha es: " + aux);
    }
}
