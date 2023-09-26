package Classes;
//Atributos: Nome da vacina, data da próxima dose, data da última dose.

public class Vacinas {
	private String nomeVacina;
	private String dataProxVacina;
	private String dataUltDose;

	public Vacinas(String nomeVacina, String dataProxVacina, String dataUltDose) {
		this.nomeVacina = nomeVacina;
		this.dataProxVacina = dataProxVacina;
		this.dataUltDose = dataUltDose;
	}

	@Override
	public String toString() {
		return "Vacinas [nomeVacina=" + nomeVacina + ", dataProxVacina=" + dataProxVacina + ", dataUltDose="
				+ dataUltDose + "]";
	}

	public String getNomeVacina() {
		return nomeVacina;
	}

	public void setNomeVacina(String nomeVacina) {
		this.nomeVacina = nomeVacina;
	}

	public String getDataProxVacina() {
		return dataProxVacina;
	}

	public void setDataProxVacina(String dataProxVacina) {
		this.dataProxVacina = dataProxVacina;
	}

	public String getDataUltDose() {
		return dataUltDose;
	}

	public void setDataUltDose(String dataUltDose) {
		this.dataUltDose = dataUltDose;
	}
}