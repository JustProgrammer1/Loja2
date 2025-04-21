package pessoas;

public class Cliente extends Externo{
	private String cpf;
	
	public Cliente(String nome, String telefone, String endereco, String cpf) {
		super(nome, telefone, endereco);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
	
}
