package Coche2;

public class coche {

	public  int id;
	public String matricula;
	public String marca;
	private static int contadorID;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public static int getContadorID() {
		return contadorID;
	}
	public static void setContadorID(int contadorID) {
		coche.contadorID = contadorID;
	}
	
	@Override
	public String toString() {
		return "coche [id=" + id + ", matricula=" + matricula + ", marca=" + marca + "]";
	}
	
	
	
	public coche() {
		this.id=1;
		this.id+=contadorID++;
		
	}
	
	public static void resetCont(){
		contadorID=0;
	}
	
	
	
	public static final String TOYOTA="Toyota";
	public static final String RENAULT="Renault";
	
	
}
