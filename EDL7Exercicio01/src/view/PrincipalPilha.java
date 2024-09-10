package view;
import controller.ControllerPilha;
public class PrincipalPilha {
	public static void main (String [] args) {
		
		ControllerPilha pCont = new ControllerPilha();
		
		int[] vetor = {100, 200, 1, 50, 39, 44, 25, 16, 99, 45, 33, 18, 102, 92};
		int tamanhoVetor = vetor.length;
		pCont.Algoritmo(vetor, tamanhoVetor);
		
	}

}
