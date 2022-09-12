package Entity;

public class Attivita {

	private String data;
	private int numero_ordine;
	private String nome;

	public Attivita(String data, int numero_ordine, String nome) {
		this.data = data;
		this.numero_ordine = numero_ordine;
		this.nome = nome;
	}

	public String getData() {
		return data;
	}

	public int getNumero_ordine() {
		return numero_ordine;
	}

	public String getNome() {
		return nome;
	}

}