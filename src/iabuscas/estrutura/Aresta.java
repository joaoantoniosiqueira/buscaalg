package iabuscas.estrutura;

public abstract class Aresta {

	Vertice v1, v2;

	public Aresta(Vertice v1, Vertice v2) {		
		this.v1 = v1;
		this.v2 = v2;
	}
	
	@Override
	public String toString() {
		return v1 + " <-> " + v2;
	}
}
