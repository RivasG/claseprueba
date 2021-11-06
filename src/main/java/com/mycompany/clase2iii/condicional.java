package com.mycompany.clase2iii;

import java.util.Scanner;

public class condicional {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
       int numero;
       
       try    { 
        System.out.println("Ingrese un dato tipo entero");
        numero = entrada.nextInt();
        if (numero == 0) { // condicion 
            System.out.println("El numero es nulo " + numero);
        } else if (numero > 0) {
            System.out.println("El numero es positivo " + numero);
        } else {
            System.out.println("El numero es negativo  " + numero);
        }
        if (numero % 2 == 0) {
            System.out.println("El numero es par " + numero);
        } else {
            System.out.println("El numero es impar " + numero);
        }
        } catch (Exception e ) {
            System.out.println("Digite un dato entero ");
        }  
    }
}
