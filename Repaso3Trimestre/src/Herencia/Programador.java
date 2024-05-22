package Herencia;

public class Programador extends Empleado{
	int horasExtras;
	int pagoExtra;
	
	public Programador(String nombre, int edad, double salarioBase, int horasExtras, int pagoExtra) {
		super(nombre, edad, salarioBase);
		this.horasExtras = horasExtras;
		this.pagoExtra = pagoExtra;
	}

	@Override
	public String toString() {
		return "Programador [horasExtras=" + horasExtras + ", pagoExtra=" + pagoExtra + ", nombre=" + nombre + ", edad="
				+ edad + ", salarioBase=" + salarioBase + "]";
	}

	@Override
	public double salario() {
		// TODO Auto-generated method stub
		return super.salario()+(horasExtras*pagoExtra);
	}
	
	
	

}
