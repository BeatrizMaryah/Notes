
public class ExemploEstruturasControle {

	public static void main(String[] args) {
	
		//Aritméticos
		int a = 3;
		int b = 6;
		int c = 6;
		
		System.out.println(a + b); //Soma
		System.out.println(a - b); //Subtração
		System.out.println(a * b); //Multiplicação
		System.out.println(a / b); //Divisão
		System.out.println(a % b); //Resto da divisão
		
		System.out.println((b + c) / a);
		
		//If, else, operadores relacionais e lógicos
		
		if (b > a) {
			System.out.println("b é maior");
		} else {
			System.out.println("b é menor");
		}
		
		if (b <= c) {
			System.out.println("b é maior ou igual a c");
		} else {
			System.out.println("b não é maior ou igual a c");
		}
		
		if(a < b && b == c) {
			System.out.println("a é menor que b E b é igual a c");
		}
		
		if(b < a || c > a) {
			System.out.println("b é menor que a OU c é maior que a");
		}
		
		if(!(c > b)) {
			System.out.println("se c NÃO for maior que b");
		}
		
		int opcao = 3;
		
		//Uma cadeia de if e else apensa para comparar, não é uma boa prática
		if(opcao == 1) {
			System.out.println("Primeira opção");
		} else if (opcao == 2) {
			System.out.println("Segunda opção");
		} else if(opcao == 3) {
			System.out.println("Terceira opção");
		}
		
		//Switch case
		switch(opcao) {
			case 1:
				System.out.println("Primeira opção");
				break;
			case 2:
				System.out.println("Segunda opção");
				break;
			case 3:
				System.out.println("Terceira opção");
				break;
			default:
				System.out.println("Outra opcao");
				break;
		}
		
		//If ternário
		System.out.println((a < 2) ? "a é menor que 2" : "a não é menor que 2");
	}
}
