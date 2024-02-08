package com.mycompany.ejercicio2_morena.gutierrez;
import javax.swing.JOptionPane;

public class Ejercicio2_morenaGutierrez {

    public static void main(String[] args) 
    {
          String V1 = JOptionPane.showInputDialog(null, "Ingrese el primer numero:");
        String V2 = JOptionPane.showInputDialog(null, "Ingrese el segundo numero:");

        double number1 = Double.parseDouble(V1);
        double number2 = Double.parseDouble(V2);

        double suma = number1 + number2;
        double resta = number1 - number2;
        double multiplicacion = number1 * number2;
        double division = number1 / number2;

 
        JOptionPane.showMessageDialog(null, "La suma es: " + suma);
        JOptionPane.showMessageDialog(null, "La resta es: " + resta);
        JOptionPane.showMessageDialog(null, "La multiplicación es: " + multiplicacion);
        JOptionPane.showMessageDialog(null, "La división es: " + division);
    }

}