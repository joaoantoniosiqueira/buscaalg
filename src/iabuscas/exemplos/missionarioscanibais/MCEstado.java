package iabuscas.exemplos.missionarioscanibais;

import iabuscas.agente.Estado;

public class MCEstado implements Estado {

	int MEsquerda, MDireita;
	int CEsquerda, CDireira;
	char barco;

	public MCEstado(int mEsquerda, int cEsquerda, char barco, int mDireita, int cDireira) {
		MEsquerda = mEsquerda;
		MDireita = mDireita;
		CEsquerda = cEsquerda;
		CDireira = cDireira;
		this.barco = barco;
	}

	public int getMEsquerda() {
		return MEsquerda;
	}

	public int getMDireita() {
		return MDireita;
	}

	public int getCEsquerda() {
		return CEsquerda;
	}

	public int getCDireira() {
		return CDireira;
	}

	public char getBarco() {
		return barco;
	}

	@Override
	public boolean isObjetivo() {
		return MEsquerda == 0 && CEsquerda == 0;
	}

	@Override
	public boolean isAcaoValida() {
		return (MEsquerda >= 0 && CEsquerda >= 0 && MDireita >= 0 && CDireira >= 0 && 
				(MEsquerda == 0 || MEsquerda >= CEsquerda) &&
				(MDireita == 0 || MDireita >= CDireira));
	}
	
	@Override
	public String toString() {
		String out = "";
		for(int i = 0; i < MEsquerda; i++){
			out += "M";
		}
		for(int i = 0; i < CEsquerda; i++){
			out += "C";
		}
		out += " | " + barco + " | ";
		for(int i = 0; i < MDireita; i++){
			out += "M";
		}
		for(int i = 0; i < CDireira; i++){
			out += "C";
		}	
		return out;
	}

}
