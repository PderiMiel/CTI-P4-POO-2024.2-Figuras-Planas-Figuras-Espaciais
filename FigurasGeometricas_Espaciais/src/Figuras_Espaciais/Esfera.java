package Figuras_Espaciais;

public class Esfera {
	public double raio;
	public double volume;
	public double areaTotal;
	
	public Esfera() {
		
	}
	public void calcAreaTotal() {
		areaTotal = 4 * Math.PI * Math.pow(raio, 2);
	}
	public void calcVolume() {
		volume = (4 / 3) * Math.PI * Math.pow(raio, 3);
	}
	public void listaAtributos() {
		System.out.println("Raio é: " + raio);
		System.out.println("Área Total é: " + areaTotal);
		System.out.println("Volume é: " + volume);
	}
	
	public static void main(String[] args) {
		Esfera esfera = new Esfera();
		
		esfera.raio = 5;
		esfera.calcAreaTotal();
		esfera.calcVolume();
		esfera.listaAtributos();
	}

}
