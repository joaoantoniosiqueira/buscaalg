package iabuscas.estrutura;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Vertice {

	Set<Aresta> arestas;
	private int id;
	
	public Vertice(int id) {
		this.arestas = new HashSet<>();
		this.id = id;
	}
	
	public void addAresta(Aresta a){
		arestas.add(a);
	}
	
	public int getId(){
		return this.id;
	}
	
	public List<Vertice> getAdjacentes(){
		List<Vertice> adj = new ArrayList<>();
		for(Aresta a : arestas){
			if(a.v1 == this){
				adj.add(a.v2);
			}
			else{
				adj.add(a.v1);
			}
		}
		return adj;
	}
	
	public Map<Vertice, Integer> getCustoAdjacentes(){
		Map<Vertice, Integer> adj = new HashMap<>();
		for(Aresta a : arestas){
			ArestaComValor comValor = (ArestaComValor) a;
			if(a.v1 == this){
				adj.put(a.v2, comValor.custo);
			}
			else{
				adj.put(a.v1, comValor.custo);
			}
		}
		return adj;
	}
	
	public Set<Aresta> getArestas(){
		return arestas;
	}
	
	@Override
	public String toString() {
		return String.valueOf(id);
	}
}
