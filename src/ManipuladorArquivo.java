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
	
	public void criarTxt(String path) throws IOException {
		this.arquivo = new File (path);
		
		if (!this.arquivo.exists()) {
			
			this.arquivo.createNewFile();
			
			}else {
				
				this.arquivo.delete();
				this.arquivo.createNewFile();
				
			}
	}
	

	public void escritor(String frase) {
		try {													
			
				FileWriter fw = new FileWriter(this.arquivo, true);
				BufferedWriter bw = new BufferedWriter(fw);				
				
				bw.write(frase);
				bw.newLine();
				
				bw.close();
				fw.close();
				
		}catch (IOException e) {
            e.printStackTrace();
        }			
	}
	
	
	public void leitor() {
		try {
	       
			FileReader fr = new FileReader(this.arquivo);
	      
	        BufferedReader br = new BufferedReader(fr);       
	        
	        while( br.ready() ){				
				String linha = br.readLine();
				this.listaFrases.add(linha);				
				}             
	        
	        fr.close();
	        br.close();
	        
		} catch (IOException e) {
	    	e.printStackTrace();
	    }
	}
	
}
