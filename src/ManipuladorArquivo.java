import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class ManipuladorArquivo {
	
	public ArrayList<String> listaFrases = new ArrayList<String>();
	public File arquivo;
	public final String PATH = "C:/Users/limav/Desktop/Desafio-ctt/src/texto.txt";
	
	public void criarTxt() throws IOException {
		this.arquivo = new File (PATH);
		
		if (!this.arquivo.exists()) {
			
			this.arquivo.createNewFile();
			
			}else {
				
				this.arquivo.delete();
				this.arquivo.createNewFile();
				
			}
	}
	

	public void escritor(String frase) {
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(this.arquivo, true))) {
			
				bw.write(frase);
				bw.newLine();			
				
		}catch (IOException e) {
            e.printStackTrace();
        }			
	}
	
	
	public void leitor() {
		try(BufferedReader br = new BufferedReader(new FileReader(this.arquivo))) { 	        
	       
			String linha = br.readLine();
			//retorna um nulo se não tiver uma linha
			
			while(linha != null){
				System.out.println(linha);				
				this.listaFrases.add(linha);
				linha = br.readLine();
			}
	        
		} catch (IOException e) {
	    	e.printStackTrace();
	    }
	}
	
}
