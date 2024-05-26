// Importação das classes:
package Principal;
import java.util.Locale;
import java.util.Scanner;

import ProjetoFuncionario.Funcionario;

public class ProjetoFuncionario {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Estanciando o Objeto:
		Funcionario func = new Funcionario();
		
		// Declaração das Variaveis:
		System.out.println("Digite o nome do funcionario: ");
		func.name = sc.nextLine();
		System.out.println("Digite o Salario Bruto do funcionario: ");
		func.salarioBruto = sc.nextDouble();
		System.out.println("Digite o Imposto: ");
		func.imposto = sc.nextDouble();
		
		// Resultados:
		System.out.printf("Funcionário %s , $ %.2f ", func.name,func.salarioLiquido());
		System.out.println();
		System.out.println("Qual percentual para aumentar o salário? ");
		func.porcentagem = sc.nextDouble();
		System.out.printf("Dados atualizados: %.2f" , func.aumentarSalario());
		
		
		sc.close();
		
	}

}
