package controller;

public class ThreadCalculaSomaLinha extends Thread {
	
	private int vetor[];
	
	public ThreadCalculaSomaLinha(int vetor[]) {
		this.vetor = vetor;
	}
	
	@Override
	public void run() {
		calcSomaLinha();
	}

	private void calcSomaLinha() {
		int soma = 0;
		
		for (int elemento : vetor) {
			soma += elemento;
		}
		
		System.out.println("ID #"+ getId() + " soma = "+ soma);
	}
}
