package iabuscas.estrutura;

public class ArestaNaoDirigida extends Aresta{

	public ArestaNaoDirigida(Vertice v1, Vertice v2) {
		super(v1, v2);
		v1.addAresta(this);
		v2.addAresta(this);
	}

}
