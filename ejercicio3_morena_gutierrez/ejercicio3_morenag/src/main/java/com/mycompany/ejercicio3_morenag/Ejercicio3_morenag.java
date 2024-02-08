
package com.mycompany.ejercicio3_morenag;
import java.util.Scanner;
/*se utiliza para obtener la entrada del usuario desde la consola 
Proporciona varios métodos para leer diferentes tipos de datos, como enteros, flotantes, cadenas, etc.*/

public class Ejercicio3_morenag {

    public static void main(String[] args)
    {
         Scanner Sc = new Scanner(System.in);
        
        System.out.println("Ingrese un primer número:");
        double number1 = Sc.nextDouble();
        
        System.out.println("Ingrese un segundo número:");
        double number2 = Sc.nextDouble();
        
        System.out.println("Ingrese un tercer número:");
        double number3 = Sc.nextDouble();
        
        double mayor = number1;
        
        if (number2 > mayor) {
            mayor = number2;
        }
        
        if (number3 > mayor) {
            mayor = number3;
        }
        
        System.out.println("El mayor número ingresado es el : " + mayor);
        
        Sc.close();
    }
}
