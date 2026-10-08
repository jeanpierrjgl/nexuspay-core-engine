package com.devjunior.fundamentos;
import java.util.Scanner;

public class TablaMultiplicar {
    public static void main (String[] args){
        Scanner consola = new Scanner(System.in);
        int numero = 0;
        while(numero<=0){
            System.out.println("Introduzca el numero a multiplicar");
            numero = consola.nextInt();
            if (numero<0){
                System.out.println("Introduzca un numero valido mayor a 0");
            }
        }
        System.out.println("---TABLA DE MULTIPLICAR DEL " + numero);
        for (int i = 1; i<=10; i++){
            System.out.println(numero + " X " + i + " = " + (numero * i));
        }
    }
}
