package ExerciciosPOO;

public class TestaProdutoEletronico {

	public static void main(String[] args) {
		
		ProdutoEletronico calculadoraPlus = new ProdutoEletronico ();
		
		calculadoraPlus.marca = "Fonseca";
		calculadoraPlus.preço = 190;
		calculadoraPlus.digitos = 23;
		
		calculadoraPlus.venderProduto();
		
		System.out.println(" O nome da marca é: " +calculadoraPlus.marca);
		System.out.println(" O preço da calculadora é: " +calculadoraPlus.preço);
		System.out.println(" A calculadora tem : " + calculadoraPlus.digitos + " Digitos ");
		

	}

}
