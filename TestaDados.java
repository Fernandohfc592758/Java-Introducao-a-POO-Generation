package ExerciciosPOO;

public class TestaDados {

	public static void main(String[] args) {
		
		Funcionario4 nx0 = new Funcionario4 ();
		
		nx0.fichafuncionario = 155;
		nx0.nome = "Fernando Fonseca";
		nx0.salario = 66600;
		nx0.desligado = false;
		
		nx0.funcionario4();
		System.out.println("O número da ficha do funcionário: " +nx0.fichafuncionario);
		System.out.println("O nome do funconário é: " +nx0.nome);
		System.out.println("O salário bruto do funcionário é: " +nx0.salario);
		System.out.println("O funcionário está desligado? " +nx0.desligado);
		
	}

}
