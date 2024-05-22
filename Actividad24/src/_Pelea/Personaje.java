package _Pelea;

public abstract class Personaje {
	protected String nombre;
    protected int puntosVida;
    protected int atributoEspecifico; 
    protected TipoArma arma;
    
    public Personaje(String nombre, int puntosVida, int atributoEspecifico, TipoArma arma) {
        this.nombre = nombre;
        this.puntosVida = puntosVida;
        this.atributoEspecifico = atributoEspecifico;
        this.arma = arma;
    }
    public void atacar(Personaje objetivo) {
        int danio = calcularDanio();
        System.out.println(nombre + " ataca a " + objetivo.nombre + " con " + arma + " y causa " + danio + " puntos de daño.");
        objetivo.recibirDanio(danio);
    }

    // Método para calcular el daño del ataque
    private int calcularDanio() {
        int danioBase = obtenerDanioBase();
        if (arma == TipoArma.Espada || arma == TipoArma.Arco || arma == TipoArma.Hechizo || arma == TipoArma.Rezo) {
            danioBase += atributoEspecifico; // Se añade el daño adicional si se usa un arma del tipo correspondiente al atributo específico
        }
        return danioBase;
    }

    // Método abstracto para obtener el daño base según el tipo de arma
  

    // Método para recibir daño
    public void recibirDanio(int danio) {
        puntosVida -= danio;
        if (puntosVida < 0) {
            puntosVida = 0;
        }
        System.out.println(nombre + " tiene " + puntosVida + " puntos de vida restantes.");
    }

    // Método para verificar si el personaje sigue vivo
    public boolean estaVivo() {
        return puntosVida > 0;
    }

    
    protected abstract int obtenerDanioBase();
}
