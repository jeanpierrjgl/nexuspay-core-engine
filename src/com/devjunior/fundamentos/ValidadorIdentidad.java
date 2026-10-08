package com.devjunior.fundamentos;

public class ValidadorIdentidad {
    public static boolean sonEquivalentes(String u1, String u2){
        //Defensa Fail-Fast: Si cualquiera es null, retorna false.
        if (u1 == null || u2 == null){
            return false;
        }
        //Limpieza: Elimina los espacios antes de comparar (u1.replace(" ", "") o normalízalo como prefieras).
        u1 = u1.replace(" ", "").toLowerCase();
        u2 = u2.replace(" ", "").toLowerCase();
        //Filtro de longitud: Si tras quitar espacios las longitudes no coinciden, retorna false.
        if (u1.length()!=u2.length()){
            return false;
        }
        //Memoria plana: Usa un arreglo de frecuencias int[26] para balancear (+1 / -1) asumiendo solo letras del alfabeto inglés.
        int[] frecuencia = new int[26];
        //Auditoría: Retorna true solo si el balance final de las 26 casillas es exactamente 0.
        for (int i = 0; i<u1.length(); i++){
            frecuencia[u1.charAt(i) - 'a']++;
            frecuencia[u2.charAt(i) - 'a']--;
        }
        for (int balance : frecuencia){
            if (balance != 0){
                return false;
            }
        }
    return true;
    }
    public static void main (String[] args){
        System.out.println("Son equivalentes: " + sonEquivalentes("juan","Jaun"));
    }
}
