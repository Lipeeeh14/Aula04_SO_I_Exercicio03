package view;

import java.util.Random;

import controller.ThreadCalculaSomaLinha;

public class Main {

	public static void main(String[] args) {
		int matriz[][] = new int[3][5];
		int vetor[];
		Random numero = new Random();
		
		for (int l = 0; l < 3; l++) {
			for (int c = 0; c < 5; c++) {
				matriz[l][c] = numero.nextInt(10) + 1;
			}
		}
		
		for (int i = 0; i < 3; i++) {
			vetor = matriz[i];
			Thread tSoma = new ThreadCalculaSomaLinha(vetor);
			tSoma.start();
		}
	}

}
