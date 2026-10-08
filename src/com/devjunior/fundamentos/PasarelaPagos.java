package com.devjunior.fundamentos;

public interface PasarelaPagos {
    double calcularRecargo(double monto);
}
class CobroTarjetaCredito implements PasarelaPagos{
    @Override
    public double calcularRecargo(double monto){
        if (monto <= 0){
            throw new IllegalArgumentException("Monto no valido");
        }
        double recargo = monto * 0.03;
        return (recargo < 1.50 ) ? 1.50 : recargo;
    }
}
class CobroTransferencia implements PasarelaPagos{
    @Override
    public double calcularRecargo(double monto){
        if (monto<=0){
            throw new IllegalArgumentException("Monto no valido");
        }
        return (monto < 500.0) ? 0.0 : 2.50;
    }
}