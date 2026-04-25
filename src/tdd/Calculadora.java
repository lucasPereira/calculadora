package tdd;

public class Calculadora {

	private Integer memoria;

	public Calculadora() {
		memoria = 0;
	}

	public int somar(int valorA, int valorB) {
		memoria = valorA + valorB;
		return memoria;
	}

	public int subtrair(int valorA, int valorB) {
		memoria = valorA - valorB;
		return memoria;
	}

	public int somar(int valor) {
		memoria = memoria + valor;
		return memoria;
	}

	public int subtrair(int valor) {
		return memoria - valor;
	}

}
