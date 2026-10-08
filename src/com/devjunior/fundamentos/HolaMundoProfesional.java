package com.devjunior.fundamentos;

public class HolaMundoProfesional {

    public static void main(String[] args) {
        int edadMinima = 18;
        double salarioBase = 2500.50;
        boolean estaContratado = false;

        String nombreDesarrollador = "Alex";
        var mensajeBienvenida = "Bienvenido al camino de 6 meses hacia tu empleo como Java Dev";

        System.out.println("==========================================");
        System.out.println(mensajeBienvenida);
        System.out.println("Desarrollador: " + nombreDesarrollador);
        System.out.println("Salario Objetivo: $" + salarioBase);
        System.out.println("¿Contratado actualmente?: " + estaContratado);
        System.out.println("==========================================");
    }
}