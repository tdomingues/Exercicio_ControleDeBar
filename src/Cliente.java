
public class Cliente {
	
	private String nome;
	private String cpf;
	private int idade;
	private char genero;
	
	
	public Cliente(String nome, String cpf, int idade, char genero) {
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		this.genero = genero;
	}


	public String getNome() {
		return nome;
	}


	public String getCpf() {
		return cpf;
	}


	public int getIdade() {
		return idade;
	}


	public char getGenero() {
		return genero;
	}
	
	public String toString() {
		return "CLIENTE: " + getNome();
	}

}
