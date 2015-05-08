package Adivinhar;

import javax.swing.JOptionPane;


/**
 * Esta classe representa uma estrutura de um jogo onde tem que adivinhar o n�mero �mpar sorteado pelo Computador.
 * @author Adriano Barbosa Quaresma - adrianjpa@gmail.com
 * @version 1.0
 * @since 1.5
 * @date 06/05/2015
 */
public class numImpar {
	
	
	private static String nome;
	private static int chutes;
	private static int tentativas;
	private static int sorteio;
	private static int botao;
	private static boolean cont = true;
	
	/**
	 * metodo principal da aplicacao responsavel por executar a mesma.
	 * @param Par�metro args
	 */
	public static void main(String[] args) {

		
		/**
		 * No objeto JOptionPane h� o m�todo que � respons�vel em criar a primeira caixa de di�logo requisitando a entrada de dados do Jogo pedindo o seu nome.
		 */
		nome = JOptionPane.showInputDialog(null, "Ol�, qual o seu nome?");

		/**
		 * La�o onde o computador conta os chutes, tentavivas e sorteia seu n�mero entre 1 e 50.
		 */
		while (cont) {

			chutes = 1;
			tentativas = 1;
			sorteio = (int) (1 + Math.random() * 50);

			/**
			 * Instru��o para que o computador sorteie n�meros �mpares entre 1 e 50.
			 */
			if (sorteio % 2 == 1) {

				/**
				 * No objeto JOptionPane h� o m�todo que � respons�vel em criar outra caixa de di�logo requisitando ao jogador que digite algum n�mero.
				 */
				tentativas = Integer.parseInt(JOptionPane.showInputDialog(null,	"Vamos come�ar! Voc� tem 10 tentativas para acertar. Qual o n�mero?"));

				/**
				 * La�o onde o computador checa as tentativas em um total de 10. 
				 */
				while (tentativas != sorteio && chutes < 10)
				{
					
					/**
					 * Instru��o que cont�m o objeto JOptionPane onde h� um m�todo que � respons�vel em criar outra caixa de di�logo com dicas, caso o n�mero que o usu�rio digitar for
					 * maior ou menor que o n�mero que foi escolhido pelo computador.
					 */
					if (tentativas < sorteio)
						JOptionPane.showMessageDialog(null,	"Chute um numero maior " + nome + ".");
																		
					else
						JOptionPane.showMessageDialog(null,	"Tente um numero menor " + nome + ".");
					tentativas++;
					chutes++;
					tentativas = Integer.parseInt(JOptionPane.showInputDialog(
							null, "Qual o n�mero? "));
				}

				/**
				 * Instru��o que cont�m o objeto JOptionPane onde h� um m�todo que � respons�vel em criar uma caixa de di�logo avisando se o usu�rio acertou, em quantas tentativas
				 * encontrou o numero e pergunta se que jogar novamente.
				 */
				if (tentativas == sorteio) {
					JOptionPane.showMessageDialog(null, "Parab�ns " + nome
							+ " voc� acertou em " + chutes + " tentativa(s)");
					botao = JOptionPane.showConfirmDialog(null,
							"Gostaria de jogar novamente " + nome + "?",
							"Jogo Adivinha��o", JOptionPane.YES_NO_OPTION);
					
					/**
					 * Instru��es que cont�m objetos JOptionPane com op��es, caso clique em SIM voltar� a jogar novamente, caso n�o, encerrar� o jogo.
					 */
					if (botao == JOptionPane.YES_OPTION)
						cont = true;

					else
						cont = false;
					
					
				}else
					botao = JOptionPane.showConfirmDialog(null,"Acabaram suas chances!Quer Jogar de novo?",
							"Jogo Adivinha��o", JOptionPane.YES_NO_OPTION);

				
				if (botao == JOptionPane.YES_OPTION)
					cont = true;

				else
					cont = false;

			}

		}
	}
}
