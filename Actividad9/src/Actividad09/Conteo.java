package Actividad09;

import java.util.Scanner;

public class Conteo {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese una cadena de texto:");
        String cadena = scanner.nextLine();
        
        int contador = 0;
        boolean palabraEncontrada = false;
        
        for (int i = 0; i < cadena.length(); i++) {
            if (Character.isLetter(cadena.charAt(i))) {
                if (!palabraEncontrada) {
                    contador++;
                    palabraEncontrada = true;
                }
            } else {
                palabraEncontrada = false;
            }
        }
        
        System.out.println("El número de palabras en la cadena es: " + contador);
    }
}
