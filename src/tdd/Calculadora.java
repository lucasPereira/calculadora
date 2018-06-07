package tdd;

public class Calculadora {

	private Integer memoria;

	public Calculadora() {
		memoria = 0;
	}

	public int somar(int i, int j) {
		memoria = i + j;
		return memoria;
	}

	public int subtrair(int i, int j) {
		memoria = i - j;
		return memoria;
	}

	public int somar(int i) {
		memoria = memoria + i;
		return memoria;
	}

	public int subtrair(int i) {
		return memoria - i;
	}

}
