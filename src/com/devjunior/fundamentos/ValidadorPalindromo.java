package com.devjunior.fundamentos;
import com.devjunior.fundamentos.ValidadorTexto;

public class ValidadorPalindromo implements ValidadorTexto{
    @Override
    public boolean validar(String input){
        if (input == null){
            return false;
        }
        int left = 0;
        int right = input.length() -1;
        while (left < right){
            if (input.charAt(left) != input.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

}
