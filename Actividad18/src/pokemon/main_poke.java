package pokemon;


import java.util.Scanner;

public class main_poke {
	public static void main(String[] args) {
		
		Scanner muni = new Scanner(System.in);
        muniemon Mm = new muniemon();

        	System.out.println("bienvenido al menu de creacion");
        	System.out.println("pulse 1 para crear el munimon ");
        	System.out.println("pulse 2 para mostrar el munimon");
        	System.out.println("pulse 3 para salir del programa");
        int opcion = muni.nextInt();
        
       switch (opcion) {
	case 1:
			System.out.println("introduzca el nombre del muniemon");
			Mm.setNombre(muni.next());	
			
			System.out.println("introduzca la vida del munimon");
			Mm.setVida(muni.nextInt());
			
			System.out.println("introduzca el ataque");
			Mm.setAtaque(muni.next());
			
			System.out.println("introduzca los puntos de defensa");
			Mm.setDefensa(muni.nextInt());
			
			System.out.println("introduza el tipo del munimon");
			System.out.println("Estos son Agua, Fuego, Tierra, Planta");
			Mm.setTipo(Tipo.valueOf(muni.nextLine()));
		
		break;

	default:
		break;
	}
        	
        
            


	}

	
}
