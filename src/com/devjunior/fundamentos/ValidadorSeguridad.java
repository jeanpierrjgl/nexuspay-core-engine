package com.devjunior.fundamentos;

// 1. Interfaz (sin modificador public si está en el mismo archivo)
interface ValidadorSeguridad {
    boolean validar(String token);
}

// 2. Implementación Longitud
class ValidadorLongitud implements ValidadorSeguridad {
    @Override
    public boolean validar(String token) {
        if (token == null) {
            return false;
        }
        return token.length() >= 8 && token.length() <= 16;
    }
}

// 3. Implementación Simetría (Two Pointers)
class ValidadorSimetria implements ValidadorSeguridad {
    @Override
    public boolean validar(String token) {
        if (token == null || token.isEmpty()) {
            return false;
        }

        String normalizado = token.toLowerCase();
        int left = 0;
        int right = normalizado.length() - 1;

        while (left < right) {
            if (normalizado.charAt(left) != normalizado.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}

