package com.devjunior.fundamentos;

// 4. ÚNICA clase pública: coincide con el nombre del archivo SimuladorValidadorMain.java
public class SimuladorValidadorMain {
    public static void main(String[] args) {
        ValidadorSeguridad validadorLen = new ValidadorLongitud();
        ValidadorSeguridad validadorPal = new ValidadorSimetria();

        // Pruebas Validador Longitud
        System.out.println("Longitud 'clave1234': " + (validadorLen.validar("clave1234") ? "APROBADO" : "RECHAZADO"));
        System.out.println("Longitud 'corta': " + (validadorLen.validar("corta") ? "APROBADO" : "RECHAZADO"));

        // Pruebas Validador Simetría
        System.out.println("Simetría 'Radar': " + (validadorPal.validar("Radar") ? "APROBADO" : "RECHAZADO"));
        System.out.println("Simetría 'Backend': " + (validadorPal.validar("Backend") ? "APROBADO" : "RECHAZADO"));
    }
}