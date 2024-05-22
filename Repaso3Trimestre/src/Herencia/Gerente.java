package Herencia;

public class Gerente extends Empleado {
	

	private double bono;

	public Gerente(String nombre, int edad, double salarioBase, double bono) {
		super(nombre, edad, salarioBase);
		this.bono = bono;
	}
	

	@Override
	public String toString() {
		return "Gerente [bono=" + bono + ", nombre=" + nombre + ", edad=" + edad + ", salarioBase=" + salarioBase + "]";
	}


	@Override
	public double salario() {
		// TODO Auto-generated method stub
		return super.salario()+bono;
	}


	}


