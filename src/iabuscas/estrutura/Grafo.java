package iabuscas.estrutura;

import java.util.HashMap;
import java.util.Map;

public abstract class Grafo {

	Map<Integer, Vertice> vertices = new HashMap<>();
	
	public void addVertice(Vertice v){
		vertices.put(v.getId(), v);
	}
	
	public void criarVertice(int id){
		addVertice(new Vertice(id));
	}
	
	public Vertice getVertice(int id){
		return vertices.get(id);
	}
	
	public abstract void criarAresta(int i, int j);
	
	public abstract void criarAresta(int i, int j, int custo);
	
	@Override
	public String toString() {
		StringBuffer out = new StringBuffer();
		for(Vertice v : vertices.values()){
			out.append(v.getId() + ": " + v.getAdjacentes() + "\n");
		}
		return out.toString();
	}
}
