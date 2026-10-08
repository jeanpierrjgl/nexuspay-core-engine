package com.nexuspay.core.payment;

//record en un tipo especial de clase
//los componentes del record son inmutables
//cuando el compilador procesa los componentes, genera los campos de estado privados y final
public record Transaccion(String id, double monto, String divisa) {
}

/*Crea un record Transaccion(String id, double monto, String divisa) inmutable.

Define una interfaz ProcesadorPagos con el contrato:

Java
void procesar(Transaccion transaccion);
Implementa la clase ProcesadorPagosSeguro:

Si la transacción es nula o monto <= 0, lanza IllegalArgumentException (Fail-Fast).

Si es válida, imprime la confirmación por consola.

En la clase Main, programa contra la abstracción
        (ProcesadorPagos procesador = new ProcesadorPagosSeguro();)
y valida casos válidos y no válidos en bloques try-catch.*/