package com.mycompany.clase2iii;

import java.text.DecimalFormat;
import java.util.Scanner;

public class potencias {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        double numero;
        System.out.println("Ingrese un numero");
        numero = entrada.nextDouble();
        System.out.println("El cuadrado del numero es :" + numero + " es " + Math.pow(numero, 2));
  System.out.println("El cubo del numero " + numero + " es " +df.format (Math.pow(numero, 3)));
        System.out.println("La raiz cuadrada del numero " + numero + " es " +df.format (Math.sqrt(numero)));
        System.out.println("La raiz cubo del numero " + numero + " es " +df.format(Math.cbrt(numero)));
    }
    
}
