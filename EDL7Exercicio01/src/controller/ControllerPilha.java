package controller;
import maryanalib.pilhaint.*;

public class ControllerPilha {
	public ControllerPilha() {
		super();
	}
	
	Pilha p = new Pilha();
	
	public void  Algoritmo (int[] vet, int tamanhoVetor) {
		for (int i = 0 ; i < tamanhoVetor ; i++) {
			if (p.isEmpty()) {
				p.push(vet[i] - 10);
				
			} else if (vet[i] % 5 == 0) {
				p.push(vet[i]/5);
				
			} else if (vet[i] % 3 == 0) {
				p.push(vet[i]*3);
				
			} else {
				int v1 = p.pop();
				System.out.println("v1/2 =" + v1/2);
			}
		}
				
	}

}
