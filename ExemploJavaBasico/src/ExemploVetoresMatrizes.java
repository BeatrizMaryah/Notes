
public class ExemploVetoresMatrizes {

	public static void main(String[] args) {
		
		//vetores 
		
		int vetor[] = new int[10];
		
		vetor[0] = 10; //A posição 0 guardará o valor 10 e assim por diante
		vetor[1] = 9;
		vetor[2] = 8;
		vetor[3] = 7;
		vetor[4] = 6;
		vetor[5] = 5;
		vetor[6] = 4;
		vetor[7] = 3;
		vetor[8] = 2;
		vetor[9] = 1;
		
		System.out.println(vetor[5]);
		
		//for normal
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
		
		//for each
		for (int i : vetor) {
			System.out.println(i);
		}
		
		String nome[] = {"Maria", "José", "Ronaldo"};
		
		System.out.println(nome[2]);
		
		//Matrizes		
		int matriz[][] = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
	
		//for normal
		for (int i = 0; i < matriz.length; i++) {
		    System.out.printf("linha " + (i+1) + ": "); //Mostra em que linha está
		    
		    for (int j = 0; j < matriz[i].length; j++) {
		       System.out.printf(matriz[i][j] + ", "); //Imprime o valor alocado na linha i + coluna j.
		    }
		    
		    System.out.printf("\n"); //Pula a linha
		 }
	}
}
