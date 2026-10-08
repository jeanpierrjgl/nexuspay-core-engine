package com.devjunior.fundamentos;

public class ValidadorGeneral {
    public static void main(String[] args){
        String palabra1 = "java";
        String palabra2 = "ajavoo";
        boolean ejem = A18Anagrams.esAnagram(palabra2,palabra1);

        System.out.println(ejem ? "yes": "no");

    }


}
