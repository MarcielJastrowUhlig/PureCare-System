package Classes;
//Atributos: Tipo de marco, descrição, data.

public class Desenvolvimento {
	private String tipoMarco;
	private String descricao;
	private String dataDesenvolvimento;

	public Desenvolvimento(String tipoMarco, String descricao, String dataDesenvolvimento) {
		this.tipoMarco = tipoMarco;
		this.descricao = descricao;
		this.dataDesenvolvimento = dataDesenvolvimento;
	}

	@Override
	public String toString() {
		return "Desenvolvimento [tipoMarco=" + tipoMarco + ", descricao=" + descricao + ", dataDesenvolvimento="
				+ dataDesenvolvimento + "]";
	}

	public String getDataDesenvolvimento() {
		return dataDesenvolvimento;
	}

	public void setDataDesenvolvimento(String dataDesenvolvimento) {
		this.dataDesenvolvimento = dataDesenvolvimento;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getTipoMarco() {
		return tipoMarco;
	}

	public void setTipoMarco(String tipoMarco) {
		this.tipoMarco = tipoMarco;
	}
}
