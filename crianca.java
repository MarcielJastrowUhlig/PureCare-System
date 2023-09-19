//Atributos: ID, nome, data de nascimento, gênero, alergias, condições médicas.

public class Crianca {
    private String nomeCrianca;
    private String dataNascimentoCrianca;
    private boolean generoCrianca;
    private String alergiasCrianca;
    private String condicoesMediacas;

    public Crianca(String nomeCrianca, String dataNascimentoCrianca, Boolean generoCrianca, String alergiasCrianca,
            String condicoesMediacas) {
        this.nomeCrianca = nomeCrianca;
        this.dataNascimentoCrianca = dataNascimentoCrianca;
        this.generoCrianca = generoCrianca;
        this.alergiasCrianca = alergiasCrianca;
        this.condicoesMediacas = condicoesMediacas;
    }

    @Override
    public String toString() {
        return "Crianca [nomeCrianca=" + nomeCrianca + ", dataNascimentoCrianca=" + dataNascimentoCrianca
                + ", generoCrianca=" + generoCrianca + ", alergiasCrianca=" + alergiasCrianca + ", condicoesMediacas="
                + condicoesMediacas + "]";
    }

    public String getNomeCrianca() {
        return nomeCrianca;
    }

    public void setNomeCrianca(String nomeCrianca) {
        this.nomeCrianca = nomeCrianca;
    }

    public String getDataNascimentoCrianca() {
        return dataNascimentoCrianca;
    }

    public void setDataNascimentoCrianca(String dataNascimentoCrianca) {
        this.dataNascimentoCrianca = dataNascimentoCrianca;
    }

    public boolean isGeneroCrianca() {
        return generoCrianca;
    }

    public void setGeneroCrianca(boolean generoCrianca) {
        this.generoCrianca = generoCrianca;
    }

    public String getAlergiasCrianca() {
        return alergiasCrianca;
    }

    public void setAlergiasCrianca(String alergiasCrianca) {
        this.alergiasCrianca = alergiasCrianca;
    }

    public String getCondicoesMediacas() {
        return condicoesMediacas;
    }

    public void setCondicoesMediacas(String condicoesMediacas) {
        this.condicoesMediacas = condicoesMediacas;
    }
}