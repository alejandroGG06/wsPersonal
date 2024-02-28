package Actividad09;

import java.util.Scanner;

public class Usuario {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Ingrese su nombre de usuario: ");
	        String usuarioIngresado = scanner.nextLine().trim().toLowerCase();

	        System.out.print("Ingrese su contraseña: ");
	        String passwordIngresado = scanner.nextLine().trim();

	        String usuarioCorrecto = "Capi";
	        String passwordCorrecto = "odioAironMan69";

	        if (usuarioIngresado ==usuarioCorrecto && passwordIngresado ==passwordCorrecto) {
	            System.out.println("¡Bienvenido a nuestro programa!");
	        } else {
	            System.out.println("Usuario o contraseña incorrectos.");
	        }
	    }
	}


