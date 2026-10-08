package com.nexuspay.core.payment;

public class ProcesadorPagosAuditado implements ProcesadorPagos {

    @Override
    public void procesar(Transaccion transaccion) {
        // 1. Fail-Fast contra nulos con mensaje claro
        if (transaccion == null) {
            throw new IllegalArgumentException("Violación de precondición: La transacción no puede ser nula.");
        }

        // 2. Auditoría previa
        System.out.printf("[AUDITORÍA] Registrando intento de pago para ID: %s%n", transaccion.id());

        // 3. Regla defensiva: montos válidos
        if (transaccion.monto() <= 0) {
            throw new IllegalArgumentException(
                    String.format("Monto inválido para transacción [%s]: %.2f. Debe ser estrictamente positivo.",
                            transaccion.id(), transaccion.monto())
            );
        }

        // 4. Regla de auditoría de riesgo (diez mil)
        if (transaccion.monto() > 10_000.0) {
            System.out.printf("[ALERTA DE RIESGO] Transacción de alto valor detectada: %.2f %s%n",
                    transaccion.monto(), transaccion.divisa());
        }

        // 5. Confirmación del cobro
        System.out.printf("[OPERACIÓN APROBADA] ID: %s | Importe: %.2f %s%n",
                transaccion.id(),
                transaccion.monto(),
                transaccion.divisa());
    }
}