package com.mycompany.clase2iii;

import java.util.Scanner;

public class continuar {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int i;
        String respuesta;
        respuesta = "s";
        while (respuesta.equals("S") || respuesta.equals("s")) {
            for (i = 1; i <= 10; i++) {
                System.out.println(i);
            }
            System.out.println("Desea continuar S/N");
            respuesta = entrada.next();

        }
}
    }
