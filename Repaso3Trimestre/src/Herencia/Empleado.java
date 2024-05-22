package Herencia;

public class Empleado {
	protected String nombre;
	protected int edad;
	protected double salarioBase;

	public Empleado(String nombre, int edad, double salarioBase) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.salarioBase = salarioBase;

	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", edad=" + edad + ", salarioBase=" + salarioBase + "]";
	}

	public double salario() {
		return salarioBase;
	}
}
