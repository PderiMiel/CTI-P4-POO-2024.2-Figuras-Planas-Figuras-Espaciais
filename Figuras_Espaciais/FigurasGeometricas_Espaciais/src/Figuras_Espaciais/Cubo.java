package Figuras_Espaciais;

public class Cubo {
	public double aresta;
	public double areaTotal;
	public double areaLateral;
	public double volume;
	
	public Cubo() {
		
	}
	public void calcAreaTotal() {
		areaTotal = 6 * (aresta * aresta);
	}
	public void calcAreaLateral() {
		areaLateral = 4 * (aresta * aresta);
	}
	public void calcVolume() {
		volume = aresta * aresta * aresta;
	}
	public void listaAtributos() {
		System.out.println("Aresta é: " + aresta);
		System.out.println("Área é: " + areaTotal);
		System.out.println("Área Lateral é: " + areaLateral);
		System.out.println("Volume é: " + volume);
	}

	public static void main(String[] args) {
		Cubo cubo = new Cubo();
		
		cubo.aresta = 5;
		cubo.calcAreaTotal();
		cubo.calcVolume();
		cubo.listaAtributos();
	}
}