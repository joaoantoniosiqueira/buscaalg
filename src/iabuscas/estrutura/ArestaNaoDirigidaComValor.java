package iabuscas.estrutura;

public class ArestaNaoDirigidaComValor extends ArestaComValor {

	public ArestaNaoDirigidaComValor(Vertice v1, Vertice v2, int custo) {
		super(v1, v2, custo);
		v1.addAresta(this);
		v1.addAresta(this);
	}

}
