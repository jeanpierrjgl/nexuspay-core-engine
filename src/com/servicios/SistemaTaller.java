package com.servicios;

public class Main {
    public static void main(String[] args) {
        // Creación de objetos en memoria
        Empleado e1 = new Empleado("Ana (Oficina)", 1500);

        // POLIMORFISMO: la variable es de tipo Empleado, pero el objeto real es Electricista
        Empleado e2 = new Electricista("Jean (Campo)", 1500, 300);

        // Los tratamos por igual gracias al polimorfismo
        Empleado[] lista = { e1, e2 };

        for (Empleado emp : lista) {
            // Cada uno ejecuta su propia versión de calcularSueldo() automáticamente
            System.out.println(emp.getNombre() + " cobra: " + emp.calcularSueldo() + "€");
        }

        // Acceso al dato estático (de la clase, sin importar qué objeto sea)
        System.out.println("Total contratados: " + Empleado.getTotalEmpleados());
    }
}
