package ui;
import models.QuestaoComDica;
import models.QuestaoMultiplaEscolha;
import models.QuestaoSimples;
import java.util.Scanner;

public class Universidade {
	public static void main(String args[]) {
	Scanner teclado = new Scanner(System.in);
		
		String R;
		int nota=0;
		
		QuestaoSimples q[] = new QuestaoSimples[10];
		q[0] = new QuestaoSimples("Qual o primeiro nome de: Joao Costa Silva ?", "Joao");
		q[1] = new QuestaoSimples("Qual a primeira letra da palavra: TECLADO ?", "T");
		q[2] = new QuestaoMultiplaEscolha("Escolha a alternativa correta (A, B, C, D). A capital do Brasil eh:", "A", "Brasilia", "Goias", "Goiania","Sao Paulo");
		q[3] = new QuestaoComDica("Qual a fruta que estou pensando agora", "Laranja", "Comeca com 'Laran' e termina com 'ja'.");
		q[4] = new QuestaoMultiplaEscolha("Com quantos paus se faz uma canoa ?", "D", "4", "3", "2", "1");
		q[5] = new QuestaoSimples("Qual o nome do professor de Java ?", "Isidro");
		q[6] = new QuestaoComDica("Qual o primeiro planeta do sistema Solar?", "Mercurio", "Nao eh Venus.");
		q[7] = new QuestaoComDica("Qual a cor do uniforme do Capitao America?", "Azul", "Nao eh vermelho e nem branco");
		q[8] = new QuestaoSimples("Quanto eh dois mais dois ?", "Quatro");
		q[9] = new QuestaoMultiplaEscolha("Quanto eh 8x8 ?", "C", "16", "56", "64", "88");
		
		// HORA DA PROVA
		System.out.println("HORA DA PROVA!!\nImportante: Todas as respostas que forem dadas com palavras, iniciar com Caixa Alta.\n\n");
		for (QuestaoSimples p : q) {
			System.out.println(p.aplicarQuestao());
			R = teclado.nextLine();
			
			if (p.Corrigir(R)) {
				nota++;
				System.out.println("Resposta correta! Nota atual: "+nota+"\n");
			}
			else {
				System.out.println("Errado. A resposta correta seria: "+p.getResposta()+". Nota atual: "+nota+"\n");
			}
		}
		
		System.out.println("NOTA FINAL: "+nota);
		
/*	Alternativamente, poderiamos fazer tudo  via interface grafica:
 * 		R = JOptionPane.showInputDialog(p.aplicarQuestao());
 * 		JOptionPane.showMessageDialog(null, "NOTA FINAL: "+nota);
 */
	}
}













