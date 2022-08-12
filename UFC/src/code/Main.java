package code;

import java.util.*;

public class Main {
	public static void main(String [] args) {
		int TAM = 3;
		
		ArrayList<Object> x = new ArrayList<Object>();
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < TAM; i++) {
			System.out.println("Digite o nome do lutador:");
			String nome = sc.next();
			System.out.println("Digite a idade do lutador:");
			int idade = sc.nextInt();
			System.out.println("Digite o peso do lutador:");
			double peso = sc.nextInt();
			if(peso <= 65) {
				x.add(new PesoPena(nome, idade, peso));
			}
			else if(peso <= 83.9) {
				x.add(new PesoMedio(nome, idade, peso));
			}
			else if(peso <= 93) {
				x.add(new MeioPesado(nome, idade, peso));
			}
			else if(peso <= 120.2) {
				x.add(new PesoPesado(nome, idade, peso));
			}
		}
		System.out.println("Digite um numero de 0 a " + (TAM - 1));
		int option = sc.nextInt();
		System.out.println(x.get(option));
		((Lutador)x.get(option)).possiveisLutas(x);
		System.out.println(x.get(option) + " vai lutar com " + ((Lutador)x.get(option)).sorteioLuta(x));
	}
}
