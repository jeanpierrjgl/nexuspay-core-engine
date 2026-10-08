package com.devjunior.fundamentos;

public class ValidadorSesion {
    public static boolean esSesionValida(String tokenMaestro, String tokenSesion){
        // 1 defensa fail fast
        if (tokenMaestro == null || tokenSesion == null || tokenMaestro.length() != tokenSesion.length()) {
            return false;
        }
        // 2 normalizacion
        tokenMaestro = tokenMaestro.toLowerCase();
        tokenSesion = tokenSesion.toLowerCase();
        // 3 memoria plana
        int[] frecuencia = new int[26];
        // 4 balance en una pasada
        for (int i =0 ; i<tokenMaestro.length(); i++){
            frecuencia[tokenMaestro.charAt(i) - 'a']++;
            frecuencia[tokenSesion.charAt(i) - 'a']--;
        }
        //5 auditoria
        for (int balance : frecuencia){
            if (balance != 0){
                return false;
            }
        }
    return true;

    }
    public static void main(String[] args){
        System.out.println(esSesionValida("Hello", "olleh") ? "Sesion Valida" : "Sesion Invalida"); // Sesion Valida
        System.out.println(esSesionValida("TokenA", "TokenB") ? "Sesion Valida" : "Sesion Invalida"); // Sesion Invalida
        System.out.println(esSesionValida(null, "abc") ? "Sesion Valida" : "Sesion Invalida");       // Sesion Invalida

    }
}
