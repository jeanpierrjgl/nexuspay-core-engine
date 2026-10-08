package com.nexuspay.core.payment;

public class AppMain {

    public static void main(String[] args) {
        Transaccion tx1 = new Transaccion("TXN-101", 150.50, "EUR");
        Transaccion tx2 = new Transaccion("TXN-102", 20_000.00, "USD");

        System.out.println("=== ESCENARIO 1: Con Procesador Seguro ===");
        // Le inyectamos la implementación segura
        ServicioTransferencias servicioSeguro = new ServicioTransferencias(new ProcesadorPagosSeguro());
        servicioSeguro.ejecutarPago(tx1);

        System.out.println("\n=== ESCENARIO 2: Con Procesador Auditado ===");
        // Inyectamos la implementación auditada sin cambiar nada de ServicioTransferencias
        ServicioTransferencias servicioAuditado = new ServicioTransferencias(new ProcesadorPagosAuditado());
        servicioAuditado.ejecutarPago(tx2);
    }
}