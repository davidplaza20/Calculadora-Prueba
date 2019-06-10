package co.com.supergiros.demo;

public class Calcular {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola soy David");

	}

	public double suma(double a, double b) {
		return a + b;

	}

	public double resta(double a, double b) {
		return a - b;

	}

	public double multiplicacion(double a, double b) {
		return a * b;

	}

	public double division(double a, double b) {
		if (b != 0) {
			return a / b;
		} else {
			return 0;

		}
	}

}
