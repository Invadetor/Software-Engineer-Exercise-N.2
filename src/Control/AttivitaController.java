package Control;

import Entity.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class AttivitaController {

	/**
	 * @param attivita
	 * @param data
	 * @param progetto
	 */


	public static void aggiungiAttivita(String attivita, String data, String progetto) {
		Date data1;
		try{
			data1 = new SimpleDateFormat("dd/MM/yyyy").parse(data);
			Calendar calendar = Calendar.getInstance();
			calendar.set(Calendar.HOUR_OF_DAY, 0);
			Date today = calendar.getTime();
			if (data1.after(today)) {
				if(Agenda.getAgenda().verificaProgetto(progetto)){
					Progetto p = Agenda.getAgenda().getProgetto(progetto);
					p.creaAttivita(attivita, data);
				}
			}
		} catch (ParseException e){e.printStackTrace();}
	}

	public static void aggiungiProgetto (String progetto) {
		Progetto p = new Progetto(progetto);
		Agenda.getAgenda().addProgetto(p);
	}

	public static ArrayList<Attivita> visualizzaAttivita() {
		return Agenda.getAgenda().getAttivita();
	}

	public static ArrayList<Attivita> visualizzaAttivitaProgetto(String progetto) { return Agenda.getAgenda().getAttivitaProgetto(progetto); }

}