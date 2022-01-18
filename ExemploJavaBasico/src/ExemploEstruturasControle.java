
public class ExemploEstruturasControle {

	public static void main(String[] args) {
	
		//Aritm�ticos
		int a = 3;
		int b = 6;
		int c = 6;
		
		System.out.println(a + b); //Soma
		System.out.println(a - b); //Subtra��o
		System.out.println(a * b); //Multiplica��o
		System.out.println(a / b); //Divis�o
		System.out.println(a % b); //Resto da divis�o
		
		System.out.println((b + c) / a);
		
		//If, else, operadores relacionais e l�gicos
		
		if (b > a) {
			System.out.println("b � maior");
		} else {
			System.out.println("b � menor");
		}
		
		if (b <= c) {
			System.out.println("b � maior ou igual a c");
		} else {
			System.out.println("b n�o � maior ou igual a c");
		}
		
		if(a < b && b == c) {
			System.out.println("a � menor que b E b � igual a c");
		}
		
		if(b < a || c > a) {
			System.out.println("b � menor que a OU c � maior que a");
		}
		
		if(!(c > b)) {
			System.out.println("se c N�O for maior que b");
		}
		
		int opcao = 3;
		
		//Uma cadeia de if e else apensa para comparar, n�o � uma boa pr�tica
		if(opcao == 1) {
			System.out.println("Primeira op��o");
		} else if (opcao == 2) {
			System.out.println("Segunda op��o");
		} else if(opcao == 3) {
			System.out.println("Terceira op��o");
		}
		
		//Switch case
		switch(opcao) {
			case 1:
				System.out.println("Primeira op��o");
				break;
			case 2:
				System.out.println("Segunda op��o");
				break;
			case 3:
				System.out.println("Terceira op��o");
				break;
			default:
				System.out.println("Outra opcao");
				break;
		}
		
		//If tern�rio
		System.out.println((a < 2) ? "a � menor que 2" : "a n�o � menor que 2");
	}
}
