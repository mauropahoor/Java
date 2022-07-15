package ufc;

import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int TAM = 10;
		
		Lutador [] x = new Lutador[TAM];
		for(int i = 0; i < TAM; i++) {
			System.out.println("Digite o nome do lutador:");
			String nome = sc.next();
			System.out.println("Digite a idade do lutador:");
			int idade = sc.nextInt();
			System.out.println("Digite o peso do lutador:");
			double peso = sc.nextInt();
			if(peso <= 65) {
				x[i] = new PesoPena(nome, idade, peso);
			}
			else if(peso <= 83.9) {
				x[i] = new PesoMedio(nome, idade, peso);
			}
			else if(peso <= 93) {
				x[i] = new MeioPesado(nome, idade, peso);
			}
			else if(peso <= 120.2) {
				x[i] = new PesoPesado(nome, idade, peso);
			}
		}
		System.out.println("Escolha um lutador de 0 a " + (TAM - 1) + ":");
		int id = sc.nextInt();
		x[id].getLutador();
		x[id].possiveisLutas(x);
		x[id].sorteioLuta(x);
	}
}
