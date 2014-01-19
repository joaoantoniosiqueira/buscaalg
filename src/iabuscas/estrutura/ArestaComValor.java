package iabuscas.estrutura;

public class ArestaComValor extends Aresta {

	int custo;
	
	public ArestaComValor(Vertice v1, Vertice v2, int custo) {
		super(v1, v2);
		this.custo = custo;
	}

	public int getCusto(){
		return this.custo;
	}
	
	@Override
	public String toString() {
		return v1 + " <- " + custo + " -> " + v2; 
	}
}
