package iabuscas.exemplos.torrehanoi;

import iabuscas.agente.Acao;

public class TorreAcao implements Acao {

	private String descricao; 
	
	@Override
	public int getCusto() {
		return 1;
	}

	public String getDescricao() {
		return descricao;
	}

	@Override
	public String toString() {
		return descricao;
	}

}
