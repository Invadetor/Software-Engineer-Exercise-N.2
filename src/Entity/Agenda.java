package Entity;

import java.lang.reflect.Array;
import java.util.*;

public class Agenda {

	ArrayList<Progetto> progetti;
	private String nome;
	private String cognome;
	private int telefono;

	private static Agenda agenda = null;

	/**
	 * @param progetto
	 */

	public boolean verificaProgetto(String progetto) {
		for(Progetto p : progetti) {
			if(p.getNome().equals(progetto)) {
				return true;
			}
		}
		return false;
	}

	private Agenda() {}

	public void aggiungiAttivita(Progetto progetto){
		this.progetti.add(progetto);
	}

	public void addProgetto(Progetto p) {
		if(progetti == null) {
			progetti = new ArrayList<>();
		}
		progetti.add(p);
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public Progetto getProgetto(String progetto){
		for(Progetto p : progetti) {
			if(Objects.equals(p.getNome(), progetto)) {
				return p;
			}
		}
		return null;
	}

	public ArrayList<Attivita> getAttivita() {
		ArrayList<Attivita> completo = new ArrayList<>();
		for(Progetto p : progetti) {
			completo.addAll(p.attivita);
		}
		return completo;
	}

	public ArrayList<Attivita> getAttivitaProgetto(String progetto) {
		for(Progetto p : progetti) {
			if(p.getNome().equals(progetto)) {
				return p.attivita;
			}
		}
		return null;
	}

	public static void setAgenda(Agenda agenda) {
		Agenda.agenda = agenda;
	}

	public static Agenda getAgenda() {
		if(agenda == null) {
			agenda = new Agenda();
		}
		return agenda;
	}

}