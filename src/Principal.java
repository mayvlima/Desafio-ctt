import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		ManipuladorArquivo arq = new ManipuladorArquivo();
		
		String path = "/Users/limav/Desktop/Desafio-ctt/src/texto.txt";
		
		int i = 1;
		
		Scanner lerString = new Scanner(System.in);
		Scanner lerInt = new Scanner(System.in);
		
		do {
			
			System.out.println("Qual frase você deseja adicionar?");
			String frase = lerString.nextLine();
			
			arq.escritor(path, frase);
			
			 System.out.println("Deseja adicionar mais uma frase? Digite: ");
		     System.out.println("1 - Sim");
		     System.out.println("2 - Não");
		     i = lerInt.nextInt();
			
		}while(i != 2);
		
		arq.leitor(path);
		
		lerString.close();
		lerInt.close();
	}
}
