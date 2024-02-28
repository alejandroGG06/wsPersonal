package _Act13;

import java.lang.reflect.Array;

public class Mostar {

	public static void main(String[] args) {
		int[] array = new int[4];

		array[0] = 0;
		array[1] = 0;
		array[2] = 0;
		array[3] = 0;

		
		Usuarios u1 = new Usuarios(1,"alejo", array);
		u1.valoracion = array;
		array[0] = 3;
		array[1] = 4;
		array[2] = 2;
		array[3] = 9;

		Usuarios u2 = new Usuarios(3,"amdres", array);
		u2.valoracion = array;
		array[0] = 8;
		array[1] = 9;
		array[2] = 2;
		array[3] = 3;

		Usuarios u3 = new Usuarios(2,"alex", array);
		
		

		Usuarios[] arrayUsu;
		arrayUsu = new Usuarios[3];
		
		

		
		
		

	}
}
