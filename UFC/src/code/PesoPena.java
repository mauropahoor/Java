package code;

public class PesoPena extends Lutador{
	public PesoPena(String nome, int idade, double peso) {
		super(nome, idade, peso);
	}
	
	public String categoriaLutador() {
		return "PesoPena";
	}
}
