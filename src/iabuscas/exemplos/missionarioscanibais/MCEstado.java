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
		if(MEsquerda == 3){
			out = "MMM";
		}
		if(MEsquerda == 2){
			out = "MM";
		}
		if(MEsquerda == 1){
			out = "M";
		}
		if(CEsquerda == 3){
			out += "CCC";
		}
		if(CEsquerda == 2){
			out += "CC";
		}
		if(CEsquerda == 1){
			out += "C";
		}
		
		out += " | ";
		out += barco;
		out += " | ";
		
		if(MDireita == 3){
			out += "MMM";
		}
		if(MDireita == 2){
			out += "MM";
		}
		if(MDireita == 1){
			out += "M";
		}
		if(CDireira == 3){
			out += "CCC";
		}
		if(CDireira == 2){
			out += "CC";
		}
		if(CDireira == 1){
			out += "C";
		}
		
		return out;
	}

}
