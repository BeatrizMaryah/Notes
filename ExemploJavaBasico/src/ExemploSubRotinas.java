
public class ExemploSubRotinas {

	public static void main(String[] args) {
		
		int resultadoSoma = somaDoisNumeros(3, 4);
		System.out.println(resultadoSoma);
		
		mostrarMenu();
		
		boolean numero = isPar(3);
		System.out.println(numero);
		
		imprimirSeForPar(8);
	}
	
	public static int somaDoisNumeros(int numero1, int numero2) {
	    
		int soma = numero1 + numero2;
	    return soma;
	}
	
	public static void mostrarMenu() {
		
		System.out.println("===============MENU===============");
		System.out.println("Esse é um exemplo de menu que é reutilizável!");
		System.out.println("[Opções...]");
		System.out.println("==================================");
	}
	
	public static boolean isPar(int numero) {
		
		if((numero % 2) == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void imprimirSeForPar(int numero) {
		
		if(isPar(numero)) {
			System.out.println(numero + " é par!");
		} else {
			System.out.println(numero + "não é par.");
		}
	}
}
