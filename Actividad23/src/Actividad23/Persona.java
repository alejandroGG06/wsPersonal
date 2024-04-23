package Actividad23;

public class Persona {
	private String nombre;
	private int edad;
	private double peso;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public Persona(String nombre, int edad, double peso) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;

	}

	public Persona() {
		super();
	}

	@Override
	public String toString() {
		return "Persona nombre=" + nombre + ", edad=" + edad + ", peso=" + peso;
	}


	
	}
	


