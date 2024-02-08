package com.mycompany.ejercicio1_mg;
import java.io.BufferedReader; //lee texto de una secuencia de entrada de caracteres
import java.io.IOException; // es una excepción de E/S (entrada/salida) 
import java.io.InputStreamReader; //se utiliza para convertir flujos de bytes en flujos de caracteres

 class Ejercicio1_mg {

    public static void main(String[] args) {
       BufferedReader Palabra = new BufferedReader(new InputStreamReader(System.in));
       String palabra;
       int number;
       while (true){
          System.out.print("Ingresa una palabra: ");
          try
          {
              palabra = Palabra.readLine();
              if(palabra.matches("[a-zA-Z]+")){
                  break;
              } else{
              System.out.println("Palabra no valida, favor vuelva a intentarlo.");
              }
            
          }catch(IOException e){ 
              e.printStackTrace();
          }
       }  
      while (true) {
            System.out.print("Ingresa un número: ");
            try {
                String input = Palabra.readLine();
                if (input.matches("\\d+")) {
                    number = Integer.parseInt(input);
                    if (number > 0) {
                        break;
                    } else {
                        System.out.println("numero  no válido. Por favor, ingresa un número.");
                    }
                } else {
                    System.out.println("numero no válido. Por favor, ingresa un número entero.");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        
        for (int i = 0; i < number; i++) {
            System.out.println(palabra);
        }
        
        try {
            Palabra.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
