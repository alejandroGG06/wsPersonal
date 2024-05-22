package _Pelea;

public class Curandero extends Personaje{

	public Curandero(String nombre, int puntosVida, int sabiduria, TipoArma arma) {
		super(nombre, puntosVida, sabiduria, arma);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected int obtenerDanioBase() {
		// TODO Auto-generated method stub
		return 6;
	}

}
