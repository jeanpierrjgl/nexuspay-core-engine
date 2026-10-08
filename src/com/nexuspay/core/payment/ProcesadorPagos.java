package com.nexuspay.core.payment;

//contrato formal plantilla de comportamiento
//no contiene la logica, solo lo que se debe hacer
//no importa el tipo de pago paypal. cripto etc
//solo importa poder procesar pago, polimorfismo

public interface ProcesadorPagos {
    //los metodos son public y abstract, no ejecutan codigo
    void procesar (Transaccion transaccion);
}

