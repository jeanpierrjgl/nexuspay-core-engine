package com.devjunior.fundamentos;

public class PalindromoChecker {
    public static boolean esPalindromo(String s){
        if (s == null){
            return false;
        }
        int left = 0;
        int right = s.length() -1;

        while (left < right){
            if (s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args){
        String entrada = "ala";
        System.out.println(esPalindromo(entrada) ? "yes":"no");
    }

}