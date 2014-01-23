package iabuscas.buscas;

import iabuscas.agente.Acao;
import iabuscas.agente.Estado;

public class Nodo{

	Estado estado;
	Nodo noPai;
	Acao acao;
	int profundidade;
	int custo; //custo por ter gerado o nodo (todo o caminho)
	
	public Nodo(Estado estado, Acao acao){
		this.estado = estado;
		this.noPai = null;
		this.acao = acao;
		this.profundidade = 0;
		this.custo = 0;
	}
	
	public Nodo(Estado estado, Nodo pai, Acao acao){
		this.estado = estado;
		this.noPai = pai;
		this.acao = acao;
		this.profundidade = noPai.getProfundidade() + 1;
		this.custo = noPai.getCusto() + acao.getCusto();
	}
	
	public Estado getEstado() {
		return estado;
	}

	public Nodo getNoPai() {
		return noPai;
	}

	public Acao getAcao() {
		return acao;
	}

	public int getProfundidade() {
		return profundidade;
	}

	public int getCusto() {
		return custo;
	}
	
	@Override
	public String toString() {
		return estado.toString() + " --> " + acao.toString();
	}
	
	public void imprimeBackTrace(){
		if(noPai != null){
			 noPai.imprimeBackTrace();
			 System.out.println(toString());
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((estado == null) ? 0 : estado.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Nodo other = (Nodo) obj;
		if (estado == null) {
			if (other.estado != null)
				return false;
		} else if (!estado.equals(other.estado))
			return false;
		return true;
	}
}
