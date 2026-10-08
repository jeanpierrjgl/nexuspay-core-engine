package com.devjunior.fundamentos;

import java.util.Scanner;

public class ComparadorSubcadenas {
    //Este fragmento implementa el patrón algorítmico de Ventana Deslizante
    // (Sliding Window) para resolver un problema de búsqueda de extremos
    // (mínimo y máximo) bajo un criterio de ordenación lexicográfica.
    //En una sola frase: es la técnica estándar para recortar trozos consecutivos
    //de un texto sin romper el programa ni desbordar la memoria.

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        //declara la palabra y la constante menor a la longitud de la palabra
        String s = "camisa";
        int k = 3;
        // Caso base: se inicializan ambos con el primer bloque real
        //smallest largest
        String smallest = s.substring(0,k);
        String largest = s.substring(0,k);

        // Recorrido estricto de la ventana
        for (int i = 0; i<=s.length() -k; i++){
            String sub = s.substring(i,i+k);
            if (sub.compareTo(smallest) < 0){
                smallest = sub;
            }
            if (sub.compareTo(largest)> 0){
                largest = sub;
            }
        }




        System.out.println("Menor: " + smallest); // ava
        System.out.println("Mayor: " + largest);  // wel
    }
}