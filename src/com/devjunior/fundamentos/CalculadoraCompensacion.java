package com.devjunior.fundamentos;

public class CalculadoraCompensacion {

    public static void main(String[] args) {

        String nombre = "Carlos";
        double salarioBruto = 3200.0;
        double impuestos = 0.19;
        double pension = 0.4;
        boolean bTranporte = true;
        double cTransporte = 150.0;

        double irpf = salarioBruto * impuestos;
        double descuentoSalud = salarioBruto * pension;

        double bonoAplicado = 0.0;
        double salarioNeto = 0.0;

        if(bTranporte){
            bonoAplicado = cTransporte;
            salarioNeto = salarioBruto - irpf - descuentoSalud + bonoAplicado;
        }else {
            bonoAplicado = 0.0;
            salarioNeto = salarioBruto - irpf - descuentoSalud;
        }

        // ==========================================
        // TODO 3: Salida Formateada por Consola
        // ==========================================
        // Imprime un reporte limpio línea por línea usando System.out.println() que muestre:
        // --------------------------------------------------
        // LIQUIDACIÓN SALARIAL: [Nombre]
        // Salario Bruto     : $[Monto]
        // Retención IRPF    : -$[Monto]
        // Seguridad Social  : -$[Monto]
        // Bono Transporte   : +$[Monto]
        // --------------------------------------------------
        // Salario Neto Final: $[Monto Neto]
        // --------------------------------------------------
        System.out.println("LIQUIDACIÓN SALARIAL: " + nombre);
        System.out.println("Salario Bruto       : " + salarioBruto);
        System.out.println("IRPF                : " + irpf);
        System.out.println("Seguridad Social    : " + descuentoSalud);
        System.out.println("Bono Transporte     : " + bTranporte);
        System.out.println("----------------------------------------------");
        System.out.println("Salario Neto Final  : " + salarioNeto);
        System.out.println("----------------------------------------------");

    }
}