package iabuscas.exemplos.torrehanoi;

import java.util.ArrayList;
import java.util.List;

import iabuscas.buscas.FuncaoSucessor;
import iabuscas.buscas.Nodo;

public class TorreFuncaoSucessor implements FuncaoSucessor {

	@Override
	public List<Nodo> gerarSucessores(Nodo nodo) {
		List<Nodo> sucessores = new ArrayList<>();
		
		TorreEstado estado = (TorreEstado) nodo.getEstado();
		
		return sucessores;
	}

}
