package pessoas;

public class Fornecedor extends Externo{
	private String cnpj;
	
	public Fornecedor(String nome, String telefone, String endereco, String cnpj) {
		super(nome, telefone, endereco);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	
}
