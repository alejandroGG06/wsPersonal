package Abstractas;

public abstract class Figura {

	public abstract double Area();
	public abstract double perimetro();
	
	@Override
	public String toString() {
		return "Figura [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	

}
