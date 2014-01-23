package iabuscas.estrutura;

import java.util.LinkedList;

public class Fila<T> {

	private LinkedList<T> objetos = new LinkedList<>();
	
	public void insere(T t){
		objetos.add(t);
	}
	
	public T remove(){
		return objetos.removeFirst();
	}
	
	public boolean isVazia(){
		return objetos.isEmpty();
	}
	
	public boolean contemElemento(T t){
		for (T objeto : objetos) {
			if(objeto.equals(t)){
				return true;
			}
		}
		return false;
	}
}
