package Figuras_Espaciais;

public class Piramide {
	
	public double base;
	public double perimetro;
	public double altura;
	public double lateral;
	public double areaTotal;
	public double volume;
	
	public Piramide() {
		
	}
	public void calcAreaTotal() {
		areaTotal = base * (perimetro + lateral) / 2;
	}
	public void calcVolume() {
		volume = (base * altura) / 3;
	}
	public void listaAtributos() {
		System.out.println("Base é: " + base);
		System.out.println("Perímetro é: " + perimetro);
		System.out.println("Altura é: " + altura);
		System.out.println("Altura Lateral é: " + lateral);
		System.out.println("Área Total é: " + areaTotal);
		System.out.println("Volume é: " + volume);
	}
	
	public static void main(String[] args) {
		Piramide piramide = new Piramide();
		
		piramide.base = 20;
		piramide.perimetro = 18;
		piramide.altura = 12;
		piramide.lateral = 10;
		piramide.calcAreaTotal();
		piramide.calcVolume();
		piramide.listaAtributos();
	}
}
