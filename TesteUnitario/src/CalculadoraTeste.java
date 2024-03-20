
public class CalculadoraTeste {

	public static void main(String[] args) {
		Calculadora cal = new Calculadora();
		int resultadoEsperado = 3;
		int resultado = cal.somar(3,3);
		if(resultadoEsperado==resultado) {
			System.out.println("Teste Ok");
		}else {
			System.out.println("Teste falhou");
		}
		 resultadoEsperado = 2;
		 resultado = cal.subtrair(2,0);
		if(resultadoEsperado==resultado) {
			System.out.println("Teste Ok");
		}else {
			System.out.println("Teste falhou");
		
	}
		resultadoEsperado = 5;
		 resultado = cal.dividir(10,2);
		if(resultadoEsperado==resultado) {
			System.out.println("Teste Ok");
		}else {
			System.out.println("Teste falhou");

}
		resultadoEsperado = 10;
		 resultado = cal.multiplicar(2,10);
		if(resultadoEsperado==resultado) {
			System.out.println("Teste Ok");
		}else {
			System.out.println("Teste falhou");
}
	}
}
		