import java.io.IOException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) throws IOException {
		ManipuladorArquivo arq = new ManipuladorArquivo();
		ManipuladorFrases frases = new ManipuladorFrases();		
		
		
		int i = 1;
		
		Scanner lerString = new Scanner(System.in);
		Scanner lerInt = new Scanner(System.in);
		
		arq.criarTxt();
		
		do {
			
			System.out.println("\nQual frase voc� deseja adicionar?");
			String frase = lerString.nextLine();
			
			arq.escritor(frase);
			
			 System.out.println("\nDeseja adicionar mais uma frase? Digite: ");
		     System.out.println("1 - Sim");
		     System.out.println("2 - N�o");
		     i = lerInt.nextInt();	     
		     
			
		} while(i != 2);
		
		
		System.out.println("\n______________________________________________\n");		
		System.out.println("A frases escritas no txt foram: \n");
		arq.leitor();
		
		System.out.println("\n______________________________________________\n");		
		System.out.println("A lista de frases digitadas foram: ");		
		System.out.println(arq.listaFrases);
		
		frases.inverterFrases(arq.listaFrases);
		
		System.out.println("\n______________________________________________\n");
		
		System.out.println("A nova lista de frases ficou: ");
		System.out.println(frases.novaLista);
		
		frases.transformarEmTexto();
		
		System.out.println("\n______________________________________________\n");
		
		System.out.println("\nAs frases em forma de texto ficaram: \n");		
		System.out.println(frases.texto);
		
		lerString.close();
		lerInt.close();
	}
}
