package Andrea_Innacolo_e_Cristian_Zanna_e_Gianluca_Zinna.src.pack;

public abstract class Personale {

	private String nome;
	private int valutazione;
	
	
	
	protected Personale(String nome, int valutazione) {
		super();
		this.nome = nome;
		this.valutazione = valutazione;
	}
	
	

	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getValutazione() {
		return valutazione;
	}
	public void setValutazione(int valutazione) {
		this.valutazione = valutazione;
	}
	
	
	
}
