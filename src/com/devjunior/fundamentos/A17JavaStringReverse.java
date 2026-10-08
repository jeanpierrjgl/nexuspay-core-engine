package com.devjunior.fundamentos;
import java.util.Scanner;

public class A17JavaStringReverse {
    public static boolean esPalindromo(String s){
        Scanner consola = new Scanner(System.in);
        if (s == null){
            return false;
        }
        int left = 0;
        int right = s.length() - 1;

        while (left<right){
            if (s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
    return true;
    }
    public static void main(String[] args){
        String entrada = "daamm";
        System.out.println(esPalindromo(entrada) ? "Si": "No");
    }
}
