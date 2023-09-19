//Atributos: Horário de dormir, horário de acordar, duração.

public class Sono {
	private String horaDormir;
	private String horaAcordar;
	private String duracao;
	
	public Sono(String horaDormir, String horaAcordar, String duracao) {
		this.horaDormir = horaDormir;
		this.horaAcordar = horaAcordar;
		this.duracao = duracao;
	}

	@Override
	public String toString() {
		return "Sono [horaDormir=" + horaDormir + ", horaAcordar=" + horaAcordar + ", duracao=" + duracao + "]";
	}

	public String getHoraDormir() {
		return horaDormir;
	}

	public void setHoraDormir(String horaDormir) {
		this.horaDormir = horaDormir;
	}

	public String getHoraAcordar() {
		return horaAcordar;
	}

	public void setHoraAcordar(String horaAcordar) {
		this.horaAcordar = horaAcordar;
	}

	public String getDuracao() {
		return duracao;
	}

	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}
}
