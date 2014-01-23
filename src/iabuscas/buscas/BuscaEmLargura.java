package iabuscas.buscas;

import java.util.ArrayList;
import java.util.List;

import iabuscas.estrutura.Fila;

public class BuscaEmLargura implements Busca{
	
//	public Nodo buscar(Nodo nodoRoot, FuncaoSucessor funcaoSucessor){
//		Fila<Nodo> fila = new Fila<>();
//		List<Nodo> visitados = new ArrayList<>();
//		
//		//adicionando o nó root como visitado
//		fila.insere(nodoRoot);
//		while(!fila.isVazia()){
//			Nodo nodo = fila.remove();
//			List<Nodo> sucessores = funcaoSucessor.gerarSucessores(nodo);
//			for(Nodo sucessor : sucessores){
//				if(!visitados.contains(sucessor)){
//					Nodo newNodo = new Nodo(sucessor.estado, nodo, sucessor.acao);
//					if(sucessor.estado.isObjetivo()){
//						return newNodo;
//					}
//					fila.insere(newNodo);
//					visitados.add(sucessor);
//				}
//			}
//		}
//		return nodoRoot;
//	}
	
	public Nodo buscar(Nodo nodoRoot, FuncaoSucessor funcaoSucessor){
		Fila<Nodo> fila = new Fila<>();
		List<Nodo> visitados = new ArrayList<>();		
		
		visitados.add(nodoRoot);
		fila.insere(nodoRoot);
		
		while(!fila.isVazia()){
			Nodo nodo = fila.remove();
			for(Nodo sucessor : funcaoSucessor.gerarSucessores(nodo)){
				if(!visitados.contains(sucessor)){
					if(sucessor.estado.isObjetivo()){
						return sucessor;
					}
					visitados.add(sucessor);
					fila.insere(sucessor);
				}
				else if(fila.contemElemento(sucessor)){
					if(sucessor.estado.isObjetivo()){
						return sucessor;
					}
				}
			}
		}
		return null;
	}
}
