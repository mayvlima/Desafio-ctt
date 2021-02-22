import java.util.ArrayList;
import java.util.Random;

public class ManipuladorFrases {
	public ArrayList<String> novaLista = new ArrayList<String>();
	String texto = "";	
		
	
	public void inverterFrases(ArrayList<String> listaFrases) {
		Random random = new Random();
		
		this.novaLista = listaFrases;		

		for (int i=0; i < this.novaLista.size(); i++) {
			
			int j = random.nextInt(this.novaLista.size());			
			String temp = this.novaLista.get(i);
			
			this.novaLista.set(i,this.novaLista.get(j));
			this.novaLista.set(j, temp);
			
		}
	}
	
	
	public void transformarEmTexto() {
	
		for(String frase: this.novaLista) {
			this.texto += frase + "\n";
		}
	}
	
}
