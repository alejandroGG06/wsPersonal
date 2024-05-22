package Abstractas;

public class Circulo extends Figura{

	protected double radio;
	
	
	
	
	@Override
	public String toString() {
		return "Circulo [radio=" + radio + "]";
	}

	public Circulo(double radio) {
		super();
		this.radio = radio;
	}

	@Override
	public double Area() {return Math.PI *(this.radio*this.radio);
		// TODO Auto-generated method stub
		
	}

	@Override
	public double perimetro() {return 2 *Math.PI* this.radio;
		// TODO Auto-generated method stub
		
	}

}
