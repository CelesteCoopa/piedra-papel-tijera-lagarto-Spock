package edu.tallerweb.pptls;

/**
 * Representa una de las Manos involucradas en el juego
 */
public class Mano {
	private Forma forma;
	private Integer mat[][] = { { 0, 2, 2, 1, 1 }, { 1, 0, 2, 2, 1 },
			{ 1, 1, 0, 2, 2 }, { 2, 1, 1, 0, 2 }, { 2, 2, 1, 1, 0 } };

	/**
	 * Toda Mano debe crearse con una forma dada, que será la que determine su
	 * condición en el juego.
	 * 
	 * @param forma
	 *            , la Forma que adopta la Mano.
	 */

	public Mano(final Forma forma) {
		this.forma = forma;
	}

	/**
	 * Evaluará el resultado de la partida según las reglas del juego.
	 * 
	 * @param otra
	 *            , la otra Mano.
	 * @return un Resultado, de acuerdo al estado del juego.
	 */

	public Resultado jugarCon(final Mano otra) {

		int res = mat[forma.getValor()][otra.forma.getValor()];

		switch (res) {
		case 0:
			return Resultado.EMPATA;
		case 1:
			return Resultado.GANA;
		case 2:
			return Resultado.PIERDE;
		}
		return null;

	}

}
