package Empleado_Empresa_Act15;

public class Empleado {

	String nombre;
	String dni;
	double salario;

	public Empleado() {
		super();
	}

	public Empleado(String nombre, String dni, double salario) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.salario = salario;
	}

	public String Tostring() {
		return "empleado:" + nombre + " dni: " + dni + "salario" + salario;
	}

	public boolean validar(String DNI) {
		return DNI.matches("^[0-9]{8}[A-Z-a-z]{1}$");
	}

	public void masOmenos(Empleado otroEmpleado) {

		if (this.salario > otroEmpleado.salario) {
			System.out.println("El salario es mayor");
		} else if (this.salario < otroEmpleado.salario) {
			System.out.println("el salario es menor");
		} else {
			System.out.println("El salario es igual");

		}

	}

	public boolean iguales(Empleado OtroTrabajador) {
		return this.nombre.equals(OtroTrabajador.nombre) && this.dni.equals(OtroTrabajador.dni)
				&& (this.salario == OtroTrabajador.salario);

	}
	
}
