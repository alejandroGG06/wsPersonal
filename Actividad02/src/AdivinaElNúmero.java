
package Pjuegos;
import java.util.Random;
import java.util.Scanner;

public class AdivinaElNúmero {
	public static void main(String[] args) {

		Random random = new Random();

		int randomIndex = random.nextInt(10) + 1;

		Scanner juego = new Scanner(System.in);

		System.out.println("introduce los numero para el juego  ");
		while (true) {
			int n1 = juego.nextInt();

			if (n1 < randomIndex) {
				System.out.println("muy bajo");

			} else if (n1>randomIndex) {System.out.println("el numero se pasa");
				
			}else if (n1==randomIndex) {System.out.println("El numero "+n1+ " es el correcto");
			break;
				
			}

		}
		System.out.println("El numero era: "+ randomIndex);

	}
}
