package ExerciciosPOO;

public class TestaDados {

	public static void main(String[] args) {
		
		Funcionario4 nx0 = new Funcionario4 ();
		
		nx0.fichafuncionario = 155;
		nx0.nome = "Fernando Fonseca";
		nx0.salario = 66600;
		nx0.desligado = false;
		
		nx0.funcionario4();
		System.out.println("O n�mero da ficha do funcion�rio: " +nx0.fichafuncionario);
		System.out.println("O nome do funcon�rio �: " +nx0.nome);
		System.out.println("O sal�rio bruto do funcion�rio �: " +nx0.salario);
		System.out.println("O funcion�rio est� desligado? " +nx0.desligado);
		
	}

}
