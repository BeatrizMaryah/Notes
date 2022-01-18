
public class ExemploEstruturasRepeticao {

	public static void main(String[] args) {
		
		int numero = 0;
		
		System.out.println("While");
		
		//While para contar até 10
		while(numero < 10) {
			numero += 1;
			System.out.println(numero);
		}
		
		numero = 0;
		System.out.println("Do while");
		
		//Do while para contar até 10
		do {
			numero += 1;
			System.out.println(numero);
		} while(numero < 10);
		
		System.out.println("For");
		
		//For para contar até 10
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
	}
}
