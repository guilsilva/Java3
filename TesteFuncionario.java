
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Gerente f1 = new Gerente();
		f1.setNome("Nico Steppat");
		f1.setCpf("222.222.222-22");
		f1.setSalario(2600.00);
		
		System.out.println(f1.getNome());
		System.out.println(f1.getBonificacao());

	}

}
