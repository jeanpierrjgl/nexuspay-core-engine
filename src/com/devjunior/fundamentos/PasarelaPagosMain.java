package com.devjunior.fundamentos;

public class PasarelaPagosMain {
    public static void main(String[] args) {
        // Polimorfismo: programamos contra la interfaz PasarelaPagos
        PasarelaPagos cobroTarjeta = new CobroTarjetaCredito();
        PasarelaPagos cobroTransferencia = new CobroTransferencia();

        System.out.println("=== PRUEBAS PASARELA DE PAGOS ===");

        // 1. Pruebas Tarjeta de Crédito (3%, piso mínimo de 1.50)
        // Monto 30.0 -> 3% es 0.90 -> Debe cobrar el piso de 1.50
        System.out.println("Tarjeta (Monto 30.0): " + cobroTarjeta.calcularRecargo(30.0) + " USD");

        // Monto 100.0 -> 3% es 3.00 -> Supera el piso, cobra 3.00
        System.out.println("Tarjeta (Monto 100.0): " + cobroTarjeta.calcularRecargo(100.0) + " USD");

        // 2. Pruebas Transferencia (< 500 -> 0.0, >= 500 -> 2.50)
        // Monto 250.0 -> Menor a 500, recargo 0.0
        System.out.println("Transferencia (Monto 250.0): " + cobroTransferencia.calcularRecargo(250.0) + " USD");

        // Monto 500.0 -> Igual o mayor a 500, recargo 2.50
        System.out.println("Transferencia (Monto 500.0): " + cobroTransferencia.calcularRecargo(500.0) + " USD");

        // 3. Prueba defensiva (Fail-Fast): monto inválido
        try {
            cobroTarjeta.calcularRecargo(-50.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Excepción capturada con éxito: " + e.getMessage());
        }
    }
}