package iabuscas.teste;

import iabuscas.exemplos.torrehanoi.TorreEstado;

public class TesteTorre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TorreEstado estado = new TorreEstado(5);

		estado.pino2.add(estado.pino1.remove(4));
		estado.pino3.add(estado.pino1.remove(3));
		
		System.out.println(estado);
		
	}
}
