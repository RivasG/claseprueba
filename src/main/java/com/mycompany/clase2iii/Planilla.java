/*
ingresar nombre del colaborador
ingresar salariobase
obtener comision 16% del salariobase
bonificacion 9% del salario base
obtener salariobruto---- salario+comision+bonifiacion
seguro 13% del salariobruto
obtner salarioneto... salariobruto-seguro

si salario neto mayor a 600000, empleado destacado
sino
empleado medio tiempo
 */
// hacer contador del -5 hasta 10 
// se indique si es par,impar,nulo=0,positivo negativo
package com.mycompany.clase2iii;

public class Planilla {
    public static void main(String[] args) {
        int numero;
        for (numero = -5; numero <=10; numero++) {
            // Y en java &&
           //o en java    ||, =! diferente en java 
            System.out.println("Los numero son :"+numero);
            if(numero>0 && numero%2==0){
                System.out.println("El numero es par y positivo "+numero);
                
            }
            else if (numero>0 && numero%2!=0){
              System.out.println("El numero es impar y positivo "+numero); 
            }
            else  if(numero<0 && numero%2==0){
                System.out.println("El numero es par y Negativo "+numero);
                
            }
            else if (numero<0 && numero%2!=0){
              System.out.println("El numero es impar y Negativo "+numero); 
            }
            else {
                  System.out.println("El numero es nulo y es par");
            }      
            
        }
        }

}
