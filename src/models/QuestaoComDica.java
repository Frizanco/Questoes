package models;

public class QuestaoComDica extends QuestaoSimples{
	private String dica;

	public QuestaoComDica(String enunciado, String resposta, String dica) {
		super(enunciado, resposta);
		this.dica = dica;
	}

	public String getDica() {
		return dica;
	}
	public void setDica(String dica) {
		this.dica = dica;
	}
	
	public String aplicarQuestao() {
		return "P: "+enunciado+"\nDica: "+dica;
	}
}
