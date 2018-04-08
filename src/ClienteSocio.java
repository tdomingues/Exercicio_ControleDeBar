
public class ClienteSocio extends Cliente{

	private int numeroSocio;

	public ClienteSocio(String nome, String cpf, int idade, char genero, int numeroSocio) {
		super(nome, cpf, idade, genero);
		this.numeroSocio = numeroSocio;
	}
	
	public int getNumeroSocio() {
		return numeroSocio;
	}
	
	public String toString() {
		return super.toString() + "e é sócio com número: " + getNumeroSocio();
	}

}
