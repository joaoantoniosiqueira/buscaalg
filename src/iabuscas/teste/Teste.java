package iabuscas.teste;

import iabuscas.buscas.Busca;
import iabuscas.buscas.BuscaEmLargura;
import iabuscas.buscas.BuscaProfundidade;
import iabuscas.buscas.Nodo;
import iabuscas.exemplos.missionarioscanibais.MCAcao;
import iabuscas.exemplos.missionarioscanibais.MCEstado;
import iabuscas.exemplos.missionarioscanibais.MCFuncaoSucessor;

public class Teste {

	public static void main(String[] args) {

		MCEstado estado = new MCEstado(3, 3, 'E', 0, 0);

		Nodo nodo = new Nodo(estado, new MCAcao("Estado incical"));
		
		Busca busca = new BuscaEmLargura();
		
		Nodo resultado = busca.buscar(nodo, new MCFuncaoSucessor());
		
		resultado.imprimeBackTrace();
		System.out.println("Custo total: " + resultado.getCusto());
	}
}
