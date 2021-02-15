import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class ManipuladorArquivo {

	public void escritor(String path, String frase) {
		try {		
				File arquivo = new File (path);
				arquivo.createNewFile();			
			
				FileWriter fw = new FileWriter(arquivo, true);
				BufferedWriter bw = new BufferedWriter(fw);				
				
				bw.write(frase);
				bw.newLine();
				
				bw.close();
				fw.close();
				
		}catch (IOException e) {
            e.printStackTrace();
        }			
	}
	
	public void leitor(String path) {
		try {
	       
			File arquivo = new File (path);
	        FileReader fr = new FileReader(arquivo);
	      
	        BufferedReader br = new BufferedReader(fr);	       
	        String linha = "";

	        while ( ( linha = br.readLine() ) != null) {	        
	        System.out.println(linha);
	    }			
	        fr.close();
	        br.close();
	        
		} catch (IOException e) {
	    	e.printStackTrace();
	    }
	}
}
