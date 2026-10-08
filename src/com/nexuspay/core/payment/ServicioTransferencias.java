package com.nexuspay.core.payment;

    public class ServicioTransferencias {
        //atributo tipado hacia la interfaz
        private final ProcesadorPagos procesadorPagos;
        //inyeccion de dependencias por contructor
        public ServicioTransferencias(ProcesadorPagos procesadorPagos){
            if (procesadorPagos == null){
                throw new IllegalArgumentException("El procesador de pagos no puede ser nulo.");
            }
            this.procesadorPagos = procesadorPagos;
        }
        //metodo de negocio que delega la ejecucion
        public void ejecutarPago(Transaccion transaccion){
            this.procesadorPagos.procesar(transaccion);
        }
    }

