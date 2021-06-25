package models;

public class Circulo extends Forma {
	
	private int raio;

	@Override
	public double calcularArea() {
		final double PI = 3.1416;
		
		return PI * (this.raio*this.raio);
		
	}

	public int getRaio() {
		return raio;
	}

	public void setRaio(int raio) {
		
		this.raio = raio;
	}

	@Override
	public String toString() {
		return "Circulo [raio=" + raio + " Area="+this.calcularArea() +" ]"  ;
	}
	
	

}
