package pack;

import java.util.LinkedList;

/**
 * 
 * @author Cristian Zanna
 *
 */

public class Maitre extends Cameriere implements Servizio, ServiPortata {
	private LinkedList<String> clienti;
	
	public Maitre(LinkedList<String> clienti) {
		setClienti(clienti);
	}

	public LinkedList<String> getClienti() {
		return clienti;
	}

	protected void setClienti(LinkedList<String> clienti) {
		this.clienti = clienti;
	}
}