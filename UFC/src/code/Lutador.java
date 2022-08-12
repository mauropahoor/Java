package code;

import java.util.*;

public abstract class Lutador{
	private String nome;
	private int idade;
	private double peso;
	
	public Lutador(String nome, int idade, double peso) {
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
	}
	
	public void possiveisLutas(ArrayList<Object> x) {
		for(int i = 0; i < x.size(); i++) {
			if(this instanceof MeioPesado && x.get(i) instanceof MeioPesado && this != x.get(i)) {
				System.out.println(this + " pode lutar com " + x.get(i));
			}
			else if(this instanceof PesoMedio && x.get(i) instanceof PesoMedio && this != x.get(i)) {
				System.out.println(this + " pode lutar com " + x.get(i));
			}
			else if(this instanceof PesoPena && x.get(i) instanceof PesoPena && this != x.get(i)) {
				System.out.println(this + " pode lutar com " + x.get(i));
			}
			else if(this instanceof PesoPesado && x.get(i) instanceof PesoPesado && this != x.get(i)) {
				System.out.println(this + " pode lutar com " + x.get(i));
			}
		}
	}
	
	public Object sorteioLuta(ArrayList<Object> x) {
		ArrayList<Object> sameCategory = new ArrayList<Object>();
		
		for(int i = 0; i < x.size(); i++) {
			if(this instanceof MeioPesado && x.get(i) instanceof MeioPesado && this != x.get(i)) {
				sameCategory.add(x.get(i));
			}
			else if(this instanceof PesoMedio && x.get(i) instanceof PesoMedio && this != x.get(i)) {
				sameCategory.add(x.get(i));
			}
			else if(this instanceof PesoPena && x.get(i) instanceof PesoPena && this != x.get(i)) {
				sameCategory.add(x.get(i));
			}
			else if(this instanceof PesoPesado && x.get(i) instanceof PesoPesado && this != x.get(i)) {
				sameCategory.add(x.get(i));
			}
		}
		
		Random rand = new Random();
		int random = rand.nextInt(sameCategory.size());
		return sameCategory.get(random);
	}
	
	public abstract String categoriaLutador();
	
	public String toString() {
		return nome+"/"+idade+"/"+peso;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
}
