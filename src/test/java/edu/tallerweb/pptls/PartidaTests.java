package edu.tallerweb.pptls;

import static org.junit.Assert.*;

import org.junit.Test;

public class PartidaTests {
	/**
	 * Representa los casos donde gana el jugadorUno
	 */
	@Test
	public void quePiedraAplastaLagarto() {

		Mano jugadorUno = new Mano(Forma.PIEDRA);
		Mano jugadorDos = new Mano(Forma.LAGARTO);

		assertEquals("Piedra aplasta lagarto", Resultado.GANA,
				jugadorUno.jugarCon(jugadorDos));

	}

	@Test
	public void quePiedraAplastaTijera() {

		Mano jugadorUno = new Mano(Forma.PIEDRA);
		Mano jugadorDos = new Mano(Forma.TIJERA);

		assertEquals("Piedra aplasta tijera", Resultado.GANA,
				jugadorUno.jugarCon(jugadorDos));

	}

	@Test
	public void queSpockVaporizaPiedra() {

		Mano jugadorUno = new Mano(Forma.SPOCK);
		Mano jugadorDos = new Mano(Forma.PIEDRA);

		assertEquals("Spock vaporiza piedra", Resultado.GANA,
				jugadorUno.jugarCon(jugadorDos));
	}

	@Test
	public void queSpockDestrozaTijera() {

		Mano jugadorUno = new Mano(Forma.SPOCK);
		Mano jugadorDos = new Mano(Forma.TIJERA);

		assertEquals("Spock destroza tijera", Resultado.GANA,
				jugadorUno.jugarCon(jugadorDos));
	}

	@Test
	public void quePapelCubrePiedra() {

		Mano jugadorUno = new Mano(Forma.PAPEL);
		Mano jugadorDos = new Mano(Forma.PIEDRA);

		assertEquals("Papel cubre piedra", Resultado.GANA,
				jugadorUno.jugarCon(jugadorDos));
		
	}

	@Test
	public void quePapelRefutaSpock() {

		Mano jugadorUno = new Mano(Forma.PAPEL);
		Mano jugadorDos = new Mano(Forma.SPOCK);

		assertEquals("Papel refuta Spock", Resultado.GANA,
				jugadorUno.jugarCon(jugadorDos));

	}

	@Test
	public void queLagartoEnvenenaSpock() {

		Mano jugadorUno = new Mano(Forma.LAGARTO);
		Mano jugadorDos = new Mano(Forma.SPOCK);

		assertEquals("Lagarto envenena Spock", Resultado.GANA,
				jugadorUno.jugarCon(jugadorDos));

	}

	@Test
	public void queLagartoComePapel() {

		Mano jugadorUno = new Mano(Forma.LAGARTO);
		Mano jugadorDos = new Mano(Forma.PAPEL);

		assertEquals("Lagarto come Papel", Resultado.GANA,
				jugadorUno.jugarCon(jugadorDos));

	}

	@Test
	public void queTijeraCortaPapel() {

		Mano jugadorUno = new Mano(Forma.TIJERA);
		Mano jugadorDos = new Mano(Forma.PAPEL);

		assertEquals("Tijera corta Papel", Resultado.GANA,
				jugadorUno.jugarCon(jugadorDos));
	}

	@Test
	public void queTijeraDecapitaLagarto() {

		Mano jugadorUno = new Mano(Forma.TIJERA);
		Mano jugadorDos = new Mano(Forma.LAGARTO);

		assertEquals("Tijera decapita lagarto", Resultado.GANA,
				jugadorUno.jugarCon(jugadorDos));

	}

	/**
	 * Representa los casos donde pierde el jugadorUno
	 */

	public void quePiedraEsVaporizadaPorSpock() {

		Mano jugadorUno = new Mano(Forma.PIEDRA);
		Mano jugadorDos = new Mano(Forma.SPOCK);

		assertEquals("Piedra es vaporizada por Spock", Resultado.PIERDE,
				jugadorUno.jugarCon(jugadorDos));
	}

	@Test
	public void quePiedraSeaCubiertaPorPapel() {

		Mano jugadorUno = new Mano(Forma.PIEDRA);
		Mano jugadorDos = new Mano(Forma.PAPEL);

		assertEquals("Piedra es cubierta por Papel", Resultado.PIERDE,
				jugadorUno.jugarCon(jugadorDos));

	}

	@Test
	public void queSpockSeaRefutadoPorPapel() {

		Mano jugadorUno = new Mano(Forma.SPOCK);
		Mano jugadorDos = new Mano(Forma.PAPEL);

		assertEquals("Spock es refutafo por Papel", Resultado.PIERDE,
				jugadorUno.jugarCon(jugadorDos));

	}

	@Test
	public void queSpockSeaEnvenenadoPorLagarto() {

		Mano jugadorUno = new Mano(Forma.SPOCK);
		Mano jugadorDos = new Mano(Forma.LAGARTO);

		assertEquals("Spock es envenenado por Lagarto", Resultado.PIERDE,
				jugadorUno.jugarCon(jugadorDos));

	}

	@Test
	public void quePapelSeaComidoPorLagarto() {

		Mano jugadorUno = new Mano(Forma.PAPEL);
		Mano jugadorDos = new Mano(Forma.LAGARTO);

		assertEquals("Papel es comido por Lagarto", Resultado.PIERDE,
				jugadorUno.jugarCon(jugadorDos));

	}

	@Test
	public void quePapelSeaCortadaPorTijera() {

		Mano jugadorUno = new Mano(Forma.PAPEL);
		Mano jugadorDos = new Mano(Forma.TIJERA);

		assertEquals("Papel es cortada por Tijera", Resultado.PIERDE,
				jugadorUno.jugarCon(jugadorDos));

	}

	@Test
	public void queLagartoSeaAplastadoPorPiedra() {

		Mano jugadorUno = new Mano(Forma.LAGARTO);
		Mano jugadorDos = new Mano(Forma.PIEDRA);

		assertEquals("Lagarto es aplastado por Piedra", Resultado.PIERDE,
				jugadorUno.jugarCon(jugadorDos));

	}

	@Test
	public void queLagartoSeaDecapitadoPorTijera() {

		Mano jugadorUno = new Mano(Forma.LAGARTO);
		Mano jugadorDos = new Mano(Forma.TIJERA);

		assertEquals("Lagarto es decapitado por Tijera", Resultado.PIERDE,
				jugadorUno.jugarCon(jugadorDos));

	}

	@Test
	public void queTijeraSeaAplastadaPorPiedra() {

		Mano jugadorUno = new Mano(Forma.TIJERA);
		Mano jugadorDos = new Mano(Forma.PIEDRA);

		assertEquals("Tijera es aplastada por Piedra", Resultado.PIERDE,
				jugadorUno.jugarCon(jugadorDos));

	}

	@Test
	public void queTijeraSeaDestrosadaPorSpock() {

		Mano jugadorUno = new Mano(Forma.TIJERA);
		Mano jugadorDos = new Mano(Forma.SPOCK);
		
		assertEquals("Tijera es destrozada por Spock", Resultado.PIERDE,
				jugadorUno.jugarCon(jugadorDos));

	}

	/**
	 * Representa los casos donde empatan ambos jugadores
	 */
	@Test
	public void quePiedraSeaIgualPiedra() {
		Mano jugadorUno = new Mano(Forma.PIEDRA);
		Mano jugadorDos = new Mano(Forma.PIEDRA);
		assertEquals("Piedra empata con Piedra", Resultado.EMPATA,
				jugadorUno.jugarCon(jugadorDos));
	}

	@Test
	public void queSpockSeaIgualSpock() {
		Mano jugadorUno = new Mano(Forma.SPOCK);
		Mano jugadorDos = new Mano(Forma.SPOCK);
		assertEquals("Spock empata con Spock ", Resultado.EMPATA,
				jugadorUno.jugarCon(jugadorDos));
	}

	@Test
	public void quePapelSeaIgualPapel() {
		Mano jugadorUno = new Mano(Forma.PAPEL);
		Mano jugadorDos = new Mano(Forma.PAPEL);
		assertEquals("Papel empata con Papel", Resultado.EMPATA,
				jugadorUno.jugarCon(jugadorDos));
	}

	@Test
	public void queLagartoSeaIgualLagarto() {
		Mano jugadorUno = new Mano(Forma.LAGARTO);
		Mano jugadorDos = new Mano(Forma.LAGARTO);
		assertEquals("Lagarto empata con Lagarto", Resultado.EMPATA,
				jugadorUno.jugarCon(jugadorDos));
	}

	@Test
	public void queTijeraSeaIgualTijera() {
		Mano jugadorUno = new Mano(Forma.TIJERA);
		Mano jugadorDos = new Mano(Forma.TIJERA);
		assertEquals("Tijera empata con Tijera", Resultado.EMPATA,
				jugadorUno.jugarCon(jugadorDos));
	}

}
