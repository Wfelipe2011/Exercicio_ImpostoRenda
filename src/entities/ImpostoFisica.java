package entities;

public class ImpostoFisica extends Individuo {
	
	private Double gastoSaude;

	public ImpostoFisica() {
		super();
	}

	public ImpostoFisica(String name, Double rendaAnual, Double gastoSaude) {
		super(name, rendaAnual);
		this.gastoSaude = gastoSaude;
	}

	public Double getGastoSaude() {
		return gastoSaude;
	}

	public void setGastoSaude(Double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}
	@Override
	public double impostoAnual() {
			double desconto = gastoSaude/ 2;
			if (rendaAnual >= 20000.00) {
				return (rendaAnual * 0.25) - desconto;
			}
			else {
				return (rendaAnual * 0.15) - desconto;	
			}
	}
}
