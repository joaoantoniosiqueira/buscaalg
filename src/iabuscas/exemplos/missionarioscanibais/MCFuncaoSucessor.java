package iabuscas.exemplos.missionarioscanibais;

import java.util.ArrayList;
import java.util.List;

import iabuscas.buscas.FuncaoSucessor;
import iabuscas.buscas.Nodo;

public class MCFuncaoSucessor implements FuncaoSucessor{

	@Override
	public List<Nodo> gerarSucessores(Nodo nodo) {
		List<Nodo> sucessores = new ArrayList<>();
		MCEstado estado = (MCEstado) nodo.getEstado();
		
		if(estado.getBarco() == 'E'){
			MCEstado novoEstado1 = new MCEstado(estado.getMEsquerda() - 1, estado.getCEsquerda(), 'D', estado.getMDireita() + 1, estado.getCDireira());
			if(novoEstado1.isAcaoValida()){
				sucessores.add(new Nodo(novoEstado1, nodo, new MCAcao("Um missionario para o lado direito do rio")));
			}
			
			MCEstado novoEstado2 = new MCEstado(estado.getMEsquerda() - 2, estado.getCEsquerda(), 'D', estado.getMDireita() + 2, estado.getCDireira());
			if(novoEstado2.isAcaoValida()){
				sucessores.add(new Nodo(novoEstado2, nodo, new MCAcao("Dois missionarios para o lado direito do rio")));
			}
			
			MCEstado novoEstado3 = new MCEstado(estado.getMEsquerda() - 1, estado.getCEsquerda() - 1, 'D', estado.getMDireita() + 1, estado.getCDireira() + 1);
			if(novoEstado3.isAcaoValida()){
				sucessores.add(new Nodo(novoEstado3, nodo, new MCAcao("Um missionario e um canibal para o lado direito do rio")));
			}
			
			MCEstado novoEstado4 = new MCEstado(estado.getMEsquerda(), estado.getCEsquerda() - 1, 'D', estado.getMDireita(), estado.getCDireira() + 1);
			if(novoEstado4.isAcaoValida()){
				sucessores.add(new Nodo(novoEstado4, nodo, new MCAcao("Um canibal para o lado direito do rio")));
			}
			
			MCEstado novoEstado5 = new MCEstado(estado.getMEsquerda(), estado.getCEsquerda() - 2, 'D', estado.getMDireita(), estado.getCDireira() + 2);
			if(novoEstado5.isAcaoValida()){
				sucessores.add(new Nodo(novoEstado5, nodo, new MCAcao("Dois canibais para o lado direito do rio")));
			}
		}
		else{
			MCEstado novoEstado1 = new MCEstado(estado.getMEsquerda() + 1, estado.getCEsquerda(), 'E', estado.getMDireita() - 1, estado.CDireira);
			if(novoEstado1.isAcaoValida()){
				sucessores.add(new Nodo(novoEstado1, nodo, new MCAcao("Um missionario para o lado esquerdo do rio")));
			}
			
			MCEstado novoEstado2 = new MCEstado(estado.getMEsquerda() + 2, estado.getCEsquerda(), 'E', estado.getMDireita() - 2, estado.getCDireira());
			if(novoEstado2.isAcaoValida()){
				sucessores.add(new Nodo(novoEstado2, nodo, new MCAcao("Dois missionarios para o lado esquerdo do rio")));
			}
			
			MCEstado novoEstado3 = new MCEstado(estado.getMEsquerda() + 1, estado.getCEsquerda() + 1, 'E', estado.getMDireita() - 1, estado.CDireira - 1);
			if(novoEstado3.isAcaoValida()){
				sucessores.add(new Nodo(novoEstado3, nodo, new MCAcao("Um missionario e um canibal para o lado esquerdo do rio")));
			}
			
			MCEstado novoEstado4 = new MCEstado(estado.getMEsquerda(), estado.getCEsquerda() + 1, 'E', estado.getMDireita(), estado.CDireira - 1);
			if(novoEstado4.isAcaoValida()){
				sucessores.add(new Nodo(novoEstado4, nodo, new MCAcao("Um canibal para o lado esquerdo do rio")));
			}
			
			MCEstado novoEstado5 = new MCEstado(estado.getMEsquerda(), estado.getCEsquerda() + 2, 'E', estado.getMDireita(), estado.CDireira - 2);
			if(novoEstado5.isAcaoValida()){
				sucessores.add(new Nodo(novoEstado5, nodo, new MCAcao("Dois canibais para o lado esquerdo do rio")));
			}
		}
		
		return sucessores;
	}
}
