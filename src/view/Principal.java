package view;

import javax.swing.JOptionPane;

import br.edu.fateczl.erick.pilhastring.Pilha;
import controller.ControllerPalindromo;

public class Principal {

	public static void main(String[] args) {
		Pilha p = new Pilha();
		ControllerPalindromo pC = new ControllerPalindromo();
		
		String inverte = null;
		boolean validaStr;
		
		String entrada = JOptionPane.showInputDialog("Digite uma palavra");

		try {
			inverte = pC.invertePalavra(p, entrada);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		validaStr = pC.comparaPalavras(entrada, inverte);
		
		if(validaStr) {
			System.out.println("A palavra " +entrada+ " � igual a "+inverte+ " ent�o � um pal�ndromo");
		}else {
			System.out.println("A palavra " +entrada+ " n�o � igual a "+inverte+ " ent�o n�o � um pal�ndromo");
		}
	}

}