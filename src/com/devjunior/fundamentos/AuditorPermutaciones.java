package com.devjunior.fundamentos;

public class AuditorPermutaciones {
    public static boolean sonPermutacionesExactas(String base, String candidata){
        //defensa fail fast
        if (base == null || candidata == null){
            throw new IllegalArgumentException("Entradas no pueden ser nulas");
        }
        //filtro de longitudes
        if (base.length() != candidata.length()){
            return false;
        }
        //normalizacion
        base = base.toLowerCase();
        candidata = candidata.toLowerCase();
        //memoria plana
        int[] frecuencia = new int[26];
        for (int i = 0; i<base.length(); i++){
            frecuencia[base.charAt(i) - 'a']++;
            frecuencia[candidata.charAt(i) - 'a']--;
        }
        for (int balance : frecuencia){
            if (balance != 0){
                return false;
            }
        }
    return true;
    }
    public static void main(String[] args) {
        // Casos nominales
        System.out.println("Backend vs kdneba: " + sonPermutacionesExactas("Backend", "kdneba")); // true
        System.out.println("Java vs Vaja: " + sonPermutacionesExactas("Java", "Vaja"));           // true
        System.out.println("Spring vs Boot: " + sonPermutacionesExactas("Spring", "Boot"));       // false

        // Caso de prueba para captura de excepción
        try {
            sonPermutacionesExactas(null, "test");
        } catch (IllegalArgumentException e) {
            System.out.println("Excepción capturada correctamente: " + e.getMessage());
        }
    }
}
