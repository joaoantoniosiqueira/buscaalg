package iabuscas.exemplos.missionarioscanibais;

import iabuscas.agente.Acao;

public class MCAcao implements Acao {

	private String descricao;
	
	public MCAcao(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	@Override
	public int getCusto() {
		return 1;
	}

	@Override
	public String toString() {
		return descricao;
	}
}
