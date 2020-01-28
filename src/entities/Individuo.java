package entities;

public class Individuo {
	
	private String name;
	protected Double rendaAnual;
	
	public Individuo() {
	}

	public Individuo(String name, Double rendaAnual) {
		this.name = name;
		this.rendaAnual = rendaAnual;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getRendaAnual() {
		return rendaAnual;
	}

	public void setRendaAnual(Double rendaAnual) {
		this.rendaAnual = rendaAnual;
	}
	
	public double impostoAnual() {
		return 0;
	}

}
