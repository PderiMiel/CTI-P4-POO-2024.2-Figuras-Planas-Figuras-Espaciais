package Figuras_Espaciais;

public class Cone {
	
	public double raio;
	public double altura;
	public double geratriz;
	public double areaBase;
	public double areaLateral;
	public double areaTotal;
	public double volume;
	
	public Cone() {
		
	}
	public void calcGeratriz() {
		geratriz = Math.sqrt(Math.pow(raio, 2) + Math.pow(altura, 2));
	}
	private void calcAreaBase() {
		areaBase = Math.PI * Math.pow(raio, 2);
	}
	public void calcAreaLateral() {
		calcGeratriz();
		areaLateral = Math.PI * raio * geratriz;
	}
	public void calcAreaTotal() {
		calcAreaBase();
		calcAreaLateral();
		areaTotal = areaBase + areaLateral;
	}
	public void calcVolume() {
		calcAreaBase();
		volume = (Math.PI * Math.pow(raio, 2) * altura) / 3;
	}
	public void listaAtributos() {
		System.out.println("Raio é: " + raio);
		System.out.println("Altura é: " + altura);
		System.out.println("Geratriz é: " + geratriz);
		System.out.println("Área da Base é: " + areaBase);
		System.out.println("Área Lateral é: " + areaLateral);
		System.out.println("Área Total é: " + areaTotal);
		System.out.println("Volume é: " + volume);
	}

	public static void main(String[] args) {
		Cone cone = new Cone();
		
		cone.raio = 5;
		cone.altura = 12;
		cone.calcAreaTotal();
		cone.calcVolume();
		cone.listaAtributos();

	}

}
