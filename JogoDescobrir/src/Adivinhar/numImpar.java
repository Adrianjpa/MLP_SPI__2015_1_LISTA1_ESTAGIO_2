package Adivinhar;

import javax.swing.JOptionPane;


/**
 * Esta classe representa uma estrutura de um jogo onde tem que adivinhar o número ímpar sorteado pelo Computador.
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
	 * @param Parâmetro args
	 */
	public static void main(String[] args) {

		
		/**
		 * No objeto JOptionPane há o método que é responsável em criar a primeira caixa de diálogo requisitando a entrada de dados do Jogo pedindo o seu nome.
		 */
		nome = JOptionPane.showInputDialog(null, "Olá, qual o seu nome?");

		/**
		 * Laço onde o computador conta os chutes, tentavivas e sorteia seu número entre 1 e 50.
		 */
		while (cont) {

			chutes = 1;
			tentativas = 1;
			sorteio = (int) (1 + Math.random() * 50);

			/**
			 * Instrução para que o computador sorteie números ímpares entre 1 e 50.
			 */
			if (sorteio % 2 == 1) {

				/**
				 * No objeto JOptionPane há o método que é responsável em criar outra caixa de diálogo requisitando ao jogador que digite algum número.
				 */
				tentativas = Integer.parseInt(JOptionPane.showInputDialog(null,	"Vamos começar! Você tem 10 tentativas para acertar. Qual o número?"));

				/**
				 * Laço onde o computador checa as tentativas em um total de 10. 
				 */
				while (tentativas != sorteio && chutes < 10)
				{
					
					/**
					 * Instrução que contém o objeto JOptionPane onde há um método que é responsável em criar outra caixa de diálogo com dicas, caso o número que o usuário digitar for
					 * maior ou menor que o número que foi escolhido pelo computador.
					 */
					if (tentativas < sorteio)
						JOptionPane.showMessageDialog(null,	"Chute um numero maior " + nome + ".");
																		
					else
						JOptionPane.showMessageDialog(null,	"Tente um numero menor " + nome + ".");
					tentativas++;
					chutes++;
					tentativas = Integer.parseInt(JOptionPane.showInputDialog(
							null, "Qual o número? "));
				}

				/**
				 * Instrução que contém o objeto JOptionPane onde há um método que é responsável em criar uma caixa de diálogo avisando se o usuário acertou, em quantas tentativas
				 * encontrou o numero e pergunta se que jogar novamente.
				 */
				if (tentativas == sorteio) {
					JOptionPane.showMessageDialog(null, "Parabéns " + nome
							+ " você acertou em " + chutes + " tentativa(s)");
					botao = JOptionPane.showConfirmDialog(null,
							"Gostaria de jogar novamente " + nome + "?",
							"Jogo Adivinhação", JOptionPane.YES_NO_OPTION);
					
					/**
					 * Instruções que contém objetos JOptionPane com opções, caso clique em SIM voltará a jogar novamente, caso não, encerrará o jogo.
					 */
					if (botao == JOptionPane.YES_OPTION)
						cont = true;

					else
						cont = false;
					
					
				}else
					botao = JOptionPane.showConfirmDialog(null,"Acabaram suas chances!Quer Jogar de novo?",
							"Jogo Adivinhação", JOptionPane.YES_NO_OPTION);

				
				if (botao == JOptionPane.YES_OPTION)
					cont = true;

				else
					cont = false;

			}

		}
	}
}
