package Ejemplo;

public class PruebaCuadrado {

	public static void main(String[] args) {
	  //  String colorDelCuadrado;
     //   double ladoDelCuadrado;
     //   colorDelCuadrado="Rojo";
     //   ladoDelCuadrado=5;
//        Cuadrado cuadrado = new Cuadrado(colorDelCuadrado, ladoDelCuadrado);

  //      System.out.printf("El área del cuadrado %s es: %f", cuadrado.getColor(), cuadrado.calcularArea());
        
        Cuadrado cuadrado = new Cuadrado(5);
        Rectangulo rectangulo = new Rectangulo(4,2);
        Triangulo triangulo = new Triangulo(6,2);

        System.out.printf("El área del cuadrado es: %f", cuadrado.calcularArea());
        System.out.printf("El área del rectangulo es: %f", rectangulo.calcularArea());
        System.out.printf("El área del tiangulo es: %f", triangulo.calcularArea());
		        
		// TODO Auto-generated method stub

	}

}
