package _Pelea;

public class MainPElea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personaje p1= new Guerrero("Barbaro", 100, 10, TipoArma.Espada);
		Personaje p2 = new Mago("gargamel", 100, 6, TipoArma.Rezo);
	
	 // Inicio del combate
    while (p1.estaVivo() && p2.estaVivo()) {
    	
    	p1.atacar(p2);
    	 if (!p2.estaVivo()) {
             System.out.println(p1.nombre + " ha ganado el combate!");
             break;
         }

         // Turno del personaje 2
         p2.atacar(p1);
         if (!p1.estaVivo()) {
             System.out.println(p2.nombre + " ha ganado el combate!");
             break;
    	}
    }
	}
	}
   

 
