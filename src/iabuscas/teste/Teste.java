package iabuscas.teste;

import iabuscas.estrutura.Grafo;
import iabuscas.estrutura.GrafoNaoDirigido;

public class Teste {

	public static void main(String[] args) {
		
		Grafo grafo = new GrafoNaoDirigido();
		
		grafo.criarVertice(1);
		grafo.criarVertice(2);
		grafo.criarVertice(3);
		grafo.criarVertice(4);
		grafo.criarVertice(5);
		grafo.criarVertice(6);
		
		grafo.criarAresta(1, 2);
		grafo.criarAresta(1, 5);
		
		grafo.criarAresta(2, 5);
		grafo.criarAresta(2, 3);
		//grafo.criarAresta(2, 1);
		
		grafo.criarAresta(3, 4);
		
		grafo.criarAresta(4, 5);
		grafo.criarAresta(4, 6);
		
		System.out.println(grafo);
	}

}
