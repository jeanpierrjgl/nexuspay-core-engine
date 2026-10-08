package com.devjunior.fundamentos;
import java.util.Scanner;

public class ProcesadorTextoHackerRank {
    public static void main(String[] args){
        Scanner consola = new Scanner(System.in);
        // TODO 1: Entrada
        System.out.println("introduzca dos paralabras separadas por enter");
        String A = consola.nextLine();
        String B = consola.nextLine();
        // TODO 2: Suma de longitudes (Salida estricta sin textos extra)

        System.out.println("Longitud de Palabras= " + (A.length() + B.length()));
        // TODO 3: Comparación lexicográfica ("Yes" o "No")
        if (A.compareTo(B)>0){
            System.out.println("yes");
        }else {
            System.out.println("No");
        }
        // TODO 4: Capitalización y salida combinada
        String aCapitalizacion = A.substring(0,1).toUpperCase() + A.substring(1);
        String bCapitalizacion = B.substring(0,1).toUpperCase() + B.substring(1);
        System.out.println("Capitalization= "+ aCapitalizacion + " " + bCapitalizacion);
    }
}
/*package com.devjunior.fundamentos;

import java.util.Scanner;

public class ProcesadorTextoHackerRank {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        // TODO 1: Entrada
        System.out.println("-> Escribe dos palabras separadas por espacio o Enter:");
        String a = consola.next();
        String b = consola.next();

        // TODO 2: Suma de longitudes (Salida estricta sin textos extra)
        System.out.println(a.length() + b.length());

        // TODO 3: Comparación lexicográfica ("Yes" o "No")
        if (a.compareTo(b) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        // TODO 4: Capitalización y salida combinada
        String aCapitalizada = a.substring(0, 1).toUpperCase() + a.substring(1);
        String bCapitalizada = b.substring(0, 1).toUpperCase() + b.substring(1);
        System.out.println(aCapitalizada + " " + bCapitalizada);

        consola.close();
    }
}*/