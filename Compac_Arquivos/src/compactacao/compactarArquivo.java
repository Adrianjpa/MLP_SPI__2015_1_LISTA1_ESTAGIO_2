package compactacao;

import java.io.*;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/**
 * Esta classe serve para compactar um arquivo no formato txt para gz e verificar se realmente foi compactado
 * @author Adriano Barbosa Quaresma - adrianjpa@gmail.com
 * @since 1.5
 * @version 1.0
 * @date 07/05/2015
 */

public class compactarArquivo {
	/**
	 * 
	 * @param args Descrição do parâmetro de entrada deste método
	 * @throws IOException Exceções que o método lança
	 */

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new FileReader("relatorio.txt"));
		BufferedOutputStream bos = new BufferedOutputStream(
				new GZIPOutputStream(new FileOutputStream("relatorio.gz")));
		try {

			int a;
			while ((a = br.read()) != -1) {
				bos.write(a);

			}

			BufferedReader br2 = new BufferedReader(new InputStreamReader(
					new GZIPInputStream(new FileInputStream("relatorio.gz"))));
			String l;

			while ((l = br2.readLine()) != null) {
				System.out.println(l);
			}
			
			br2.close();

		} catch (Exception e) {

		} finally {

			br.close();
			bos.close();

		}

	}
}