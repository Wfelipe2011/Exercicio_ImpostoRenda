package entities;

public class ImpostoJuridico extends Individuo {
	
	private Integer nFuncionarios;

	public ImpostoJuridico() {
		super();
	}

	public ImpostoJuridico(String name, Double rendaAnual, Integer nFuncionarios) {
		super(name, rendaAnual);
		this.nFuncionarios = nFuncionarios;
	}

	public Integer getnFuncionarios() {
		return nFuncionarios;
	}

	public void setnFuncionarios(Integer nFuncionarios) {
		this.nFuncionarios = nFuncionarios;
	}
	@Override
	public double impostoAnual() {
		if (nFuncionarios >= 10) {
			return rendaAnual * 0.14;
		}
		else {
			return rendaAnual * 0.16;	
		}
	}

}
