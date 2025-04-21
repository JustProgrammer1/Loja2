package pessoas;

public class Vendedor extends Funcionario {

	private double comissao;

	public Vendedor(String nome, String telefone, String cadastro, double salario, double comissao) {
		super(nome, telefone, cadastro, salario);
		this.comissao = comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

	public double getComissao() {
		return comissao;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()  + "\nComissão: " + comissao;
	}
}
