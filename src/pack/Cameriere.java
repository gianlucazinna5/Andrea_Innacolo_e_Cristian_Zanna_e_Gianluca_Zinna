package pack;

import java.util.LinkedList;

/**
 * 
 * @author Cristian Zanna
 *
 */

public class Cameriere extends Personale implements Servizio, ServiPortata{
	private LinkedList<Ordinazione> ordinazioni;
	
	public Cameriere(String nome, int valutazione) {
		super(nome, valutazione);
	}
	
	public void putOrdinazione(Ordinazione ordinazione) {
		ordinazioni.add(ordinazione);
	}
	
	public Ordinazione pullOrdinazione() {
		return ordinazioni.getFirst();
	}	
}
