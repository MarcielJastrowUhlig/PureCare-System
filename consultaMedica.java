//Atributos: Data da consulta, nome do médico, motivo da consulta.

public class ConsultaMedica {
	private String dataConsulta;
	private String nomeMedico;
	private String motivoConsulta;
	
	public ConsultaMedica(String dataConsulta, String nomeMedico, String motivoConsulta) {
		this.dataConsulta = dataConsulta;
		this.nomeMedico = nomeMedico;
		this.motivoConsulta = motivoConsulta;
	}

	@Override
	public String toString() {
		return "ConsultaMedica [dataConsulta=" + dataConsulta + ", nomeMedico=" + nomeMedico + ", motivoConsulta="
				+ motivoConsulta + "]";
	}

	public String getDataConsulta() {
		return dataConsulta;
	}

	public void setDataConsulta(String dataConsulta) {
		this.dataConsulta = dataConsulta;
	}

	public String getNomeMedico() {
		return nomeMedico;
	}

	public void setNomeMedico(String nomeMedico) {
		this.nomeMedico = nomeMedico;
	}

	public String getMotivoConsulta() {
		return motivoConsulta;
	}

	public void setMotivoConsulta(String motivoConsulta) {
		this.motivoConsulta = motivoConsulta;
	}
}