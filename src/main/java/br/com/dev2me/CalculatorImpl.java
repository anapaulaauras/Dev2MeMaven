package br.com.dev2me;

public class CalculatorImpl implements Calculator {

	public int sum(int a, int b) {
		return a + b;
	}

	public int subtraction(int a, int b) {
		return a - b;
	}

	public int multiplication(int a, int b) {
		return a * b;
	}

	public int divison(int a, int b) {
		return a / b;
	}

	public boolean equalIntegers(int a, int b) {
		return a == b;
	}

}
