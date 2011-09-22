
public class Calculadora2 {

	public static int somar(int[] valores) {
		int somatorio = 0;
		
		for(int i=0; i < 3; i++){
			somatorio = somatorio + valores[i];
		}
		return somatorio;
	}

	public static int multiplicar(int[] valores) {
		int multiplicacao = 1;
		
		for(int i=0; i < 3; i++){
			multiplicacao = multiplicacao * valores[i];
		}
		return multiplicacao;
	}

	public static int subtrair(int[] valores) {
		int subtracao = 0;
		
		for(int i=0; i < 3; i++){
			subtracao = subtracao - valores[i];
		}
		return subtracao;
	}

}
