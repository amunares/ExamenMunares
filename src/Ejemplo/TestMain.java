package Ejemplo;

public class TestMain {

	public static void main(String[] args) {

		Cuadrado cuadrado = new Cuadrado(15);
		System.out.println("El area del cuadrado es: " + cuadrado.calcularArea());
		
		Rectangulo rectangulo = new Rectangulo(15, 10);
		System.out.println("El area del rectangulo es: " + rectangulo.calcularArea());
	}

}
