package com.nexuspay.core.payment;

public class ProcesadorPagosSeguro implements ProcesadorPagos{
    @Override
    public void procesar (Transaccion transaccion){
        if (transaccion == null){
            throw new IllegalArgumentException("Violación de precondición: La transacción no puede ser nula.");
        }
        if (transaccion.monto() <= 0){
            throw new IllegalArgumentException(
                    String.format("Monto inválido para transacción [%s]: %.2f. Debe ser estrictamente positivo.",
                            transaccion.id(), transaccion.monto())
                    );
        }
        System.out.printf("[OPERACIÓN APROBADA] ID: %s | Importe: %.2f %s%n",
                transaccion.id(),
                transaccion.monto(),
                transaccion.divisa()
        );

    }
}

/*Si la transacción es nula o monto <= 0, lanza IllegalArgumentException (Fail-Fast).
Si es válida, imprime la confirmación por consola.*/