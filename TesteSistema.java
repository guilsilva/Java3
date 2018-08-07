
public class TesteSistema {

	public static void main(String[] args) {

		Gerente g = new Gerente();
		g.setSenha(222);
		
		Administrador adm = new Administrador();
		adm.autentica(333);
		
		Cliente cliente = new Cliente();
		cliente.autentica(444);
		
		SistemaInterno si = new SistemaInterno();
		si.autentica(g);
		si.autentica(adm);
		si.autentica(cliente);

	}

}
