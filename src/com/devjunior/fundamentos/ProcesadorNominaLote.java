package com.devjunior.fundamentos;

import java.util.Scanner;

public class ProcesadorNominaLote{
    public static void main(String[] args){
        Scanner consola = new Scanner(System.in);
        //filtro para cantidad de empleados
        int cantidadEmpleados = 0;
        while(cantidadEmpleados <= 0){
            System.out.println("Introduzca cantidad de empleados");
            cantidadEmpleados = consola.nextInt();
            if(cantidadEmpleados <=0){
                System.out.println("Por favor ingrese una cantidad de empleados mayor a 1");
            }
        }
        //declarar acumuladores y constantes
        double totalSueldoEmpresa = 0.0;
        double sueldoMasAlto = 0.0;
        String enpleadoSueldoMasAlto = " ";
        final double SUELDO_MINIMO = 1300.0;

        //entrada siclo de datos de usuarios nombre, sueldo
        for (int i = 1; i<=cantidadEmpleados; i++){
            //titulo de solicitud y numero de empleado + limpiaza de buffer
            System.out.println("-----REGISTRO DE USUARIO----- " + i);
            consola.nextLine();
            //nombre usuatio
            System.out.println("Introduzca nombre de empleado");
            String nombreEmpleado = consola.nextLine();

            Double sueldoEmpleado = 0.0;
            while (sueldoEmpleado < SUELDO_MINIMO){
                System.out.println("Introduzca sueldo empleado " +"..." + i + "...");
                sueldoEmpleado = consola.nextDouble();
                if (sueldoEmpleado<SUELDO_MINIMO){
                    System.out.println("Introduzca un valor superior a 1300.0");
                }
            }
            //acumilador salarios
            totalSueldoEmpresa += sueldoEmpleado;

            //verificador de sueldo mas alto + nombre de empleado
            if (sueldoEmpleado>sueldoMasAlto){
                sueldoMasAlto = sueldoEmpleado;
                enpleadoSueldoMasAlto = nombreEmpleado;
            }
        }



        // 3. Reporte final consolidado
        System.out.println("\n=======================================================");
        System.out.println("REPORTE CONSOLIDADO DE NÓMINA EMPRESARIAL");
        System.out.println("=======================================================");
        System.out.println("Total de empleados procesados : " + cantidadEmpleados);
        System.out.println("Gasto total en salarios       : $" + totalSueldoEmpresa);
        System.out.println("Salario promedio por empleado : $" + (totalSueldoEmpresa / cantidadEmpleados));
        System.out.println("Empleado con mayor ingreso    : " + enpleadoSueldoMasAlto + " ($" + sueldoMasAlto + ")");
        System.out.println("=======================================================");

        consola.close();


    }
}
/*package com.devjunior.fundamentos;

import java.util.Scanner;

public class ProcesadorNominaLote {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        // 1. Validación defensiva de la cantidad de empleados (mínimo 1)
        int cantidadEmpleados = 0;
        while (cantidadEmpleados <= 0) {
            System.out.print("Ingrese la cantidad de empleados a procesar (mínimo 1): ");
            cantidadEmpleados = consola.nextInt();

            if (cantidadEmpleados <= 0) {
                System.out.println("[ERROR] Debe registrar al menos un empleado para liquidar nómina.\n");
            }


        }

        // Variables acumuladoras para las métricas de la empresa
        double totalNominaEmpresa = 0.0;
        double salarioMasAlto = 0.0;
        String empleadoMejorPagado = "";

        final double SALARIO_MINIMO_LEGAL = 1100.0;

        // 2. Ciclo de procesamiento en lote
        for (int i = 1; i <= cantidadEmpleados; i++) {
            System.out.println("\n--- REGISTRO DE EMPLEADO #" + i + " ---");

            // Limpieza obligatoria del búfer antes de leer texto
            consola.nextLine();

            System.out.print("Nombre del empleado: ");
            String nombreEmpleado = consola.nextLine();

            // Validación defensiva del salario base (> 1100.0)
            double salarioBase = 0.0;
            while (salarioBase < SALARIO_MINIMO_LEGAL) {
                System.out.print("Salario base mensual ($): ");
                salarioBase = consola.nextDouble();

                if (salarioBase < SALARIO_MINIMO_LEGAL) {
                    System.out.println("[ERROR] El salario no puede ser inferior al mínimo legal ($" + SALARIO_MINIMO_LEGAL + "). Intente de nuevo.");
                }
            }

            // Actualización del acumulador global
            totalNominaEmpresa += salarioBase;

            // Detección del salario más alto
            if (salarioBase > salarioMasAlto) {
                salarioMasAlto = salarioBase;
                empleadoMejorPagado = nombreEmpleado;
            }
        }

        // 3. Reporte final consolidado
        System.out.println("\n=======================================================");
        System.out.println("REPORTE CONSOLIDADO DE NÓMINA EMPRESARIAL");
        System.out.println("=======================================================");
        System.out.println("Total de empleados procesados : " + cantidadEmpleados);
        System.out.println("Gasto total en salarios       : $" + totalNominaEmpresa);
        System.out.println("Salario promedio por empleado : $" + (totalNominaEmpresa / cantidadEmpleados));
        System.out.println("Empleado con mayor ingreso    : " + empleadoMejorPagado + " ($" + salarioMasAlto + ")");
        System.out.println("=======================================================");

        consola.close();
    }
}*/