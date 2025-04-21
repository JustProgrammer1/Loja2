package pessoas;

public abstract class Externo extends Pessoa{
	private String endereco;
	
	public Externo(String nome, String telefone, String endereco) {
		super(nome, telefone);
		this.endereco = endereco;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
}
