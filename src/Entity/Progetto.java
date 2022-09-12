package Entity;

import java.util.*;

public class Progetto {

	public ArrayList<Attivita> attivita;
	private String nome;


	/**
	 * @param attivita
	 * @param data
	 */

	public void creaAttivita(String attivita, String data) {
		int numOrdine;
		if(this.attivita == null) {
			this.attivita = new ArrayList<>();
		}
		if(this.attivita.isEmpty()) {
			numOrdine = 1;
		} else {
			numOrdine = this.attivita.get(this.attivita.size()-1).getNumero_ordine() + 1;
		}
		Attivita a = new Attivita(data, numOrdine, attivita);
		this.attivita.add(a);
	}

	public Progetto(String nome) {
		this.nome = nome;
	}

	public Progetto(ArrayList<Attivita> attivita, String nome) {
		this.attivita = attivita;
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void aggiungiAttivita(Attivita attivita){
		this.attivita.add(attivita);
	}

}