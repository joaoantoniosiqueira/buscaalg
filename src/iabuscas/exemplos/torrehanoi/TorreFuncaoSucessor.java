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
		
		TorreEstado torreEstado1 = new TorreEstado(estado);
		if (torreEstado1.pino1.size() > 0) {
			torreEstado1.pino2.add(torreEstado1.pino1.remove(torreEstado1.pino1.size() - 1));
			if(torreEstado1.isAcaoValida()){
				sucessores.add(new Nodo(torreEstado1, nodo, new TorreAcao("Disco " + torreEstado1.pino2.get(torreEstado1.pino2.size() - 1) + " no pino 2")));
			}
		}
		
		TorreEstado torreEstado2 = new TorreEstado(estado);
		if (torreEstado2.pino1.size() > 0) {
			torreEstado2.pino3.add(torreEstado2.pino1.remove(torreEstado2.pino1.size() - 1));
			if(torreEstado2.isAcaoValida()){
				sucessores.add(new Nodo(torreEstado2, nodo, new TorreAcao("Disco " + torreEstado2.pino3.get(torreEstado2.pino3.size() - 1) + " no pino 3")));
			}
		}
		
		TorreEstado torreEstado3 = new TorreEstado(estado);
		if (torreEstado3.pino2.size() > 0) {
			torreEstado3.pino1.add(torreEstado3.pino2.remove(torreEstado3.pino2.size() - 1));
			if(torreEstado3.isAcaoValida()){
				sucessores.add(new Nodo(torreEstado3, nodo, new TorreAcao("Disco " + torreEstado3.pino1.get(torreEstado3.pino1.size() - 1) + " no pino 1")));
			}
		}
		
		TorreEstado torreEstado4 = new TorreEstado(estado);
		if (torreEstado4.pino2.size() > 0) {
			torreEstado4.pino3.add(torreEstado4.pino2.remove(torreEstado4.pino2.size() - 1));
			if(torreEstado4.isAcaoValida()){
				sucessores.add(new Nodo(torreEstado4, nodo, new TorreAcao("Disco " + torreEstado4.pino3.get(torreEstado4.pino3.size() - 1) + " no pino 3")));
			}
		}
		
		TorreEstado torreEstado5 = new TorreEstado(estado);
		if (torreEstado5.pino3.size() > 0) {
			torreEstado5.pino1.add(torreEstado5.pino3.remove(torreEstado5.pino3.size() - 1));
			if(torreEstado5.isAcaoValida()){
				sucessores.add(new Nodo(torreEstado5, nodo, new TorreAcao("Disco " + torreEstado5.pino1.get(torreEstado5.pino1.size() - 1) + " no pino 1")));
			}
		}
		
		TorreEstado torreEstado6 = new TorreEstado(estado);
		if (torreEstado6.pino3.size() > 0) {
			torreEstado6.pino2.add(torreEstado6.pino3.remove(torreEstado6.pino3.size() - 1));
			if(torreEstado6.isAcaoValida()){
				sucessores.add(new Nodo(torreEstado6, nodo, new TorreAcao("Disco " + torreEstado6.pino2.get(torreEstado6.pino2.size() - 1) + " no pino 2")));
			}
		}
		
		return sucessores;
	}
}
