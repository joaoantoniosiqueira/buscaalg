package iabuscas.teste;

import iabuscas.buscas.Nodo;
import iabuscas.exemplos.missionarioscanibais.MCAcao;
import iabuscas.exemplos.missionarioscanibais.MCEstado;
import iabuscas.exemplos.missionarioscanibais.MCFuncaoSucessor;

public class Teste {

	public static void main(String[] args) {
		
		MCEstado estado = new MCEstado(3, 3, 'E', 0, 0);
		
		Nodo nodo = new Nodo(estado, new MCAcao("Estado inicial"));
		
		System.out.println(nodo);
		
		MCFuncaoSucessor funcaoSucessor = new MCFuncaoSucessor();
		
		for(Nodo nodo2 : funcaoSucessor.gerarSucessores(nodo)){
			System.out.println(nodo2);
		}
	}

}
