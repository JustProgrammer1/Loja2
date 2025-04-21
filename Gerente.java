package pessoas;

public class Gerente extends Funcionario{
	
	private String area;
	
	public Gerente(String nome, String telefone, String cadastro, double salario,
			String area) {
		super(nome, telefone, cadastro, salario);
		this.area = area;
	}


	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}
	
	
}
