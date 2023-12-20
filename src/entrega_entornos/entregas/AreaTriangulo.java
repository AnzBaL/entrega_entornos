package entrega_entornos.entregas;

import java.util.Scanner;

public class AreaTriangulo {
	
	public static  void main(String[] args)
	{
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("--- AREA TRIANGULO ---");
		System.out.println("Introduce la base:");
		double base = entrada.nextDouble();
		System.out.println("Introduce la altura:");
		double altura = entrada.nextDouble();
		
		double area = areaTriangulo(base, altura);
		
		System.out.println("El area del triangulo es " + area);
		
	}
	
	////////////////////////////////////////////////////////////////////
	// METODOS
	
	// AREA TRIANGULO
	public static double areaTriangulo(double base, double altura)
	{
		return (base * altura) / 2;
	}
	
	// AREA Y PERIMETRO CIRCULO
	public static double areaCircunferencia(double radio) {

		return Math.PI * Math.pow(radio, 2);
	}
	
	public static double perimetroCircunferencia(double radio) {

		return Math.PI * (radio * 2);
	}
	
	// AREA CILINDRO
	public static double areaCilindro(double radio, double altura)
	{
		return 2 * Math.PI * radio * (radio + altura);
	}
	
	//AREA RECTANGULO
	public static double areaRectangulo(double base, double altura)
	{
		return base * altura;
	}

}