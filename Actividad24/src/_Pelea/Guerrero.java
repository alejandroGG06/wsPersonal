package _Pelea;

public class Guerrero extends Personaje{

	public Guerrero(String nombre, int puntosVida, int fuerza, TipoArma arma) {
		super(nombre, puntosVida, fuerza, arma);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected int obtenerDanioBase() {
		// TODO Auto-generated method stub
		return 10;
	}

}
