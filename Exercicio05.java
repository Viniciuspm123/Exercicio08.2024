package tarefa08;

/*Apresentar os resultados das potências de 3, variando
 *do expoente 0 até o expoente 15. Deve ser considerado 
 *que qualquer número elevado a zero é 1, e elevado a 1 
 *é ele próprio. Observe que neste exercício não pode ser 
 *utilizado o operador de exponenciação do portuguol (^).*/

public class Exercicio05 {
	public static void main(String[] args) {
		
		int numero = 3;
		
		int expoente = 0;
		
		int resultado = 1;
		
		System.out.println("3^0 = " + expoente);
		
		
		while (expoente < 15) {
			expoente++;
			
			resultado *= numero;
			
			System.out.println("3^" + expoente + " = " + resultado);
			
		}
	}

	
}
