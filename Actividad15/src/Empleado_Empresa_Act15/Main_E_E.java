package Empleado_Empresa_Act15;

public class Main_E_E {
	public static void main(String[] args) {

		Empleado emp1 = new Empleado("Juan", "12345678P", 2.500);
		Empleado emp2 = new Empleado("Ana", "98765432P", 3.100);
		Empleado emp3 = new Empleado("Pedro", "11122233Y", 1.000);

		Empleado[] trabajadoresEmpresa1 = { emp1, emp2, emp3 };

		Empleado emp4 = new Empleado("Maria", "444555666M", 3.850);
		Empleado emp5 = new Empleado("Carlos", "777888999I", 2.225);
		Empleado emp6 = new Empleado("Laura", "666777888I", 3.000);

		Empleado[] trabajadoresEmpresa2 = { emp4, emp5, emp6 };

		Empresa empresa1 = new Empresa("apple", "12345678X", trabajadoresEmpresa1);
		Empresa empresa2 = new Empresa("leroy merlin", "98765432Y", trabajadoresEmpresa2);

		Empresa[] empresas = { empresa1, empresa2 };

		for (Empresa empresa : empresas) {
			System.out.println("---- Datos de la Empresa ----");
			System.out.println(empresa.toString());
			System.out.println("---- Datos de los empleados ----");
			empresa.Empleados();
			System.out.println("el empleado existe? " + empresa1.empleadoDni("98765432s"));
			System.out.println("");
			System.out.println("total de trabajadores " + empresa.total());
			System.out.println("");
			System.out.println("el total de los salarios de la empresa 1 son: es: " + empresa1.salarioTotal());
			System.out.println("");
			System.out.println("el numero de empleados que ganan mas de 3000 son: " + empresa1.masDe3k());
			System.out.println("");
			System.out.println("la cantidad de empleados que ganan menos SMI son:" + empresa1.masDeSMI());
			System.out.println("");
			System.out.println("los empleados son validos?: "+ empresa1.dniValido());
			System.out.println("");
			System.out.println("las empresas son iguales? " + empresa1.empIguales(empresa2));
		}	
			
	}
}
