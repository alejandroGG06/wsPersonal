package Abstractas;

public class Cuadrado extends Figura {

	protected int lado;
	
	

	@Override
	public String toString() {
		return "Cuadrado [lado=" + lado + "]";
	}

	public Cuadrado(int lado) {
		super();
		this.lado = lado;
	}

	@Override
	public double Area() {
		// TODO Auto-generated method stub
		return lado*lado;
	}

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return 2*lado+lado;
	}

}
