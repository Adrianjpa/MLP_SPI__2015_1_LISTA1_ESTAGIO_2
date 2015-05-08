package Entrada;

	import java.io.BufferedReader;
	import java.io.BufferedWriter;
	import java.io.FileOutputStream;
	import java.io.IOException;
	import java.io.InputStreamReader;
	import java.io.OutputStreamWriter;
/**
 * 
 * @author Adriano Barbosa Quaresma - adrianjpa@gmail.com
 * @version 1.0
 * @date 07/05/2015
 *
 */
	public class Dados {
		
		/**
		 * 
		 @param args Descrição do parâmetro de entrada deste método
		 * @throws IOException Exceções que o método lança
		 */
	    
	    public static void main(String[] args) throws IOException {
	    	
	    	InputStreamReader isr = new InputStreamReader(System.in);
	    	BufferedReader br = new BufferedReader(isr);
	        FileOutputStream fos = new FileOutputStream("entradaDados.txt");
	        OutputStreamWriter osw = new OutputStreamWriter(fos);
	        BufferedWriter bw = new BufferedWriter(osw);
	        String a = br.readLine();

	        try {
	            bw.write(a, 0, a.length());

	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            if (fos != null)
	                bw.close();
	            	
	        }

	    }

	}

	

