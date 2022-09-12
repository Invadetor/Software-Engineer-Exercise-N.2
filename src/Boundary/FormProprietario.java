package Boundary;

import Control.AttivitaController;
import Entity.Agenda;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormProprietario {

	private JTextField attivita;
	private JTextField data;

	private JTextField nomeProgettoAtt;
	private JTextField nomeProgetto;

	private JButton aggiungiPro;

	private JButton aggiungiAtt;

	private JFrame frame;

	private JLabel aggiuntoPro;
	private JLabel aggiuntoAtt;

	public void AggiungiHandler() {


		frame = new JFrame("Aggiungi Progetto e Attivita");
		frame.setVisible(true);
		frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
		frame.setSize(500, 600);

		aggiuntoAtt = new JLabel();
		aggiuntoAtt.setSize(150, 100);

		aggiuntoPro = new JLabel();
		aggiuntoPro.setSize(150, 100);


		nomeProgetto = new JTextField("nome del Progetto");
		nomeProgetto.setSize(150, 100);

		aggiungiPro = new JButton("Aggiungi il Progetto");
		aggiungiPro.setSize(150, 50);
		aggiungiPro.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				AttivitaController.aggiungiProgetto(nomeProgetto.getText());
				aggiuntoPro.setText("Aggiunto il Progetto" + nomeProgetto.getText());
			}
		});

		nomeProgettoAtt = new JTextField();
		nomeProgettoAtt.setSize(150, 100);

		attivita = new JTextField("nome attivita'");
		attivita.setSize(150, 100);

		data = new JTextField("data");
		data.setSize(150, 50);

		aggiungiAtt = new JButton("Aggiungi L'Attivita");
		aggiungiAtt.setSize(150, 50);
		aggiungiAtt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				AttivitaController.aggiungiAttivita(attivita.getText(), data.getText(), nomeProgettoAtt.getText());
				aggiuntoAtt.setText("Aggiunta l'attivita" + attivita.getText());
			}
		});

		frame.add(nomeProgetto);
		frame.add(aggiungiPro);
		frame.add(attivita);
		frame.add(data);
		frame.add(nomeProgettoAtt);
		frame.add(aggiungiAtt);
		frame.add(aggiuntoAtt);
		frame.add(aggiuntoPro);

	}

}