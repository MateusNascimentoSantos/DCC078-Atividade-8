package saneamento;

public abstract class TratamentoAgua {

    private String estacao;
    protected int volumeLitros;

    public String getEstacao() {
        return estacao;
    }

    public void setEstacao(String estacao) {
        this.estacao = estacao;
    }

    public int getVolumeLitros() {
        return volumeLitros;
    }

    public void setVolumeLitros(int volumeLitros) {
        this.volumeLitros = volumeLitros;
    }

    public abstract String pretratar();

    public abstract int getTempoPretratamento();

    public String getEtapasPadrao() {
        return "Floculacao/Decantacao/Filtracao/Desinfeccao";
    }

    public int calcularTempoTotal() {
        return this.getTempoPretratamento() + 90;
    }

    public String getTipoCaptacao() {
        return "Tratamento";
    }

    public String tratar() {
        return getTipoCaptacao() + "{" +
                "estacao='" + this.estacao + '\'' +
                ", etapas=" + this.pretratar() + "/" + this.getEtapasPadrao() +
                ", tempoTotal=" + this.calcularTempoTotal() +
                '}';
    }
}
