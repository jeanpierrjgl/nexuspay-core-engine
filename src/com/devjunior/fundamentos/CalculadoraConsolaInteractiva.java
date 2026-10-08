package com.devjunior.fundamentos;

import java.util.Scanner;

public class CalculadoraConsolaInteractiva {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        // 1. Captura de datos interactiva
        System.out.print("Ingrese el nombre del Empleado: ");
        String nombreEmpleado = consola.nextLine();

        System.out.print("Ingrese el salario base mensual: ");
        double salarioBase = consola.nextDouble();

        System.out.print("Cantidad de horas extras trabajadas: ");
        int horasExtras = consola.nextInt();

        System.out.print("¿Tiene retención judicial o pensión alimenticia? (true/false): ");
        boolean pensionAlimenticia = consola.nextBoolean();

        // 2. Cálculo de horas regulares y extras
        double valorHoraRegular = salarioBase / 160.0;
        double valorPorHoraExtra = valorHoraRegular * 1.5;
        double totalIngresoHorasExtras = horasExtras * valorPorHoraExtra;

        // 3. Reglas de negocio: Tramos impositivos (19% o 12%)
        double tasaImpuesto = (salarioBase > 3000.0) ? 0.19 : 0.12;
        double descuentoImpuestos = salarioBase * tasaImpuesto;

        // 4. Retención judicial (10% sobre el salario base si aplica)
        double descuentoJudicial = pensionAlimenticia ? (salarioBase * 0.10) : 0.0;

        // 5. Salario Neto Final
        double salarioBrutoTotal = salarioBase + totalIngresoHorasExtras;
        double salarioNeto = salarioBrutoTotal - descuentoImpuestos - descuentoJudicial;

        // 6. Reporte Final Unificado (Siempre visible para cualquier caso)
        System.out.println("\n=====================================================");
        System.out.println("LIQUIDACIÓN CONSOLIDADA: " + nombreEmpleado.toUpperCase());
        System.out.println("=====================================================");
        System.out.println("Salario Base Mensual        : $" + salarioBase);
        System.out.println("Horas Extras (" + horasExtras + " hrs a 150%) : +$" + totalIngresoHorasExtras);
        System.out.println("Retención Fiscal (" + (int)(tasaImpuesto * 100) + "%)       : -$" + descuentoImpuestos);
        System.out.println("Retención Judicial (10%)    : -$" + descuentoJudicial);
        System.out.println("-----------------------------------------------------");
        System.out.println("SALARIO NETO A PERCIBIR     : $" + salarioNeto);
        System.out.println("=====================================================");

        // Liberación de recursos
        consola.close();
    }
}