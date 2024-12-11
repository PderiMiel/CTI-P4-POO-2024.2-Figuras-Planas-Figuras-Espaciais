package Figuras_Espaciais;

public class Prisma {
	public double altura;
	public double base;
	public double largura;
	public double areaBase;
	public double areaLateral;
	public double areaFace;
	public double areaTotal;
	public double volume;
	
	public Prisma() {
		
	}
	public void calcAreaBase() {
		areaBase = base * largura;
	}
	public void calcAreaFace() {
		areaFace = base * altura;
	}
	public void calcAreaLateral() {
		areaLateral = 2 * (altura * base + altura * largura);
	}
	public void calcAreatotal() {
		calcAreaBase();
		calcAreaLateral();
		areaTotal = 2 * areaBase + areaLateral;
	}
	public void calcVolume() {
		calcAreaBase();
		volume = areaBase * altura;
	}
	public void listaAtributos() {
		System.out.println("Altura é: " + altura);
		System.out.println("Base é: " + base);
		System.out.println("Largura é: " + largura);
		System.out.println("Área da base é: " + areaBase);
		System.out.println("Área Lateral é: " + areaLateral);
		System.out.println("Volume é: " + volume);
		System.out.println("Área Total é: " + areaTotal);
	}
	
	public static void main(String[] args) {
		Prisma prisma = new Prisma();
		
		prisma.base = 5;
		prisma.largura = 3;
		prisma.altura = 10;
		prisma.calcAreaBase();
		prisma.calcAreaFace();
		prisma.calcAreaLateral();
		prisma.calcAreatotal();
		prisma.calcVolume();
		prisma.listaAtributos();
	}

}
