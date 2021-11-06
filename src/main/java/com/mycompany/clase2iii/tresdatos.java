package com.mycompany.clase2iii;

import java.util.Scanner;

public class tresdatos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int valor1, valor2, valor3, mayor = 0, menor = 0;
        String opc;
        opc="s";
        try {
        while (opc.equals("s") || opc.equals("S")) { 
            System.out.println("Ingrese los tres valores solicitados de tipo entero");
            valor1 = entrada.nextInt();
            valor2 = entrada.nextInt();
            valor3 = entrada.nextInt();
            if (valor1 > valor2) {
                mayor = valor1;
                menor = valor2;
            }
            if (valor2 > valor1) {
                mayor = valor2;
                menor = valor1;
            }
            if (valor3 > mayor) {
                mayor = valor3;
            }
            if (valor3 < menor) {
                menor = valor3;
            }
            System.out.println("El dato mayor es :" + mayor);
            System.out.println("El dato menor es :" + menor);
       
        System.out.println("Ejecutar de nuevo?");
        System.out.println("S / N");
        opc = entrada.next();
        } 
         } catch (Exception e) {
                System.out.println("Digite un dato valido");
                }
 }
    
}
