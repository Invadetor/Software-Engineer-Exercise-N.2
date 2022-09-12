import Boundary.FormProprietario;
import Control.AttivitaController;
import Entity.Agenda;
import Entity.Attivita;
import Entity.Progetto;

public class main {
    public static void main (String[] args) {
        /*Progetto p1 = new Progetto("progetto num. 1");
        Agenda.getAgenda().addProgetto(p1);
        AttivitaController.aggiungiAttivita("attivita p1, n1", "24/02/2100", p1.getNome());
        AttivitaController.aggiungiAttivita("attivita p1, n2", "11/05/2100", p1.getNome());
        Progetto p2 = new Progetto("progetto num. 2");
        Agenda.getAgenda().addProgetto(p2);
        AttivitaController.aggiungiAttivita("attivita p2, n1", "12/10/2105", p2.getNome());
        AttivitaController.aggiungiAttivita("attivita p2, n2", "28/02/2105", p2.getNome());
        Progetto p3 = new Progetto("progetto num. 3");
        Agenda.getAgenda().addProgetto(p3);
        AttivitaController.aggiungiAttivita("attivita p3, n1", "09/07/2110", p3.getNome());
        AttivitaController.aggiungiAttivita("attivita p3, n2", "01/01/2110", p3.getNome());



        for(Attivita a : AttivitaController.visualizzaAttivita()) {
            System.out.println(a.getNome());
            System.out.println(a.getData());
            System.out.println(a.getNumero_ordine());
        }

        for(Attivita a : AttivitaController.visualizzaAttivitaProgetto(p2.getNome())) {
            System.out.println(a.getNome());
            System.out.println(a.getData());
            System.out.println(a.getNumero_ordine());
        }*/

        FormProprietario f = new FormProprietario();
        f.AggiungiHandler();
    }
}
