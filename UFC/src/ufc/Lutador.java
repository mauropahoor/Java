package ufc;

import java.util.Random;

public class Lutador {
	private String nome;
	private int idade;
	private double peso;
	
	public Lutador(String nome, int idade, double peso) {
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
	}
	
	public String toString(){
		return nome+"/"+idade+"/"+peso; 	
	}
	
	public String categoriaLutador() {
		return "Error";
		
	}
	public void sorteioLuta(Lutador [] x) {
		boolean sameInstance = false;
		int random = -1;
		do {
			Random rand = new Random();
			random = rand.nextInt(x.length);
			if(this instanceof MeioPesado && x[random] instanceof MeioPesado && this != x[random]) {
				sameInstance = true;
			}
			else if(this instanceof PesoMedio && x[random] instanceof PesoMedio && this != x[random]) {
				sameInstance = true;
			}
			else if(this instanceof PesoPena && x[random] instanceof PesoPena && this != x[random]) {
				sameInstance = true;
			}
			else if(this instanceof PesoPesado && x[random] instanceof PesoPesado && this != x[random]) {
				sameInstance = true;
			}
		}while(sameInstance != true);
		System.out.println(this.getLutador() + " vai lutar com " + x[random].getLutador());
	}
	public void possiveisLutas(Lutador [] x) {
		for(int i = 0; i < x.length; i++) {
			if(this instanceof MeioPesado && x[i] instanceof MeioPesado && this != x[i]) {
				System.out.println(this.getLutador() + " pode lutar com " + x[i].getLutador());
			}
			else if(this instanceof PesoMedio && x[i] instanceof PesoMedio && this != x[i]) {
				System.out.println(this.getLutador() + " pode lutar com " + x[i].getLutador());
			}
			else if(this instanceof PesoPena && x[i] instanceof PesoPena && this != x[i]) {
				System.out.println(this.getLutador() + " pode lutar com " + x[i].getLutador());
			}
			else if(this instanceof PesoPesado && x[i] instanceof PesoPesado && this != x[i]) {
				System.out.println(this.getLutador() + " pode lutar com " + x[i].getLutador());
			}
		}
	}
	public String getNome() {
		return nome;
	}
	public int getIdade() {
		return idade;
	}
	public double getPeso() {
		return peso;
	}
}
