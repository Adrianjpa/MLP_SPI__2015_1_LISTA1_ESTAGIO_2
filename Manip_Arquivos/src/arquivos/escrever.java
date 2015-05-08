package arquivos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Esta classe escreve no arquivo (licen�a.txt).
 * @author Adriano Barbosa Quaresma - adrianjpa@gmail.com
 * @version 1.0
 * @date 06/05/2015
 */
public class escrever {
	
/**
 * 
 * @param args Descri��o do par�metro de entrada deste m�todo
 * @throws IOException Exce��es que o m�todo lan�a
 */
	public static void main(String[] args) throws IOException{
		
	
	File escrita = new File("licen�a.txt");
	FileWriter fw = null;
	BufferedWriter bw = null;

	try {
	
		fw = new FileWriter(escrita);
		bw = new BufferedWriter(fw);
		
		bw.write("LICN889930");
		
		bw.newLine();
		
				
		
		}catch (Exception e) {
			e.printStackTrace();
			
	}finally{
		
		bw.close();
		fw.close();
		
	}
	}
}


