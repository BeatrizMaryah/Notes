import javax.swing.JOptionPane;

public class ExemploJOpitonPane {

	public static void main(String[] args) {
		
		//Exemplo de utiliza��o das caixas de Input, Confirma��o e Mensagem:
		
		String nome = null;
		int resposta;
		
		nome = JOptionPane.showInputDialog("Qual � o seu nome?"); //Pergunta o nome
		resposta = JOptionPane.showConfirmDialog(null, "O seu nome � " + nome + "?"); //Pede para confirmar o nome
		
		System.out.println(resposta); // yes - 0, no - 1, cancel -2
		
		if (resposta == JOptionPane.YES_OPTION) { // verifica se o usu�rio clicou no bot�o YES
		    JOptionPane.showMessageDialog(null, "Seu nome � " + nome); //Clicou no yes
		} else {
			JOptionPane.showMessageDialog(null, "Seu nome n�o � " + nome); //N�o clicou no yes
		}
		
		String[] opcoes = { "Op��o 1", "Op��o 2", "Op��o 3" }; //O primeiro item ser� 0, o segundo 1 e assim por diante

		int opcao = JOptionPane.showOptionDialog(null, "Mensagem Central", "Sub",
				JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);
	
		//Verifica qual a opcao que foi clicada
		if(opcao == 0) { 
			JOptionPane.showMessageDialog(null, "Voc� clicou na op��o 1");
		} else if (opcao == 1) {
			JOptionPane.showMessageDialog(null, "Voc� clicou na op��o 2");
		} else {
			JOptionPane.showMessageDialog(null, "Voc� clicou na op��o 3");
		}
	
		JOptionPane.showMessageDialog(null, "Mensagem de informa��o", "Informa��o!", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "Mensagem de aviso", "Aviso!", JOptionPane.WARNING_MESSAGE);
		JOptionPane.showMessageDialog(null, "Mensagem de erro", "Erro!", JOptionPane.ERROR_MESSAGE);
	}
}
