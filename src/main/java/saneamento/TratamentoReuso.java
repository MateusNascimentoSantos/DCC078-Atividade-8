package saneamento;

public class TratamentoReuso extends TratamentoAgua {

    public String pretratar() {
        return "Peneiramento/Tratamento biologico";
    }

    public int getTempoPretratamento() {
        return 120;
    }

    @Override
    public String getTipoCaptacao() {
        return "TratamentoReuso";
    }
}
