
public class Actividad03 {
	public static void main(String[] args) {
		// Conversion de Enter a flotante

		int entero01 = 10;
		float float1;

		float1 = entero01;

		System.out.println(float1);
		// En este caso no haria falta hacer un casting ya se encuentrar en el mismo
		// rango de accion los 2
		// por lo que no seria necesario hacerlo.
//----------------------------------------------------------------------------------------------------------------------------------------
		// Flotante a Entero

		float float2 = 12.0F;
		int entero2;
		entero2 = (int) float2;
		System.out.println(entero2);

		// En este caso si nos hace falta hacer un cast, ya que el valor float tiene
		// decimales y los enteros no llevan
		// por lo cual perdemos la informacion de los decimales de el float

//-------------------------------------------------------------------------------------------------------------------------------------------		
		// Conversion Double a Entero

		double double1 = 10_000_000;
		int entero3;

		entero3 = (int) double1;

		System.out.println(entero3);

		// En este caso hace falta hacer un casting ya que el valor de double es
		// demasiado grande para el entero, por lo que tenemos que hacerlo

//----------------------------------------------------------------------------------------------------------------------------------------		
		// Conversion de Entero a Double

		int entero4 = 8_000;
		double double2;
		double2 = entero4;

		System.out.println(double2);

		// En este caso no es necesario, ya que el valor es mas pequeño y cabe
		// perfectamente en los doubles

//-----------------------------------------------------------------------------------------------------------------------------
		// Conversion de Char a Entero

		char char1 = 'g';
		int entero5;
		entero5 = char1;
		System.out.println(entero5);
		// En este caso no se pasa como deberia ser, ya que pasa su valor a decimal, y
		// no en caracteres que es como lo necesitamos

//---------------------------------------------------------------------------------------------------------------------		
		// Conversion de Entero a Char

		int entero6 = 100;
		char char2;
		char2 = (char) entero6;
		System.out.println(char2);

		// En este caso no se pasa como es, ya que pasa el numero a su letra
		// respectivamente

//---------------------------------------------------------------------------------------------------------------------------
		// Conversion de Cadena a Entero

		String String1 = "buenas tardes";
		int entero7;
		// entero = (int)String1; // Este nos da error desde el principio, ya que no son
		// valores compatibles

//----------------------------------------------------------------------------------------------------------------------------		

		// Conversion de cadena a Char

		String String2 = " buenos dias";
		char char3;

		// char3 =(char)String2; // Este tampoco funcionará, ya que son valores de
		// caracter diferentes, uno es para 1 sola letra y el otro es para cadenas de
		// letras

	}

}
