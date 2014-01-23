package iabuscas.exemplos.torrehanoi;

import java.util.ArrayList;
import java.util.List;

import iabuscas.agente.Estado;

public class TorreEstado implements Estado {

	public List<Integer> pino1, pino2, pino3;
	public int discos;
	
	public TorreEstado(int discos) {
		this.pino1 = new ArrayList<>();
		this.pino2 = new ArrayList<>();
		this.pino3 = new ArrayList<>();
		
		for(int i = discos; i > 0; i--){
			pino1.add(i);
		}
		this.discos = discos;
	}
	
	@Override
	public boolean isObjetivo() {
		return (isOrdenada(pino3) && discos == pino3.size());
	}

	@Override
	public boolean isAcaoValida() {
		return (isOrdenada(pino1) && isOrdenada(pino2) && isOrdenada(pino3));
	}

	public boolean isOrdenada(List<Integer> pino){
		
		for (int i = 0; i < pino.size() - 1; i++) {
			if(pino.get(i) < pino.get(i + 1)) return false;
		}
		return true;
	}
	
	@Override
	public String toString() {
		return "Pino 1: " + pino1.toString() + "\nPino 2: " + pino2.toString() + "\nPino 3: " + pino3.toString();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof TorreEstado)) return false;
		TorreEstado estado = (TorreEstado) obj;
		return estado.toString().equals(this.toString());
	}
}
