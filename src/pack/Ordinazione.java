package pack;

/**
 * 
 * @author Cristian Zanna
 *
 */

import java.util.LinkedList;

public class Ordinazione extends Cameriere implements Servizio, ServiPortata {
	private short numTavolo;
	private String orarioOrdinazione;
	private LinkedList<Pietanza> listaOrdnazione;
	
	public Ordinazione(short numTavolo, String orarioOrdinazione, LinkedList<Pietanza> listaOrdinazione) {
		
	}

	public short getNumTavolo() {
		return numTavolo;
	}

	protected void setNumTavolo(short numTavolo) throws InvalidParamException{
		if(numTavolo < 0 || numTavolo > Const.TAVOLI) {
			throw new InvalidParamException("Numero tavolo non valido");
		}
		this.numTavolo = numTavolo;
	}

	public String getOrarioOrdinazione() {
		return orarioOrdinazione;
	}

	public void setOrarioOrdinazione(String orarioOrdinazione) {
		this.orarioOrdinazione = orarioOrdinazione;
	}

	public LinkedList<Pietanza> getListaOrdnazione() {
		return listaOrdnazione;
	}

	public void setListaOrdnazione(LinkedList<Pietanza> listaOrdnazione) {
		if(listaOrdinazione == null) {
			throw new InvalidParamException("Necessaria una lista di pietanze");
		}
		this.listaOrdnazione = listaOrdnazione;
	}
	
	

}
