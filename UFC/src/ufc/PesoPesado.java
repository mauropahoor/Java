package ufc;

public class PesoPesado extends Lutador{
	public PesoPesado(String nome, int idade, double peso) {
		super(nome, idade, peso);
	}
	public String categoriaLutador() {
		return "PesoPesado";
	}

}
