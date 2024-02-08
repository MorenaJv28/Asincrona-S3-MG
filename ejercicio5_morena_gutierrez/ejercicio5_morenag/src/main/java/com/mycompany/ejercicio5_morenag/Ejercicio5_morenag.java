
package com.mycompany.ejercicio5_morenag;
import java.util.Scanner;

public class Ejercicio5_morenag 
{
    public static void main(String[] args) 
    {
        final double PI = 3.141592653; // Valor de PI

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el radio de la circunferencia:");
        double radio = sc.nextDouble();

     
        double a = PI * radio * radio;

       
        double v = (4.0 / 3.0) * PI * Math.pow(radio, 3);

        System.out.println("El área de la circunferencia es: " + a);
        System.out.println("El volumen de la esfera es: " + v);

        sc.close();
    }
}
