package iabuscas.estrutura;

public class GrafoNaoDirigido extends Grafo {

	@Override
	public void criarAresta(int i, int j) {
		Vertice v1 = vertices.get(i);
		Vertice v2 = vertices.get(j);
		new ArestaNaoDirigida(v1, v2);
	}

	@Override
	public void criarAresta(int i, int j, int custo) {
		Vertice v1 = new Vertice(i);
		Vertice v2 = new Vertice(j);
		new ArestaNaoDirigidaComValor(v1, v2, custo);
	}

}
