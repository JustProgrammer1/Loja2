package pessoas;

public abstract class Funcionario extends Pessoa {
	private String cadastro;
	private double salario;


	public Funcionario(String nome, String telefone, String cadastro, double salario) {
		super(nome, telefone);
		this.cadastro = cadastro;
		this.salario = salario;
	}

	public String getCadastro() {
		return cadastro;
	}

	public void setCadastro(String cadastro) {
		this.cadastro = cadastro;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "\nCadastro: " + cadastro + "\nSalario: " + salario;
	}
}
