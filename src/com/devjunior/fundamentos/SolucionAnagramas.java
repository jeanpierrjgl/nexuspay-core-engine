package com.devjunior.fundamentos;
import java.util.Scanner;

public class SolucionAnagramas{
    public static boolean isAnagram(String a, String b){
        //frecuency array bucket counting
        //1 filtro rapido de longitudes
        if (a.length() != b.length()){
            return false;
        }
        //2 normalizar datos, llevar a minuscular los caracteres
        a = a.toLowerCase();
        b = b.toLowerCase();
        //3 array, no hy valores nulos ni vasura de memoria 0=a 1=b 2=c....
        //cada poscicion es cun contador independiente
        //guarda cuantas veces aparece esa letra en el texto
        int[] frecuencias = new int[26];
        // PASO 4: BUCLE DE BALANCE CONTABLE (+1 y -1 en una sola pasada)
        // Recorremos ambas cadenas al mismo tiempo usando un único índice 'i'.
            //frecuencia con la que aparece cada letra de las palabras
            //cada casilla se llenara con la cantidad que aparece cada letra
            //en la primera palabra sumaremos ++ y en la segunda --
            //si ambas tienen la misma cantidad dre letras frecuencias queda en 0
        for (int i = 0; i < a.length(); i++){
            frecuencias[a.charAt(i) - 'a']++;
            frecuencias[b.charAt(i) - 'a']--;
        }
        // =========================================================================
        // PASO 5: AUDITORÍA DEL BALANCE (Verificación de saldo cero)
        // Si las dos palabras tenían exactamente las mismas letras, cada +1 tuvo
        // que ser compensado por un -1 correspondiente.
        // Por tanto, todas las 26 casillas deben haber quedado en 0.
        // =========================================================================
        for (int balance : frecuencias){
            if (balance != 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Casos de prueba para verificar en consola
        System.out.println(isAnagram("anagram", "margana") ? "Anagrams" : "Not Anagrams"); // Anagrams
        System.out.println(isAnagram("Hello", "hello") ? "Anagrams" : "Not Anagrams");       // Anagrams
        System.out.println(isAnagram("test", "rest") ? "Anagrams" : "Not Anagrams");         // Not Anagrams
    }
}