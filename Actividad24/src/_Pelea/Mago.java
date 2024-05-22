package _Pelea;

public class Mago extends Personaje {

	public Mago(String nombre, int puntosVida, int inteligencia, TipoArma arma) {
		super(nombre, puntosVida, inteligencia, arma);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected int obtenerDanioBase() {
		// TODO Auto-generated method stub
		return 8;
	}

}
