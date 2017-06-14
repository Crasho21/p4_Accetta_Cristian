package p4_accetta_cristian_uc_4_5_13;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
/**
 * Classe per gestire il click dei pulsanti
 * @author Accetta Cristian
 */
public class ButtonListener implements ActionListener{

	private Sistema sistema;
	public ButtonListener(Sistema s){
		super();
		sistema = s;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		if(b.getText().equals("Crea un gruppo")){
			sistema.creazioneGruppo();
		}
		else if(b.getText().equals("Cancella un gruppo")){
			sistema.cancellazioneGruppo();
		}
		else{
			JOptionPane.showMessageDialog(null, "Tasto " + b.getText() + " premuto!");
		}
	}
}
