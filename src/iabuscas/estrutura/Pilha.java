package iabuscas.estrutura;

import java.util.LinkedList;
import java.util.List;

public class Pilha<T> {

	private List<T> objetos = new LinkedList<>();
	
	public void insere(T t){
		this.objetos.add(t);
	}
	
	public T remove(){
		return this.objetos.remove(this.objetos.size() - 1);
	}
	
	public boolean isVazia(){
		return this.objetos.isEmpty();
	}
	
	public boolean contemElemento(T t){
		return this.objetos.contains(t);
	}
}
