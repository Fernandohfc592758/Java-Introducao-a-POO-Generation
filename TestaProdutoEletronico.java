package ExerciciosPOO;

public class TestaProdutoEletronico {

	public static void main(String[] args) {
		
		ProdutoEletronico calculadoraPlus = new ProdutoEletronico ();
		
		calculadoraPlus.marca = "Fonseca";
		calculadoraPlus.pre�o = 190;
		calculadoraPlus.digitos = 23;
		
		calculadoraPlus.venderProduto();
		
		System.out.println(" O nome da marca �: " +calculadoraPlus.marca);
		System.out.println(" O pre�o da calculadora �: " +calculadoraPlus.pre�o);
		System.out.println(" A calculadora tem : " + calculadoraPlus.digitos + " Digitos ");
		

	}

}
