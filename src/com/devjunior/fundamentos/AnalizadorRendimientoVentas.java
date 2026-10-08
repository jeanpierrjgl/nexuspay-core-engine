package com.devjunior.fundamentos;
import java.util.Scanner;

public class AnalizadorRendimientoVentas{
    public static void main(String[] args){
        Scanner consola = new Scanner(System.in);
        //1Filtro dias
        int diasTotal = 0;
        while (diasTotal <= 0){
            System.out.println("Instroduce la cantidad de dias de venta");
            diasTotal = consola.nextInt();
            if (diasTotal<=0){
                System.out.println("La cantidad de dias debe ser mayor a 0");
            }
        }
        //2filtro ventas
        double[] ventas = new double[diasTotal];
        for (int i = 0; i< ventas.length; i++){
            double ventasDia = -1.0;
            while (ventasDia < 0) {
                System.out.println("Introduce venta numero " + (i + 1));
                ventasDia = consola.nextDouble();
                if (ventasDia < 0) {
                    System.out.println("deve introducir un monto mayor o igual a 0");
                }
            }
        ventas[i] = ventasDia;
        }
        //3filtros totales
        double sumaTotalVentas = 0.0;
        double ventaMaxima = ventas[0];
        double ventaMinima = ventas[0];
        for (int i = 0; i < ventas.length; i++) {
            //acumulativas
            sumaTotalVentas += ventas[i];
            //venta maxima
            if (ventas[i] > ventaMaxima) {
                ventaMaxima = ventas[i];
            }
            //venta minima
            if (ventas[i] < ventaMinima){
                ventaMinima = ventas[i];
            }
        }
        //4promedio ventas
        double promedioDiario = sumaTotalVentas/ventas.length;
        //5dias de venta sobre el promedio
        int diasSobrePromedio = 0;
        for (double venta : ventas){
            if (venta > promedioDiario) {
                diasSobrePromedio++;
            }
        }


        // ==============================================================
        // TODO 4: Salida por consola
        // ==============================================================
        // Imprime un reporte limpio con: total facturado, promedio,
        // venta más alta, venta más baja y cantidad de días sobre la media.
        System.out.println("\n" + "=".repeat(55));
        System.out.println("          REPORTE DE RENDIMIENTO DE VENTAS");
        System.out.println("=".repeat(55));
        System.out.println("Días evaluados                  : " + ventas.length);
        System.out.printf("Total facturado acumulado       : $%.2f%n", sumaTotalVentas);
        System.out.printf("Promedio diario de ventas       : $%.2f%n", promedioDiario);
        System.out.printf("Venta más alta registrada       : $%.2f%n", ventaMaxima);
        System.out.printf("Venta más baja registrada       : $%.2f%n", ventaMinima);
        System.out.println("Días con ventas sobre la media  : " + diasSobrePromedio);
        System.out.println("=".repeat(55));

        consola.close();
    }
}


/*
package com.devjunior.fundamentos;

import java.util.Scanner;

public class AnalizadorRendimientoVentas {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        // ==============================================================
        // TODO 1: Dimensionamiento defensivo
        // ==============================================================
        // Declara 'totalDias' en 0.
        // Usa un bucle while que exija que 'totalDias' sea mayor a 0.
        // Pide el dato por consola y muestra error si ingresan <= 0.
        int totalDias = 0;
        while (totalDias <= 0){
            System.out.println("Introduce el total de dias");
            totalDias = consola.nextInt();

            if(totalDias<=0){
                System.out.println("Introduzca una cantidad de dias superior a 0");
            }
        }


        // ==============================================================
        // TODO 2: Creación del arreglo y captura de datos
        // ==============================================================
        // Declara e instancia: double[] ventas = new double[totalDias];
        // Con un bucle for (i desde 0 hasta < ventas.length):
        //   - Pide la venta del día (i + 1).
        //   - Con un while interno, asegura que la venta no sea negativa (< 0).
        //   - Almacena el valor validado en ventas[i].
        double[] ventas = new double[totalDias];
        for(int i = 0; i< ventas.length; i++){
            double ventasDia = -1.0;
            while (ventasDia < 0){
                System.out.println("introduce las ventas del dia: " + (i+1));
                ventasDia = consola.nextDouble();

                if(ventasDia<0){
                    System.out.println("debe introducir un valor mayor a 0");
                }
            }
            ventas[i]=ventasDia;
        }
        // ==============================================================
        // TODO 3: Cálculos estadísticos
        // ==============================================================
        // Calcula:
        //   - Suma total de ventas y el promedio diario.
        //   - Venta máxima y venta mínima (pista: inicialízalas con ventas[0]).
        //   - Cuenta cuántos días registraron ventas por encima del promedio.
// -------------------------------------------------------------
        // PASO 1: Suma total, Venta Máxima y Venta Mínima
        // -------------------------------------------------------------
        double sumaTotalVentas = 0.0;
        double ventaMaxima = ventas[0]; // Récord base
        double ventaMinima = ventas[0]; // Récord base

        for (int i = 0; i < ventas.length; i++) {
            // Acumulación progresiva
            sumaTotalVentas += ventas[i];

            // Detección de máximo
            if (ventas[i] > ventaMaxima) {
                ventaMaxima = ventas[i];
            }

            // Detección de mínimo
            if (ventas[i] < ventaMinima) {
                ventaMinima = ventas[i];
            }
        }

        // El promedio se calcula una sola vez fuera del bucle
        double promedioDiario = sumaTotalVentas / ventas.length;

        // -------------------------------------------------------------
        // PASO 2: Contar días sobre el promedio (Segunda pasada)
        // -------------------------------------------------------------
        int diasSobrePromedio = 0;

        // Usamos el bucle for-each (más limpio para solo lectura)
        for (double venta : ventas) {
            if (venta > promedioDiario) {
                diasSobrePromedio++;
            }
        }


        // ==============================================================
        // TODO 4: Salida por consola
        // ==============================================================
        // Imprime un reporte limpio con: total facturado, promedio,
        // venta más alta, venta más baja y cantidad de días sobre la media.
        System.out.println("\n" + "=".repeat(55));
        System.out.println("          REPORTE DE RENDIMIENTO DE VENTAS");
        System.out.println("=".repeat(55));
        System.out.println("Días evaluados                  : " + ventas.length);
        System.out.printf("Total facturado acumulado       : $%.2f%n", sumaTotalVentas);
        System.out.printf("Promedio diario de ventas       : $%.2f%n", promedioDiario);
        System.out.printf("Venta más alta registrada       : $%.2f%n", ventaMaxima);
        System.out.printf("Venta más baja registrada       : $%.2f%n", ventaMinima);
        System.out.println("Días con ventas sobre la media  : " + diasSobrePromedio);
        System.out.println("=".repeat(55));

        consola.close();
        consola.close();
    }
}*/