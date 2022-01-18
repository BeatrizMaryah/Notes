import javax.swing.JOptionPane;

public class ExemploJOpitonPane {

	public static void main(String[] args) {
		
		//Exemplo de utilização das caixas de Input, Confirmação e Mensagem:
		
		String nome = null;
		int resposta;
		
		nome = JOptionPane.showInputDialog("Qual é o seu nome?"); //Pergunta o nome
		resposta = JOptionPane.showConfirmDialog(null, "O seu nome é " + nome + "?"); //Pede para confirmar o nome
		
		System.out.println(resposta); // yes - 0, no - 1, cancel -2
		
		if (resposta == JOptionPane.YES_OPTION) { // verifica se o usuário clicou no botão YES
		    JOptionPane.showMessageDialog(null, "Seu nome é " + nome); //Clicou no yes
		} else {
			JOptionPane.showMessageDialog(null, "Seu nome não é " + nome); //Não clicou no yes
		}
		
		String[] opcoes = { "Opção 1", "Opção 2", "Opção 3" }; //O primeiro item será 0, o segundo 1 e assim por diante

		int opcao = JOptionPane.showOptionDialog(null, "Mensagem Central", "Sub",
				JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);
	
		//Verifica qual a opcao que foi clicada
		if(opcao == 0) { 
			JOptionPane.showMessageDialog(null, "Você clicou na opção 1");
		} else if (opcao == 1) {
			JOptionPane.showMessageDialog(null, "Você clicou na opção 2");
		} else {
			JOptionPane.showMessageDialog(null, "Você clicou na opção 3");
		}
	
		JOptionPane.showMessageDialog(null, "Mensagem de informação", "Informação!", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "Mensagem de aviso", "Aviso!", JOptionPane.WARNING_MESSAGE);
		JOptionPane.showMessageDialog(null, "Mensagem de erro", "Erro!", JOptionPane.ERROR_MESSAGE);
	}
}
