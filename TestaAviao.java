package ExerciciosPOO;

public class TestaAviao {

	public static void main( String[] args) {
		
		Aviao cliente1 = new Aviao ();
		
		cliente1.nome = "Fernando";
		cliente1.numpassageiro = 10;
		cliente1.valorpassagem = 100.00;
		
		cliente1.irViajar();		
	System.out.println(" O nome do passageiro �: " +cliente1.nome );
	System.out.println(" O n�mero do passageiro �: " +cliente1.numpassageiro );
	System.out.println(" O valor da passagem � : " +cliente1.valorpassagem);
	}
}
