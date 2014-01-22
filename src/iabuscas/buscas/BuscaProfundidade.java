package iabuscas.buscas;

import iabuscas.estrutura.Pilha;

import java.util.ArrayList;
import java.util.List;

public class BuscaProfundidade implements Busca{
	
	private List<Nodo> visitados = new ArrayList<>();
	private Pilha<Nodo> pilha = new Pilha<>();
	
	public Nodo buscar(Nodo nodoRoot, FuncaoSucessor funcaoSucessor){
		pilha.insere(nodoRoot);
		while(!pilha.isVazia()){
			Nodo nodo = pilha.remove();
			for(Nodo sucessor : funcaoSucessor.gerarSucessores(nodo)){
				if(sucessor.estado.isObjetivo()) return sucessor;
				
				if(!visitados.contains(sucessor)){
					visitados.add(sucessor);
					pilha.insere(sucessor);
				}
				else{
					pilha.remove();
				}
			}
		}
		return null;
	}
}
