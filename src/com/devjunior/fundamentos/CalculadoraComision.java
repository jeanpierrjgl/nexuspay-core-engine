package com.devjunior.fundamentos;

public interface CalculadoraComision {
    double calcular(double monto);
}
// 1. Comisión Estándar *25%
class ComisionEstandar implements CalculadoraComision{
    @Override
    public double calcular(double monto){
        if (monto <=0){
            throw new IllegalArgumentException("Debe introducir monto correcto");
        }
        double comision = monto * 0.025;
        return (comision < 1.0 ) ? 1.0 : comision; //condicion ? true : false
    }
//comision corporativa
// Menor o igual a 1000 -> 5.0 fijo. Mayor a 1000 -> *0.8%
class ComisionCorporativa implements CalculadoraComision{
    @Override
    public double calcular(double monto){
        if (monto<=0){
            throw new IllegalArgumentException("Introduzca un monto mayor a 0");
        }
        if (monto <= 1000){
            return 5.0;
        }else {
            return monto * 0.8;
        }
    }
}
}
