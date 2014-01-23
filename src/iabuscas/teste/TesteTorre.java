package iabuscas.teste;

import iabuscas.buscas.Busca;
import iabuscas.buscas.BuscaEmLargura;
import iabuscas.buscas.BuscaProfundidade;
import iabuscas.buscas.FuncaoSucessor;
import iabuscas.buscas.Nodo;
import iabuscas.exemplos.torrehanoi.TorreAcao;
import iabuscas.exemplos.torrehanoi.TorreEstado;
import iabuscas.exemplos.torrehanoi.TorreFuncaoSucessor;

public class TesteTorre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TorreEstado estado = new TorreEstado(3);
		Nodo nodo = new Nodo(estado, new TorreAcao("Estado Inicial"));
		
		FuncaoSucessor funcaoSucessor = new TorreFuncaoSucessor();
		Busca busca = new BuscaEmLargura();
		
		Nodo solucao = busca.buscar(nodo, funcaoSucessor); 
		
		solucao.imprimeBackTrace();
		System.out.println(solucao.getCusto());
	}
}
