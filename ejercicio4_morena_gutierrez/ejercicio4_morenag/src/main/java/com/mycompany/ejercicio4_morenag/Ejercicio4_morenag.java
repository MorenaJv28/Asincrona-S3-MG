package com.mycompany.ejercicio4_morenag;

import java.util.Scanner;

public class Ejercicio4_morenag {

    public static void main(String[] args) 
    {
        Scanner R = new Scanner(System.in);

        System.out.println("Ingresa la longitud del rectángulo:");
        double L = R.nextDouble();

        System.out.println("Ingresa la anchura del rectángulo:");
        
        double A = R.nextDouble();
        
        double perimetro = 2 * (L + A);
        
        double area = L * A;

        System.out.println("El perímetro es de: " + perimetro);
        System.out.println("El área es de: " + area);

        R.close();
    }
}
