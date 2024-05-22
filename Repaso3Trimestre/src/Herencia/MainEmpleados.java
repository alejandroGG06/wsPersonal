package Herencia;

import java.util.ArrayList;
import java.util.List;

public class MainEmpleados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleado emp1=new Programador("carlos", 23, 1200,10,9);
		Empleado em2= new Gerente("alejandro", 22, 1500, 12);
		
		List<Empleado>Empleados= new ArrayList<Empleado>();
		Empleados.add(emp1);
		Empleados.add(em2);
		
		for (Empleado empleado : Empleados) {
			System.out.println(empleado);
			System.out.println("salario del empleado: "+ empleado.salario());
			
		}
		
	}

}
