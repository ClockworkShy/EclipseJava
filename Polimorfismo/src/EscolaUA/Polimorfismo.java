package EscolaUA;

public class Polimorfismo { // Essa bloquinho e classe vai ser o resultado 

	public static void main (String[] args) {
		Alunas a1 = new Mei();
		Alunas a2 = new Ochako(); // Essas são as variaveis da herança
		Alunas a3 = new Toga();
		
		a1.atacar();
		a2.atacar(); //Essas são as váriaveis do void das classe filhas
		a3.atacar();
	}
}
