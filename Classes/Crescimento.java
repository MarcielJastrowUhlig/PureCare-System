package Classes;
//Atributos: Peso, altura, circunferência da cabeça, data.

public class Crescimento {
	private double pesoCresc;
	private double alturaCresc;
	private double circunferenciaCabeca;
	private String dataCresc;

	public Crescimento(double pesoCresc, double alturaCresc, double circunferenciaCabeca, String dataCresc) {
		this.pesoCresc = pesoCresc;
		this.alturaCresc = alturaCresc;
		this.circunferenciaCabeca = circunferenciaCabeca;
		this.dataCresc = dataCresc;
	}

	public double getPesoCresc() {
		return pesoCresc;
	}

	@Override
	public String toString() {
		return "Crescimento [pesoCresc=" + pesoCresc + ", alturaCresc=" + alturaCresc + ", circunferenciaCabeca="
				+ circunferenciaCabeca + ", dataCresc=" + dataCresc + "]";
	}

	public void setPesoCresc(double pesoCresc) {
		this.pesoCresc = pesoCresc;
	}

	public double getAlturaCresc() {
		return alturaCresc;
	}

	public void setAlturaCresc(double alturaCresc) {
		this.alturaCresc = alturaCresc;
	}

	public double getCircunferenciaCabeca() {
		return circunferenciaCabeca;
	}

	public void setCircunferenciaCabeca(double circunferenciaCabeca) {
		this.circunferenciaCabeca = circunferenciaCabeca;
	}

	public String getDataCresc() {
		return dataCresc;
	}

	public void setDataCresc(String dataCresc) {
		this.dataCresc = dataCresc;
	}
}