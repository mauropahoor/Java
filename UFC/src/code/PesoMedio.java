package code;

public class PesoMedio extends Lutador{
	public PesoMedio(String nome, int idade, double peso) {
		super(nome, idade, peso);
	}
	
	public String categoriaLutador() {
		return "PesoMedio";
	}
}
