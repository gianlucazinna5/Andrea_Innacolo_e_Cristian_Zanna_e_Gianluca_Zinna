package pack;

import java.util.LinkedList;

/**
 * 
 * @author Cristian Zanna
 *
 */

public class Maitre extends Personale implements Servizio, ServiPortata {
	private LinkedList<String> clienti;
	
	public Maitre() {
	}

	public LinkedList<String> getClienti() {
		return clienti;
	}
}