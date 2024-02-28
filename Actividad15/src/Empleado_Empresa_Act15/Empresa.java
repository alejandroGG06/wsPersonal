package Empleado_Empresa_Act15;



public class Empresa {
	String nombre;
	String nif;
	Empleado[] empleado;

	public Empresa() {
		super();
	}

	public Empresa(String nombre, String nif, Empleado[] empleados) {
		super();
		this.nombre = nombre;
		this.nif = nif;
		this.empleado = empleados;
	}

	public String toString() {
		String result = "Nombre de la empresa: " + nombre + "\nNIF: " + nif + "\nTrabajadores:\n";

		for (Empleado emp : empleado) {
			result += emp.nombre.toString() + " dni " + emp.dni + " salario " + emp.salario + "\n";
		}

		return result;
	}

	public void Empleados() {

		for (Empleado emp : empleado) {
			String result = emp.nombre.toString() + " dni " + emp.dni + " salario " + emp.salario + "\n";
			System.out.println("los empleados con sus datos son: " + result);

		}
	}

	public boolean empleadoDni(String dni) {

		for (Empleado emp : empleado) {
			if (emp.dni.contains(dni)) {
				return true;
			}

		}
		return false;
	}

	public int total() {
		return empleado.length;
	}

	public double salarioTotal() {
		double total = 0.0;
		for (Empleado emp : empleado) {
			total += emp.salario;
		}
		return total;
	}

	public double masDe3k() {
		double count = 0.0;
		for (Empleado emp : empleado) {
			if (emp.salario > 3.000) {
				count++;

			}
		}
		return count++;
	}

	public double masDeSMI() {
		double count = 0.0;
		for (Empleado emp : empleado) {
			if (emp.salario * 12 < 15.876) {
				count++;
			}
		}
		return count++;
	}

	public boolean dniValido() {

		for (Empleado emp : empleado) {
			String dni = emp.dni;
			if (!emp.validar(dni)) {
				return false;
			}
		}
		return true;
	}
	public boolean empIguales (Empresa otraEmpresa) {
		return this.nombre.equals(otraEmpresa.nombre) && this.nif.equals(otraEmpresa.nif); 
		
	
		
	}

}
