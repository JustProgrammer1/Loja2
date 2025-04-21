package pessoas;

import java.util.Scanner;

public class Executa {

	public static void main(String[] args) {
			
		Vendedor vendedor = new Vendedor("João", "(47) 98471-4444", "AB12345", 
				2500.0, 1000.0);
		
//		Gerente gerente = new Gerente(null, null, null, 0, null);
		
	 System.out.println(vendedor.toString());
		
		
		
//		vendedor.setComissao(1200.0);
//		vendedor.setNome("Maria");
		

	}

}
