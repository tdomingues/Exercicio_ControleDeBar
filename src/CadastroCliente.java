import java.util.ArrayList;

public class CadastroCliente {
	public ArrayList<Cliente> listaClientes;
	public ArrayList<ClienteSocio> listaClientesSocios;

	
	public CadastroCliente() {
		listaClientes = new ArrayList<Cliente>();
		listaClientesSocios = new ArrayList<ClienteSocio>();
	}
	
	public void criaClientes(){
		 Cliente a = new Cliente("Maria", "212754670-91", 34, 'f');
		 Cliente b = new Cliente("Roberto", "145652398-25", 52, 'm');
		 Cliente c = new Cliente("João", "045867942-72", 22, 'm');
		 ClienteSocio aa = new ClienteSocio("Carlos", "248691670-84", 65, 'm', 45678);
		 ClienteSocio bb = new ClienteSocio("Joana", "019380750-56", 74, 'f', 75523);
		 
		 listaClientes.add(a);
		 listaClientes.add(b);
		 listaClientes.add(c);
		 listaClientesSocios.add(aa);
		 listaClientesSocios.add(bb);
	}
	
	public double getNumeroClientesNaoSocios() {
		return listaClientes.size();
	}
	
	public double getNumeroClientesSocios() {
		return listaClientesSocios.size();
	}
	
	public double getTotalNumeroClientes() {
		return getNumeroClientesNaoSocios() + getNumeroClientesSocios();		
	}
	
	public double getPorcentagemNumeroClientesNaoSocios() {
		return Math.round((getNumeroClientesNaoSocios()/getTotalNumeroClientes()) * 100);
	}
	
	public double getPorcentagemNumeroClientesSocios() {
		return Math.round((getNumeroClientesSocios()/getTotalNumeroClientes()) * 100);
	}
	
	public double getClientesMasculinos() {
		double cont = 0;
		
		for (int i = 0; i < listaClientes.size(); i++) {
			if (listaClientes.get(i).getGenero() == 'm') {
				cont++;				
			}
		}
		
		for (int i = 0; i < listaClientesSocios.size(); i++) {
			if (listaClientesSocios.get(i).getGenero() == 'm') {
				cont++;				
			}
		}
		
		return cont;
	}
	
	public double getClientesFemininos() {
		double cont = 0;
		
		for (int i = 0; i < listaClientes.size(); i++) {
			if (listaClientes.get(i).getGenero() == 'f') {
				cont++;				
			}
		}
		
		for (int i = 0; i < listaClientesSocios.size(); i++) {
			if (listaClientesSocios.get(i).getGenero() == 'f') {
				cont++;				
			}
		}
		
		return cont;
	}
	
	public double getPorcentagemClientesMasculinos() {
		return Math.round((getClientesMasculinos()/getTotalNumeroClientes()) * 100.0);
	}
	
	public double getPorcentagemClientesFemininos() {
		return Math.round((getClientesFemininos()/getTotalNumeroClientes()) * 100.0);
	}
	
	public boolean clienteEstaNoBar(String cpf) {
		for (int i = 0; i < listaClientes.size(); i++) {
			if (listaClientes.get(i).getCpf() == cpf) {
				return true;			
			}
		}
		
		for (int i = 0; i < listaClientesSocios.size(); i++) {
			if (listaClientesSocios.get(i).getCpf() == cpf) {
				return true;
			}
		}
		
		return false;
	}
	
	public boolean clienteVaiSair(String cpf) {
		for (int i = 0; i < listaClientes.size(); i++) {
			if (listaClientes.get(i).getCpf() == cpf) {
				listaClientes.remove(i);
				return true;
			}
		}
		
		for (int i = 0; i < listaClientesSocios.size(); i++) {
			if (listaClientesSocios.get(i).getCpf() == cpf) {
				listaClientesSocios.remove(i);
				return true;
			}
		}
		
		return false;
	}
	
	public String getNumeroClientesNoBar() {
		return "Há um total de " + getTotalNumeroClientes() + 
				" clientes no bar, sendo " + getNumeroClientesNaoSocios() + 
				" não sócios e " + getNumeroClientesSocios() + " sócios.";		
	}
	
	

}
