import java.util.Scanner;

public class ExemploVariaveisScanner {

	public static void main(String[] args) {
		
		// Isso é um comentário!
		
		System.out.print("Imprime um valor sem pular a linha! ");
		
		System.out.println("Exemplo de código"); //Comando para imprimir na tela
	
		//Exemplo de variáveis
		char caractere = 'a';
		boolean verdadeiroOuFalso = true;
		byte numeroByte = 127;
		short numeroShort = 30000;
		int numeroInt = 2000000;
		long numeroLong = 900000000;
		float numeroFloat = 1.2f; //O f representa que é um float
		double numeroDouble = 1.23234; 
		
		String ExemploNome = "Maria Eduarda";
		
		System.out.println(ExemploNome); //Irá imprimir o valor de nome (Maria Eduarda)
		
		ExemploNome = "Roberto";
		
		System.out.println(ExemploNome);
		
		final short exemploDeFinal = 3;
		
//		exemploDeFinal = 4; --Da erro, pois seus dados que não devem ser alterados
	
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Qual é o seu nome?");
		String nome = sc.nextLine();
		
		System.out.println("Qual é a sua idade?");
		int idade = sc.nextInt();
		
		System.out.println("Você tem " + idade + " anos " + nome + "!");
	}
}
