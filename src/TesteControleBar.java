import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TesteControleBar {

CadastroCliente a;
	
	@BeforeEach
	public void setUp() throws Exception {
		a = new CadastroCliente();
		a.criaClientes();;
	}
	
	@Test
	public void testaTotalPessoas() {
		double total = a.getTotalNumeroClientes();
		assertEquals(5, total, 0.1);
	}

	@Test
	public void testPorcentagemMasculina() {
		double porcentage = a.getPorcentagemClientesMasculinos();
		assertEquals(60.0, porcentage, 0.01);
	}

	@Test
	public void testaPorcentagemFeminina() {
		double porcentage = a.getPorcentagemClientesFemininos();
		assertEquals(40.0, porcentage, 0.01);
	}

	@Test
	public void testaClientesSocios() {
		double members = a.getNumeroClientesSocios();
		assertEquals(2, members, 0.1);
	}
	
	@Test
	public void testaNaoSocios() {
		double notMembers = a.getNumeroClientesNaoSocios();
		assertEquals(3, notMembers, 0.1);
	}
	
	@Test
	public void testaBuscaPorCPF(){
		boolean is = a.clienteEstaNoBar("212754670-91");
		assertEquals(true, is);
	}
	
	@Test
	public void testaSaidaCliente(){
		boolean is = a.clienteVaiSair("212754670-91");
		assertEquals(true, is);
	}
	
}
