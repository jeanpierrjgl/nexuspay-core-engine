package com.devjunior.fundamentos;
import com.devjunior.fundamentos.ValidadorTexto;
import com.devjunior.fundamentos.ValidadorPalindromo;

public class ValidadorPalindromoMain {
    public static void main(String[] args) {
        ValidadorTexto validador = new ValidadorPalindromo();
        String prueba1 = "ala";
        String prueba2 = "madam";
        System.out.println(prueba1 + " " + validador.validar(prueba1));
        System.out.println(prueba2 + " " + validador.validar(prueba2));
    }
}
