import java.util.Scanner;

public class ExemploVariaveisScanner {

	public static void main(String[] args) {
		
		// Isso � um coment�rio!
		
		System.out.print("Imprime um valor sem pular a linha! ");
		
		System.out.println("Exemplo de c�digo"); //Comando para imprimir na tela
	
		//Exemplo de vari�veis
		char caractere = 'a';
		boolean verdadeiroOuFalso = true;
		byte numeroByte = 127;
		short numeroShort = 30000;
		int numeroInt = 2000000;
		long numeroLong = 900000000;
		float numeroFloat = 1.2f; //O f representa que � um float
		double numeroDouble = 1.23234; 
		
		String ExemploNome = "Maria Eduarda";
		
		System.out.println(ExemploNome); //Ir� imprimir o valor de nome (Maria Eduarda)
		
		ExemploNome = "Roberto";
		
		System.out.println(ExemploNome);
		
		final short exemploDeFinal = 3;
		
//		exemploDeFinal = 4; --Da erro, pois seus dados que n�o devem ser alterados
	
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Qual � o seu nome?");
		String nome = sc.nextLine();
		
		System.out.println("Qual � a sua idade?");
		int idade = sc.nextInt();
		
		System.out.println("Voc� tem " + idade + " anos " + nome + "!");
	}
}
