package ProjetoFuncionario;

public class Funcionario {
	
	//Declaração dos Atributos
	public String name;
	public double salarioBruto;
	public double imposto;
	public double porcentagem;
	
	
	// Métodos
	public double salarioLiquido() {
		return salarioBruto - imposto;
		
	}
	
	public double aumentarSalario() {
		return salarioBruto * porcentagem + salarioLiquido();
		
	}

}
