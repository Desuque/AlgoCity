package fiuba.algo3.algocity.excepciones;

public class RegionFueraDeLosLimites extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public RegionFueraDeLosLimites() {
		super("La regi�n elegida supera los limites del mapa");
	}
}
